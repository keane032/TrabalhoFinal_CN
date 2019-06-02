package br.com.ufc.TrabalhoFinal_CN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.ufc.TrabalhoFinal_CN.model.Alimento;
import br.com.ufc.TrabalhoFinal_CN.service.AlimentoService;

@Controller
@RequestMapping("/alimento")
public class alimentoController {
	@Autowired
	private AlimentoService alimentoService;
	
	@RequestMapping("/formulario")
	public ModelAndView formularioAlimento() {
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("alimento", new Alimento());
		return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvarAlimento(Alimento alimento, @RequestParam(value= "imagem") MultipartFile imagem) {
		alimentoService.salvarAlimento(alimento,imagem);
		ModelAndView mv = new ModelAndView("redirect:/alimento/listar");
		return mv;
		
	}
	
	@GetMapping("/listar")
	public ModelAndView listarAlimento() {
	  List<Alimento> alimento = alimentoService.listarAlimentos();
	  ModelAndView mv = new ModelAndView("pagina-listagem");
	  mv.addObject("todasAsPessoas", alimento);
	  
	  return mv;
	}
	
	@RequestMapping("/atualizar/{id}")
	public ModelAndView atualizarAlimento(@PathVariable Long id) {
		Alimento alimento = alimentoService.buscarPorId(id);
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("alimento", alimento);
		return mv;
	}
	
	@RequestMapping("/excluir/{id}")
	public ModelAndView excluirAlimento(@PathVariable Long id) {
		alimentoService.excluirPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/alimento/listar");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
