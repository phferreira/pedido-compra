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

import br.edu.unoesc.pedidocompra.model.PedidoItem;
import br.edu.unoesc.pedidocompra.regraspadrao.PedidoItemRegraPadrao;

@Controller
@RequestMapping("/pedidoitem")
public class pedidoItemController {

	@Autowired
	private PedidoItemRegraPadrao pedidoItemRegraPadrao;

//	@Autowired
//	private PedidoRegraPadrao pedidoRegraPadrao;

	@PostMapping("/salvar/{codigo}")
	public String salvar(@Valid PedidoItem pedidoItem, @PathVariable("codigo") Long codigo, BindingResult erros) {
		if (erros.hasErrors()) {
			return "pedido/listar";
		}
		pedidoItemRegraPadrao.salvar(pedidoItem);
		return "redirect:/pedido/visualizar/35";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid PedidoItem pedidoItem, BindingResult erros) {
		if (erros.hasErrors()) {
			return "pedido/visualizar";
		}
		pedidoItemRegraPadrao.salvar(pedidoItem);
		return "redirect:/pedido/listar";
	}

	@GetMapping("/listar/{codigo}")
	private String listar(@PathVariable("codigo") Long codigo, Model model) {
//		model.addAttribute("pedidoitem", pedidoItemRegraPadrao.dadosGrid(codigo));
		return "pedido/lista";
	}

	@GetMapping("/novo")
	private String novo(Model model) {
//		model.addAttribute("pedidoitens", pedidoItemRegraPadrao.dadosGrid());
//		model.addAttribute("empresas", empresaRepository.findAll());		
		return "pedidoitem/novo";
	}

	@GetMapping("/deletar/{codigo}")
	private String deletar(@PathVariable("codigo") Long codigo) {
		pedidoItemRegraPadrao.delete(new PedidoItem(codigo));
		return "redirect:/pedidoitem/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	private String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("pedido", pedidoItemRegraPadrao.localizar(codigo));
//		model.addAttribute("fornecedores", fornecedorRepository.dadosGrid());
//		model.addAttribute("empresas", empresaRepository.findAll());	
		return "pedido/visualizar";
	}
}
