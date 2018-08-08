package br.edu.unoesc.pedidocompra.regraspadrao;

import br.edu.unoesc.pedidocompra.model.Pedido;

public interface PedidoRegraPadrao {
	void salvar(Pedido pedido);

	void delete(Pedido pedido);

	void atualizar(Pedido pedido);
}
