package br.com.projetoIntegradorPig5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/relatorio")
public class RelatorioController {
	
	@GetMapping("/download")
	public String relatorio() {
		return "/consultar/relatorio";
	}

}
