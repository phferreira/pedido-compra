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
	private Empresa codigo_empresa;

	@ManyToOne(fetch = FetchType.LAZY)
	private Fornecedor codigo_fornecedor;

	public Empresa getCodigo_empresa() {
		return codigo_empresa;
	}

	public void setCodigo_empresa(Empresa codigo_empresa) {
		this.codigo_empresa = codigo_empresa;
	}

	public Fornecedor getCodigo_fornecedor() {
		return codigo_fornecedor;
	}

	public void setCodigo_fornecedor(Fornecedor codigo_fornecedor) {
		this.codigo_fornecedor = codigo_fornecedor;
	}

	public long getCodigo() {
		return codigo;
	}

}
