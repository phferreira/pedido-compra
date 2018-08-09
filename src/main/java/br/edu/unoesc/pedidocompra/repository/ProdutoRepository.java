package br.edu.unoesc.pedidocompra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoesc.pedidocompra.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	@Query("select p from Produto p")
	List<Produto> dadosGrid();
}
