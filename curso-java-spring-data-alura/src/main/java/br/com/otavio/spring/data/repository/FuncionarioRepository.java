package br.com.otavio.spring.data.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.otavio.spring.data.orm.Funcionario;
import br.com.otavio.spring.data.orm.FuncionarioProjecao;

@Repository
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Integer>, JpaSpecificationExecutor<Funcionario >{		// <Nome da Classe, Tipo do Id>
	
	List<Funcionario> findByNome(String nome);
	
	// consulta não está no padrão derivated query, por isso precisamos informar para o Spring Data que isso é uma query, fazemos isso com a anotação @Query, que recebe a consulta em JPQL.
	@Query("SELECT f FROM Funcionario f WHERE f.nome = :nome AND f.salario >= :salario AND f.data = :data")
	List<Funcionario> findNomeSalarioMaiorDataContratacao(String nome,Double salario, LocalDate data);		
	
	@Query(value = "SELECT * FROM funcionarios f WHERE f.data >= data", nativeQuery = true)		// o argumento nativeQuery informa que escrevemos a consulta conforme é feito no banco. Se não escrevermos isso ele entender que é um JPQL
	List<Funcionario> findDataContratacaoMaior(LocalDate data);
	
	@Query(value = "SELECT f.id, f.nome FROM funcionarios f" , nativeQuery = true)
	List<FuncionarioProjecao> findFuncionarioSalario();
	
	
}
