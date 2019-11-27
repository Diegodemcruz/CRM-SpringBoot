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

import br.com.projetoIntegradorPig5.domain.NivelInstrucao;
import br.com.projetoIntegradorPig5.domain.Produto;
import br.com.projetoIntegradorPig5.service.NivelInstrucaoService;
import br.com.projetoIntegradorPig5.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;

	@Autowired
	NivelInstrucaoService nivelInstrucaoService;

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("/produto/cadastro");
		mv.addObject("produto", new Produto());

		return mv;
	}

	@PostMapping("/salvar")
	public String salvar(Produto produto, RedirectAttributes attr) {
		produtoService.save(produto);
		attr.addFlashAttribute("sucess", "Produto Inserido com sucesso.");
		return "redirect:/produto/listar";
	}

	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("produto/lista");
		mv.addObject("produtos", produtoService.searchAll());
		return mv;
	}

	/*
	 * @GetMapping("/listar") public String listar(ModelMap model) {
	 * model.addAttribute("produtos", produtoService.searchAll()); return
	 * "/produto/lista";
	 * 
	 * }
	 */

	@GetMapping("/deletar/{produto_id}")
	public String deletar(@PathVariable("produto_id") Integer produto_id, RedirectAttributes attr) {
		produtoService.delete(produto_id);
		attr.addFlashAttribute("Sucess", "Produto Excluido da base.");
		return "redirect:/produto/listar";
	}

	@ModelAttribute("nivelInstrucao")
	public List<NivelInstrucao> listaNivelInstrucao() {
		return nivelInstrucaoService.searchAll();
	}

	@GetMapping("/find-one/{produto_id}")
	@ResponseBody
	public Produto findOneProduto(@PathVariable("produto_id") Integer produto_id) {	
		
		return produtoService.findOneProduto(produto_id);
		
	}

}
