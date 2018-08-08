package br.edu.unoesc.pedidocompra.regras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.pedidocompra.model.PedidoItem;
import br.edu.unoesc.pedidocompra.regraspadrao.PedidoItemRegraPadrao;
import br.edu.unoesc.pedidocompra.repository.PedidoItemRepository;

@Service
public class PedidoItemRegra implements PedidoItemRegraPadrao {

	@Autowired
	private PedidoItemRepository pedidoItemRepository;

	@Override
	public void salvar(PedidoItem pedidoItem) {
		pedidoItemRepository.save(pedidoItem);
	}

	@Override
	public void delete(PedidoItem pedidoItem) {
		pedidoItemRepository.delete(pedidoItem);
	}

	@Override
	public void atualizar(PedidoItem pedidoItem) {
		// TODO Auto-generated method stub

	}

}
