package br.edu.unoesc.pedidocompra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.unoesc.pedidocompra.model.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {
	@Query("select i from PedidoItem i left join fetch i.pedido left join fetch i.produto where i.pedido.codigo = :codigo ")
	List<PedidoItem> dadosGrid(@Param("codigo") Long codigo);
}
