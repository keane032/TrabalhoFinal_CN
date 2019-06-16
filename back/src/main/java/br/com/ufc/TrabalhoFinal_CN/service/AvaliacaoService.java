//package br.com.ufc.TrabalhoFinal_CN.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import br.com.ufc.TrabalhoFinal_CN.model.Alimento;
//import br.com.ufc.TrabalhoFinal_CN.model.Avaliacao;
//import br.com.ufc.TrabalhoFinal_CN.repository.AlimentoRepository;
//import br.com.ufc.TrabalhoFinal_CN.repository.AvaliacaoRepository;
//
//@Service
//public class AvaliacaoService {
//
//	@Autowired
//	private AvaliacaoRepository avaliacaoRepository;
//
//	@Autowired
//	private AlimentoRepository alimentoRepository;
//	
//	public void salvarAvaliacao(Avaliacao avaliacao) {
//		avaliacaoRepository.save(avaliacao);
//	}
//
//	public List<Avaliacao> listarAvaliacao() {
//		return avaliacaoRepository.findAll();
//	}
//
//	public Avaliacao buscarPorId(Long id) {
//		return avaliacaoRepository.getOne(id);
//		
//	}
//
//	public void excluirPorId(Long id) {
//		avaliacaoRepository.deleteById(id);
//		
//	}
//	public void avaliacaoBoa(Long idAlimento) {
//		alimentoRepository.getOne(idAlimento).setAvaliacaoBoa(alimentoRepository.getOne(idAlimento).getAvaliacaoBoa()+1);
//	}
//	public void avaliacaoRegular(Long idAlimento) {
//		alimentoRepository.getOne(idAlimento).setAvaliacaoBoa(alimentoRepository.getOne(idAlimento).getAvaliacaoRegular()+1);
//	}
//	public void avaliacaoRuim(Long idAlimento) {
//		alimentoRepository.getOne(idAlimento).setAvaliacaoBoa(alimentoRepository.getOne(idAlimento).getAvaliacaoRuim()+1);
//	}
//}
