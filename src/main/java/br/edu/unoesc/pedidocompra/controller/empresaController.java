package br.edu.unoesc.pedidocompra.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoesc.pedidocompra.model.Empresa;
import br.edu.unoesc.pedidocompra.regraspadrao.EmpresaRegraPadrao;

@Controller
@RequestMapping("/empresa")
public class empresaController {

	@Autowired
	private EmpresaRegraPadrao empresaRegraPadrao;

	@PostMapping("/salvar")
	public String salvar(@Valid Empresa empresa, BindingResult erros) {
		if (erros.hasErrors()) {
			return "empresa/novo";
		}
		empresaRegraPadrao.salvar(empresa);
		return "redirect:/empresa/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Empresa empresa, BindingResult erros) {
		if (erros.hasErrors()) {
			return "empresa/visualizar";
		}
		empresaRegraPadrao.salvar(empresa);
		return "redirect:/empresa/listar";
	}
	
	@GetMapping("/listar")
	private String listar(Model model) {
		// Model: torna a pessoa acessivel no JSP
		model.addAttribute("empresa", empresaRegraPadrao.dadosGrid());
		//Caminho/nome do JSP que sera renderizado na tela
		return "empresa/lista";
	}

	@GetMapping("/novo")
	private String novo(Model model) {
		return "empresa/novo";
	}
	
	@GetMapping("/deletar/{codigo}")
	private String deletar(@PathVariable("codigo") Long codigo) {
		empresaRegraPadrao.delete(new Empresa(codigo));
		return "redirect:/empresa/listar";
	}
	
	@GetMapping("/visualizar/{codigo}")
	private String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("empresa", empresaRegraPadrao.buscarPorCodigo(codigo));
//		model.addAllAttributes(cidadeRepository.findAll());
		return "empresa/visualizar";
	}
}
