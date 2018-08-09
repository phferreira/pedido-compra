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

import br.edu.unoesc.pedidocompra.model.Fornecedor;
import br.edu.unoesc.pedidocompra.regraspadrao.FornecedorRegraPadrao;

@Controller
@RequestMapping("/fornecedor")
public class fornecedorController {
	@Autowired
	private FornecedorRegraPadrao fornecedorRegraPadrao;

	@PostMapping("/salvar")
	public String salvar(@Valid Fornecedor fornecedor, BindingResult erros) {
		if (erros.hasErrors()) {
			return "fornecedor/novo";
		}
		fornecedorRegraPadrao.salvar(fornecedor);
		return "redirect:/fornecedor/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Fornecedor fornecedor, BindingResult erros) {
		if (erros.hasErrors()) {
			return "fornecedor/visualizar";
		}
		fornecedorRegraPadrao.salvar(fornecedor);
		return "redirect:/fornecedor/listar";
	}
	
	@GetMapping("/listar")
	private String listar(Model model) {
		// Model: torna a pessoa acessivel no JSP
		model.addAttribute("fornecedor", fornecedorRegraPadrao.dadosGrid());
		//Caminho/nome do JSP que sera renderizado na tela
		return "fornecedor/lista";
	}

	@GetMapping("/novo")
	private String novo(Model model) {
//		model.addAttribute("cidades", cidadeRepository.findAll());
		return "fornecedor/novo";
	}
	
	@GetMapping("/deletar/{codigo}")
	private String deletar(@PathVariable("codigo") Long codigo) {
		fornecedorRegraPadrao.delete(new Fornecedor(codigo));
		return "redirect:/fornecedor/listar";
	}
	
	@GetMapping("/visualizar/{codigo}")
	private String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("fornecedor", fornecedorRegraPadrao.buscarPorCodigo(codigo));
//		model.addAllAttributes(cidadeRepository.findAll());
		return "fornecedor/visualizar";
	}
}
