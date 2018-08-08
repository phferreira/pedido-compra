package br.edu.unoesc.pedidocompra.regraspadrao;

import br.edu.unoesc.pedidocompra.model.Produto;

public interface ProdutoRegraPadrao {
	void salvar(Produto produto);

	void delete(Produto produto);

	void atualizar(Produto produto);
}
