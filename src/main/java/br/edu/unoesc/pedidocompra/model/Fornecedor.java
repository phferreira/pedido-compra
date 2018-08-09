package br.edu.unoesc.pedidocompra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	private String nome;

	public Fornecedor(long codigo) {
		this.codigo = codigo;
	}

	public Fornecedor() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

}
