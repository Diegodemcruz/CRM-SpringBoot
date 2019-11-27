package br.com.projetoIntegradorPig5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agenda")
public class AgendaController {


	@GetMapping("/agenda")
	public String agenda() {
		return "/agenda/agenda";
	}
	
}
