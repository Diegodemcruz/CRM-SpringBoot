package br.com.projetoIntegradorPig5.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	/*
	 * @GetMapping("/home") public ModelAndView home() { ModelAndView mv = new
	 * ModelAndView ( "/home"); return mv; }
	 */
	
	@GetMapping("/home")
	public String home () {
		return "home";
	}
	
	



	
	

}
