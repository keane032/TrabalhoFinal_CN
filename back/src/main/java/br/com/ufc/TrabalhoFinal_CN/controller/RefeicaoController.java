package br.com.ufc.TrabalhoFinal_CN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.ufc.TrabalhoFinal_CN.model.Refeicao;
import br.com.ufc.TrabalhoFinal_CN.service.RefeicaoService;

@RestController
@RequestMapping("/refeicao")
public class RefeicaoController {
	
	@Autowired
	private RefeicaoService refeicaoService;
	

	@RequestMapping(value="/salvar",method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> salvarAlimento(@RequestBody Refeicao refeicao){
		
		 System.out.println(refeicao.getListaDeAlimentos().size());
		if (refeicao.getListaDeAlimentos().size() != 0) {
			refeicaoService.salvarRefeicao(refeicao);
			return new ResponseEntity<String>("",HttpStatus.OK);
		}
		return new ResponseEntity<String>("alimentos nulos",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Refeicao>> listarRefeicao() {
	  List<Refeicao> refeicao = refeicaoService.listarRefeicoes();
	  return new ResponseEntity<List<Refeicao>>(refeicao,HttpStatus.OK);
	}
	
	@RequestMapping("/atualizar/{id}")
	public ModelAndView atualizarRefeicao(@PathVariable Long id) {
		Refeicao refeicao= refeicaoService.buscarPorId(id);
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("refeicao", refeicao);
		return mv;
	}
	
	@RequestMapping("/excluir/{id}")
	public ResponseEntity<String> excluirAlimento(@PathVariable Integer id) {
		
		System.out.println(id);
		refeicaoService.excluirPorId(id);
		return new ResponseEntity<String>("",HttpStatus.OK);
	}

}
