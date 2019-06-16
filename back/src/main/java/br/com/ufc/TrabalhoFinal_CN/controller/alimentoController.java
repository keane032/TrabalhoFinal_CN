package br.com.ufc.TrabalhoFinal_CN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.ufc.TrabalhoFinal_CN.model.Alimento;
import br.com.ufc.TrabalhoFinal_CN.service.AlimentoService;
import br.com.ufc.TrabalhoFinal_CN.view.AliementoView;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/alimentos")
public class alimentoController {	
	
	
	@Autowired
	private AlimentoService alimentoService;
	

	@PostMapping(value="/salvar")
	public ResponseEntity<String> salvarAlimento(@RequestBody Alimento alimento) {
		if (alimento != null) {
			alimentoService.salvarAlimento(alimento);
			return new ResponseEntity<String>("",HttpStatus.OK);
		}
		return new ResponseEntity<String>("",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/listar")
	@JsonView(AliementoView.class)
	public ResponseEntity<List<Alimento>> listarAlimento() {
	  List<Alimento> alimento = alimentoService.listarAlimentos();
	  return new ResponseEntity<List<Alimento>>(alimento,HttpStatus.OK);
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
