package br.com.ufc.TrabalhoFinal_CN.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufc.TrabalhoFinal_CN.model.AlimentAva;
import br.com.ufc.TrabalhoFinal_CN.model.Alimento;
import br.com.ufc.TrabalhoFinal_CN.repository.AlimentoRepository;
import br.com.ufc.TrabalhoFinal_CN.service.AlimentoService;
import br.com.ufc.TrabalhoFinal_CN.service.RefeicaoService;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/avaliacao")
public class AvaliacaoController {

//	@Autowired
//	private AvaliacaoService avaliacaoService;
//	
	@Autowired
	private AlimentoService ali;
	@Autowired 
	private RefeicaoService refe;
	
	@PostMapping(value="/salvar")
	public ResponseEntity<String> salvarAvaliacao(@RequestBody List<AlimentAva> alimentos) {
		for (AlimentAva alimento : alimentos) {
			System.out.println(alimento.getava());
			System.out.println(alimento.getId());
		if (alimento != null) {
			if(alimento.getava().equals("Bom")) {
				Alimento alimento2 = ali.buscarPorId(alimento.getId());
				alimento2.setAvaliacaoBoa(alimento2.getAvaliacaoBoa() + 1);
				ali.update(alimento2);
			}
			
			else if(alimento.getava().equals("Ruim")) {
				Alimento alimento2 = ali.buscarPorId(alimento.getId());
				alimento2.setAvaliacaoRuim(alimento2.getAvaliacaoRuim() + 1);
				ali.update(alimento2);
			}
			else if(alimento.getava().equals("Regular")) {
				Alimento alimento2 = ali.buscarPorId(alimento.getId());
				alimento2.setAvaliacaoRegular(alimento2.getAvaliacaoRegular() + 1);
				ali.update(alimento2);
				
			}
		}
		}
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
	

	



}
