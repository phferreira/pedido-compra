package br.edu.unoesc.pedidocompra.controller.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoesc.pedidocompra.repository.EmpresaRepository;

@Controller
@RequestMapping("/empresa")
public class indexController {

	@Autowired
	private EmpresaRepository empresaRepository;

	@GetMapping("/novo")
	private String novaEmpresa(Model model) {
		model.addAttribute("empresa", empresaRepository.findAll());
		return "empresa/novo";
	}
	
	@GetMapping("/index")
	private String index(Model model) {
//		model.addAttribute("empresa", empresaRepository.findAll());
		return "index";
	}
}
