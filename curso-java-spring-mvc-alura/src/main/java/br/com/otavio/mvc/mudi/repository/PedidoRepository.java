package br.com.otavio.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.otavio.mvc.mudi.model.Pedido;
import br.com.otavio.mvc.mudi.model.StatusPedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	List<Pedido> findByStatus(StatusPedido status);		// o próprio Spring Data faz o select pra gente, ao colocar o nome certo
	
}
