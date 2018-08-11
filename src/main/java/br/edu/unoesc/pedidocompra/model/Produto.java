package br.edu.unoesc.pedidocompra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	private String nome;

	@Column(name = "qt_unitaria", nullable = false)
	private Double quantidade_unitaria;

	@Column(name = "pr_venda", nullable = false)
	private Double preco;

	public Produto(Long codigo) {
		this.codigo = codigo;
	}

	public Produto() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getQuantidade_unitaria() {
		return quantidade_unitaria;
	}

	public void setQuantidade_unitaria(Double quantidade_unitaria) {
		this.quantidade_unitaria = quantidade_unitaria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}


	

}
