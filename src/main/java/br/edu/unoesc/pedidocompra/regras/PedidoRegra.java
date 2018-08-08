package br.edu.unoesc.pedidocompra.regras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.pedidocompra.model.Pedido;
import br.edu.unoesc.pedidocompra.regraspadrao.PedidoRegraPadrao;
import br.edu.unoesc.pedidocompra.repository.PedidoRepository;

@Service
public class PedidoRegra implements PedidoRegraPadrao {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public void salvar(Pedido pedido) {
		pedidoRepository.save(pedido);
	}

	@Override
	public void delete(Pedido pedido) {
		pedidoRepository.delete(pedido);
	}

	@Override
	public void atualizar(Pedido pedido) {
		// TODO Auto-generated method stub

	}

}
