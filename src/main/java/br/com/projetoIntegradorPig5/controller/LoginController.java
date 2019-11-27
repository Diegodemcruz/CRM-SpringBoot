package br.com.projetoIntegradorPig5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetoIntegradorPig5.domain.Usuario;
import br.com.projetoIntegradorPig5.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("/login");
		mv.addObject("usuario", new Usuario());
		return mv;
	}

	@PostMapping("/validar")
	public String login(Usuario usuario) {
		boolean verifica = usuarioService.login(usuario);
		if (verifica)
			return "redirect:/home";
		return "404.html";
	}
	
	

}
