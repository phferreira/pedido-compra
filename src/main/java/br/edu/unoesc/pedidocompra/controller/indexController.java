package br.edu.unoesc.pedidocompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	@GetMapping("/index")
	private String index(Model model) {
		return "index";
	}
}
