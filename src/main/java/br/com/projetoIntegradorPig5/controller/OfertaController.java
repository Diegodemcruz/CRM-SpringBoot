package br.com.projetoIntegradorPig5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projetoIntegradorPig5.domain.Oferta;
import br.com.projetoIntegradorPig5.domain.Produto;
import br.com.projetoIntegradorPig5.service.OfertaService;
import br.com.projetoIntegradorPig5.service.ProdutoService;
@Controller
@RequestMapping("/oferta")
public class OfertaController {

	@Autowired
	OfertaService ofertaService;
	
	@Autowired
	ProdutoService produtoService;
	
	
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("/oferta/cadastro");
		mv.addObject("oferta", new Oferta());
		return mv;
	}
	
	@PostMapping("/salvar")
	public String salvar(Oferta oferta, RedirectAttributes attr) {
		ofertaService.save(oferta);
		attr.addFlashAttribute("sucess", "Oferta Inserida com sucesso.");
		return "redirect:/oferta/cadastrar";
	}
	
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("oferta/lista");
		mv.addObject("oferta", ofertaService.searchAll());
		return mv;
	}
	
	
	@GetMapping("/deletar/{oferta_id}")
	public String deletar(@PathVariable("oferta_id") Integer oferta_id, RedirectAttributes attr) {
		ofertaService.delete(oferta_id);
		attr.addFlashAttribute("Sucess", "Oferta Excluido da base.");
		return "redirect:/oferta/listar";
	}
	
	
	@ModelAttribute("produtos")
	public List<Produto> listaProdutos(){
		return produtoService.searchAll();
	}
	
	@GetMapping("/find-one/{oferta_id}")
	@ResponseBody
	public Oferta findOneOferta(@PathVariable("oferta_id") Integer oferta_Id) {
		return ofertaService.findOneOferta(oferta_Id);
	}
		
		
		
}
