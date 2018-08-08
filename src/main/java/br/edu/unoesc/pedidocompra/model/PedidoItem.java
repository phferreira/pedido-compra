package br.edu.unoesc.pedidocompra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PedidoItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Pedido codigo_pedido;

	@ManyToOne(fetch = FetchType.LAZY)
	private Produto codigo_produto;

	@Column(name = "qt_quantidade", length = 3, nullable = false)
	private Double quantidade;

	public Produto getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(Produto codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getCodigo_pedido() {
		return codigo_pedido;
	}

	public void setCodigo_pedido(Pedido codigo_pedido) {
		this.codigo_pedido = codigo_pedido;
	}

	public long getCodigo() {
		return codigo;
	}

}
