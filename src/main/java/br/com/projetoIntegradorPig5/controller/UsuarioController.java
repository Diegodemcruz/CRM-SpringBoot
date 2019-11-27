package br.com.projetoIntegradorPig5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetoIntegradorPig5.domain.Usuario;
import br.com.projetoIntegradorPig5.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired 
	UsuarioService usuarioService;
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("/usuario/cadastro");
		mv.addObject("usuario", new Usuario());
		return mv;		
	}
	
	@PostMapping("/salvar")
	public String salvar (Usuario usuario, RedirectAttributes attr) {
		usuarioService.save(usuario);
		attr.addFlashAttribute("sucess", "Usuario cadastrado.");
		return "redirect:/usuario/cadastrar";
	}
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("usuario/lista");
		mv.addObject("usuario", usuarioService.searchAll());
		return mv;
	}
	
	@GetMapping("/deletar/{usuario_id}")
	public String deletar (@PathVariable("usuario_id")Integer usuario_id, RedirectAttributes attr) {
		usuarioService.delete(usuario_id);
		attr.addFlashAttribute("Sucess", "Usuario Excluido da base");
		return "redirect:/usuario/listar";
	}
	
	@GetMapping("/find-one/{usuario_id}")
	@ResponseBody
	public Usuario findOneUsuario(@PathVariable ("usuario_id")Integer usuario_id) {
		return usuarioService.findOneUsuario(usuario_id);
	}
	
	
	

}
