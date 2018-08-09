package br.edu.unoesc.pedidocompra.regraspadrao;

import java.util.List;

import br.edu.unoesc.pedidocompra.model.Fornecedor;

public interface FornecedorRegraPadrao {
	void salvar(Fornecedor fornecedor);

	void delete(Fornecedor fornecedor);

	void atualizar(Fornecedor fornecedor);
	
	List<Fornecedor> dadosGrid();

	Fornecedor buscarPorCodigo(Long codigo);
}
