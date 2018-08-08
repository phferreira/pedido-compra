package br.edu.unoesc.pedidocompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.pedidocompra.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
