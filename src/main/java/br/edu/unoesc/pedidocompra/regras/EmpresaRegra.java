package br.edu.unoesc.pedidocompra.regras;

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

}
