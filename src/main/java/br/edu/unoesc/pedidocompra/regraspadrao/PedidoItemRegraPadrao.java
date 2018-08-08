package br.edu.unoesc.pedidocompra.regraspadrao;

import br.edu.unoesc.pedidocompra.model.PedidoItem;

public interface PedidoItemRegraPadrao {
	void salvar(PedidoItem pedidoItem);

	void delete(PedidoItem pedidoItem);

	void atualizar(PedidoItem pedidoItem);
}
