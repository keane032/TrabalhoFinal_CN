package br.com.ufc.TrabalhoFinal_CN.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



import br.com.ufc.TrabalhoFinal_CN.model.Admin;
import br.com.ufc.TrabalhoFinal_CN.repository.PessoaRepository;
import br.com.ufc.TrabalhoFinal_CN.util.ImagemFileUtils;

@Service
public class AdminService {
	
//	@Autowired
//	private PessoaRepossitory pessoaRepository;
//	
//	public void salvarAdmin(Admin admin, MultipartFile imagem) {
//		String caminho = "images/" + admin.getNomeAdmin()+ ".png";
//		ImagemFileUtils.salvarImagem(caminho,imagem);
//		
//		pessoaRepository.save(admin);
//	}
//
//	public List<Admin> listarAdmins() {
//		return pessoaRepository.findAll();
//	}
//
//	public Admin buscarPorId(Long id) {
//		return pessoaRepository.getOne(id);
//		
//	}
//
//	public void excluirPorId(Long id) {
//		pessoaRepository.deleteById(id);
//		
//	}

}
