package br.edu.unoesc.pedidocompra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoesc.pedidocompra.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	@Query("select p from Pedido p left join fetch p.empresa left join fetch p.fornecedor")
	List<Pedido> dadosGrid();
}
