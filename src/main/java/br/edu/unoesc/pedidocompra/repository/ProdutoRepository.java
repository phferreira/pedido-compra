package br.edu.unoesc.pedidocompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.pedidocompra.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
