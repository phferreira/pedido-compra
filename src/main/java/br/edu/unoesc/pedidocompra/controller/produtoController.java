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

import br.edu.unoesc.pedidocompra.model.Produto;
import br.edu.unoesc.pedidocompra.regraspadrao.ProdutoRegraPadrao;

@Controller
@RequestMapping("/produto")
public class produtoController {

	@Autowired
	private ProdutoRegraPadrao produtoRegraPadrao;

	@PostMapping("/salvar")
	public String salvar(@Valid Produto produto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "produto/novo";
		}
		produtoRegraPadrao.salvar(produto);
		return "redirect:/produto/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Produto produto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "produto/visualizar";
		}
		produtoRegraPadrao.salvar(produto);
		return "redirect:/produto/listar";
	}
	
	@GetMapping("/listar")
	private String listar(Model model) {
		model.addAttribute("produto", produtoRegraPadrao.dadosGrid());
		return "produto/lista";
	}

	@GetMapping("/novo")
	private String novo(Model model) {
		return "produto/novo";
	}
	
	@GetMapping("/deletar/{codigo}")
	private String deletar(@PathVariable("codigo") Long codigo) {
		produtoRegraPadrao.delete(new Produto(codigo));
		return "redirect:/produto/listar";
	}
	
	@GetMapping("/visualizar/{codigo}")
	private String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("produto", produtoRegraPadrao.buscarPorCodigo(codigo));
		return "produto/visualizar";
	}
}
