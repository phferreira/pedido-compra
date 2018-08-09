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

import br.edu.unoesc.pedidocompra.model.Pedido;
import br.edu.unoesc.pedidocompra.regraspadrao.PedidoRegraPadrao;
import br.edu.unoesc.pedidocompra.repository.EmpresaRepository;
import br.edu.unoesc.pedidocompra.repository.FornecedorRepository;

@Controller
@RequestMapping("/pedido")
public class pedidoController {
	@Autowired
	private PedidoRegraPadrao pedidoRegraPadrao;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Pedido pedido, BindingResult erros) {
		if (erros.hasErrors()) {
			return "pedido/novo";
		}
		pedidoRegraPadrao.salvar(pedido);
		return "redirect:/pedido/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Pedido pedido, BindingResult erros) {
		if (erros.hasErrors()) {
			return "pedido/visualizar";
		}
		pedidoRegraPadrao.salvar(pedido);
		return "redirect:/pedido/listar";
	}
	
	@GetMapping("/listar")
	private String listar(Model model) {
		model.addAttribute("pedido", pedidoRegraPadrao.dadosGrid());
//		model.addAttribute("fornecedores", fornecedorRepository.findAll());
//		model.addAttribute("empresas", empresaRepository.findAll());
		return "pedido/lista";
	}

	@GetMapping("/novo")
	private String novo(Model model) {
		model.addAttribute("fornecedores", fornecedorRepository.findAll());
		model.addAttribute("empresas", empresaRepository.findAll());		
		return "pedido/novo";
	}
	
	@GetMapping("/deletar/{codigo}")
	private String deletar(@PathVariable("codigo") Long codigo) {
		pedidoRegraPadrao.delete(new Pedido(codigo));
		return "redirect:/pedido/listar";
	}
	
	@GetMapping("/visualizar/{codigo}")
	private String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("pedido", pedidoRegraPadrao.buscarPorCodigo(codigo));
		model.addAttribute("fornecedores", fornecedorRepository.dadosGrid());
		model.addAttribute("empresas", empresaRepository.findAll());	
		return "pedido/visualizar";
	}
}
