package br.edu.unoesc.pedidocompra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoesc.pedidocompra.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	@Query("select f from Fornecedor f")
	List<Fornecedor> dadosGrid();
}
