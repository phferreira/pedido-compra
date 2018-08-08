package br.edu.unoesc.pedidocompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.pedidocompra.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
