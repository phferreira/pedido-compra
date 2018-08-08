package br.edu.unoesc.pedidocompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.pedidocompra.model.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {

}
