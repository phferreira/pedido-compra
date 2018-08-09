package br.edu.unoesc.pedidocompra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoesc.pedidocompra.model.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {
	@Query("select i                      " + 
           "  from PedidoItem i           " + 
//		   "  left join fetch i.cd_pedido " +
           " where i.codigo_pedido = :pedido ")
	List<PedidoItem> dadosGrid(Long pedido);
}
