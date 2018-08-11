package br.edu.unoesc.pedidocompra.regraspadrao;

import java.util.List;

import br.edu.unoesc.pedidocompra.model.PedidoItem;

public interface PedidoItemRegraPadrao {

	void salvar(PedidoItem pedidoItem);

	void delete(PedidoItem pedidoItem);

	void atualizar(PedidoItem pedidoItem);

	List<PedidoItem> dadosGrid(Long codigo);

	PedidoItem localizar(Long codigo);
}
