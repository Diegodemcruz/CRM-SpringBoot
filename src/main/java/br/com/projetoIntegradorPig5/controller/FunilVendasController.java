
package br.com.projetoIntegradorPig5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetoIntegradorPig5.service.ClienteService;

@Controller
@RequestMapping("/funil")
public class FunilVendasController {

	@Autowired
	ClienteService clienteService;

	/*
	 * @GetMapping("/kanban") public String kanban() { return "/funil/kanban"; }
	 */

	@GetMapping("/drag")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("funil/kanban");
		mv.addObject("clientes", clienteService.searchAll());
		return mv;
	}


}
