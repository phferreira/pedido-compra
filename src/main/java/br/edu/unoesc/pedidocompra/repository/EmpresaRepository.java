package br.edu.unoesc.pedidocompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.pedidocompra.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
