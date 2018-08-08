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
	private long codigo;

	@Column(name = "tx_nome", length = 150, nullable = false)
	private String nome;

	@Column(name = "qt_unitaria", nullable = false)
	private Double quantidade_unitaria;

	@Column(name = "pr_venda", nullable = false)
	private Double preco;
}
