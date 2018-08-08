package br.edu.unoesc.pedidocompra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoesc.pedidocompra.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	@Query("select e from Empresa e")
	List<Empresa> dadosGrid();
}
