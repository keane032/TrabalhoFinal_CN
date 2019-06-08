package br.com.ufc.TrabalhoFinal_CN.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.ufc.TrabalhoFinal_CN.model.Refeicao;
import br.com.ufc.TrabalhoFinal_CN.repository.ReifeicaoRepository;

@Service
public class RefeicaoService {
	
	@Autowired
	private ReifeicaoRepository refeicaoRepository;
	
	public void salvarRefeicao(Refeicao refeicao) {
		refeicaoRepository.save(refeicao);
	}

	public List<Refeicao> listarRefeicoes() {
		return refeicaoRepository.findAll();
	}

	public Refeicao buscarPorId(Long id) {
		return refeicaoRepository.getOne(id);
		
	}

	public void excluirPorId(Long id) {
		refeicaoRepository.deleteById(id);
		
	}

}
