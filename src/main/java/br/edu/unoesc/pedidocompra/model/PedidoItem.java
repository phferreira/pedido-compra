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
	private Pedido pedido;

	@ManyToOne(fetch = FetchType.LAZY)
	private Produto produto;

	@Column(name = "qt_quantidade", length = 3, nullable = false)
	private Double quantidade;

	public PedidoItem() {
	}

	public PedidoItem(long codigo) {
		this.codigo = codigo;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	

}
