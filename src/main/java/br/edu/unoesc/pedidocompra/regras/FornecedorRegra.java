package br.edu.unoesc.pedidocompra.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.pedidocompra.model.Fornecedor;
import br.edu.unoesc.pedidocompra.regraspadrao.FornecedorRegraPadrao;
import br.edu.unoesc.pedidocompra.repository.FornecedorRepository;

@Service
public class FornecedorRegra implements FornecedorRegraPadrao {

	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Override
	public void salvar(Fornecedor fornecedor) {
		fornecedorRepository.save(fornecedor);
	}

	@Override
	public void delete(Fornecedor fornecedor) {
		fornecedorRepository.delete(fornecedor);
	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Fornecedor> dadosGrid() {
		return fornecedorRepository.dadosGrid();
	}

	@Override
	public Fornecedor buscarPorCodigo(Long codigo) {
		return fornecedorRepository.findById(codigo).orElse(new Fornecedor());
	}

}
