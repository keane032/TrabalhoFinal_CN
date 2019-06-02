package br.com.ufc.TrabalhoFinal_CN.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginaInicialController {
	
	@RequestMapping("/inicio")
	public String paginaInicial() {
		return "pagina-inicial";
	}
	
	
	

}
