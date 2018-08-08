package br.edu.unoesc.pedidocompra.regraspadrao;

import br.edu.unoesc.pedidocompra.model.Empresa;

public interface EmpresaRegraPadrao {

	void salvar(Empresa empresa);

	void delete(Empresa empresa);
	
	void atualizar(Empresa empresa);

}
