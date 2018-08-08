package br.edu.unoesc.pedidocompra.regraspadrao;

import br.edu.unoesc.pedidocompra.model.Fornecedor;

public interface FornecedorRegraPadrao {
	void salvar(Fornecedor fornecedor);

	void delete(Fornecedor fornecedor);

	void atualizar(Fornecedor fornecedor);
}
