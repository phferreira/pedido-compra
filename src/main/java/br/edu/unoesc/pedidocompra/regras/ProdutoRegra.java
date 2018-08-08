package br.edu.unoesc.pedidocompra.regras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.pedidocompra.model.Produto;
import br.edu.unoesc.pedidocompra.regraspadrao.ProdutoRegraPadrao;
import br.edu.unoesc.pedidocompra.repository.ProdutoRepository;

@Service
public class ProdutoRegra implements ProdutoRegraPadrao {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void salvar(Produto produto) {
		produtoRepository.save(produto);
	}

	@Override
	public void delete(Produto produto) {
		produtoRepository.delete(produto);
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub

	}

}
