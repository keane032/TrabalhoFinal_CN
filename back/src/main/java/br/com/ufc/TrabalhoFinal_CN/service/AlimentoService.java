package br.com.ufc.TrabalhoFinal_CN.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import br.com.ufc.TrabalhoFinal_CN.model.Alimento;
import br.com.ufc.TrabalhoFinal_CN.repository.AlimentoRepository;
import br.com.ufc.TrabalhoFinal_CN.util.ImagemFileUtils;

@Service
public class AlimentoService {
	
	@Autowired
	private AlimentoRepository alimentoRepository;
	
	public void salvarAlimento(Alimento alimento) {
		alimentoRepository.save(alimento);
	}

	public List<Alimento> listarAlimentos() {
		return alimentoRepository.findAll();
	}

	public Alimento buscarPorId(Long id) {
		return alimentoRepository.getOne(id);
		
	}

	public void excluirPorId(Long id) {
		alimentoRepository.deleteById(id);
		
	}

	public void update(Alimento alimento) {
		alimentoRepository.saveAndFlush(alimento);
	}
}
