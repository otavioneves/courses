package br.com.otavio.loja.dao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.otavio.loja.modelo.Produto;

public class ProdutoDAO {

	private EntityManager em;

	public ProdutoDAO(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}

	public void atualizar(Produto produto) {
		this.em.merge(produto);
	}

	public void remover(Produto produto) {
		produto = em.merge(produto);
		this.em.remove(produto);
	}

	public Produto buscarPorId(int id) {
		return em.find(Produto.class, id); // busca a entidade pelo id
	}

	public List<Produto> buscarTodos() {
		String jpql = "SELECT p FROM Produto p"; // o nome na consulta não é da tabela e sim o nome da entidade. Seguido
													// de um alias. Carregue o objeto p (que é a entidade Produto)
		return em.createQuery(jpql, Produto.class).getResultList(); // o método cretadeQuery não faz a consulta, ele
																	// apenas prepara. Precisamos do método
																	// getResultList para executar a consulta, que nesse
																	// caso devolverá um List de Produtos.
	}

	public List<Produto> buscarPorNome(String nome) {
		String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome"; // após o where, utilizamos o alias, seguido de
																		// ponto e o nome do atributo na classe, não da
																		// coluna do banco de dados
		return em.createQuery(jpql, Produto.class).setParameter("nome", nome).getResultList(); // com o método
																								// setParameter iremos
																								// substituir o nome
																								// pelo nome na consulta
	}

	public List<Produto> buscarPorCategoria(String nome) {
		String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome"; // ao colocarmos p.categoria.nome ele já
																				// faz o join e busca o atributo nome da
																				// tabela categoria
		return em.createQuery(jpql, Produto.class).setParameter("nome", nome).getResultList();
	}

	public BigDecimal buscarPrecoDoProdutoComNome(String nome) {
		String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nome"; // ao colocarmos p.preco, o JPA já entende
																			// que na query traremos apenas os preços
		return em.createQuery(jpql, BigDecimal.class).setParameter("nome", nome).getSingleResult(); // utilizamos o
																									// método
																									// getSingleResult
																									// que não retorna
																									// um List, como o
																									// .getResultList,
																									// mas sim um único
																									// registro.
	}

//	OU PODEMOS PASSAR POR INTERROGAÇÃO SEGUIDO DA NUMERAÇÃO EM ORDEM
//	public List<Produto> buscarPorNome(String nome){
//		String jpql = "SELECT p FROM Produto p WHERE p.nome = ?1";
//		return em.createQuery(jpql, Produto.class).setParameter(1,nome).getResultList();
//	}

	public List<Produto> buscarPorParametros(String nome, BigDecimal preco, LocalDate dataCadastro) {
		String jpql = "SELECT p FROM Produto p  WHERE 1=1 "; // gambiarra para deixar o WHERE fixo na consulta, e ir
																// colocando o AND nos if

		if (nome != null && !nome.trim().isEmpty()) {
			jpql = "AND p.nome = :nome ";
		}
		if (preco != null) {
			jpql = "AND p.nome = :nome ";
		}
		if (dataCadastro != null) {
			jpql = "AND p.nome = :nome ";
		}

		TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);

		if (nome != null && !nome.trim().isEmpty()) {
			query.setParameter("nome", nome);
		}
		if (preco != null) {
			query.setParameter("preco", preco);
		}
		if (dataCadastro != null) {
			query.setParameter("dataCadastro", dataCadastro);
		}

		return query.getResultList();
	}
	
	public List<Produto> buscarPorParametrosComCriteria(String nome, BigDecimal preco, LocalDate dataCadastro) {
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		
		CriteriaQuery<Produto> query = builder.createQuery(Produto.class);
		
		Root<Produto> from = query.from(Produto.class);		// da onde vai disparar o from
		
		Predicate filtros = builder.and();		// objeto que faz os ands, que vai grudando os ands
		
		if (nome != null && !nome.trim().isEmpty()) {
			filtros = builder.and(filtros, builder.equal(from.get("nome"), nome));
		}
		if (preco != null) {
			filtros = 	builder.and(filtros, builder.equal(from.get("preco"), preco));
		}
		if (dataCadastro != null) {
			filtros = 	builder.and(filtros, builder.equal(from.get("dataCadastro"), dataCadastro));
		}
		
		query.where(filtros);
		
		return em.createQuery(query).getResultList();
		
	}
}
