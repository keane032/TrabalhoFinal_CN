package br.com.ufc.TrabalhoFinal_CN.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



import br.com.ufc.TrabalhoFinal_CN.model.Alimento;
import br.com.ufc.TrabalhoFinal_CN.model.Avaliacao;

import br.com.ufc.TrabalhoFinal_CN.service.AvaliacaoService;


@Controller
public class AvaliacaoController {



	@Autowired
	private AvaliacaoService avaliacaoService;
	
	@PostMapping(value="/salvar")
	public ResponseEntity<String> salvarAvaliacao(@PathVariable Avaliacao avaliacao, Alimento alimento,String status) {
		if (alimento != null) {
			if(status =="Bom") {
				avaliacaoService.avaliacaoBoa(alimento.getId());
				avaliacaoService.salvarAvaliacao(avaliacao);
				return new ResponseEntity<String>("",HttpStatus.OK);
			}
			else if(status =="Ruim") {
				avaliacaoService.avaliacaoRuim(alimento.getId());
				avaliacaoService.salvarAvaliacao(avaliacao);
				return new ResponseEntity<String>("",HttpStatus.OK);
			}
			else if(status =="Regular") {
				avaliacaoService.avaliacaoRegular(alimento.getId());
				avaliacaoService.salvarAvaliacao(avaliacao);
				return new ResponseEntity<String>("",HttpStatus.OK);
			}
		}
		return new ResponseEntity<String>("",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	



}
