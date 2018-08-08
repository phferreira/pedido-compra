package br.edu.unoesc.pedidocompra.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.pedidocompra.model.Empresa;
import br.edu.unoesc.pedidocompra.regraspadrao.EmpresaRegraPadrao;
import br.edu.unoesc.pedidocompra.repository.EmpresaRepository;

@Service
public class EmpresaRegra implements EmpresaRegraPadrao {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public void salvar(Empresa empresa) {
		empresaRepository.save(empresa);
	}

	@Override
	public void delete(Empresa empresa) {
		empresaRepository.delete(empresa);
	}

	@Override
	public void atualizar(Empresa empresa) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Empresa> dadosGrid() {
		return empresaRepository.dadosGrid();
	}

	@Override
	public Empresa buscarPorCodigo(Long codigo) {
		return empresaRepository.findById(codigo).orElse(new Empresa());
	}

}
