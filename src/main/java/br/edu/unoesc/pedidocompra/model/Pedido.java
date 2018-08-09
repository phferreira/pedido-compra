package br.edu.unoesc.pedidocompra.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Empresa empresa;

	@ManyToOne(fetch = FetchType.LAZY)
	private Fornecedor fornecedor;

	public Pedido(long codigo) {
		this.codigo = codigo;
	}

	public Pedido() {
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public long getCodigo() {
		return codigo;
	}

}
