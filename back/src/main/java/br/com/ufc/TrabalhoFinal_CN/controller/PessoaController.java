package br.com.ufc.TrabalhoFinal_CN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.ufc.TrabalhoFinal_CN.model.Admin;
import br.com.ufc.TrabalhoFinal_CN.service.AdminService;

@RestController
@RequestMapping("/admin")
public class PessoaController {
	
//	@Autowired
//	private AdminService adminService;
//	
//	@RequestMapping("/formulario")
//	public ModelAndView formularioPessoa() {
//		ModelAndView mv = new ModelAndView("formulario");
//		mv.addObject("admin", new Admin());
//		return mv;
//	}
//	
//	@PostMapping("/salvar")
//	public ModelAndView salvarPessoa(Admin admin, @RequestParam(value= "imagem") MultipartFile imagem) {
//		adminService.salvarAdmin(admin,imagem);
//		ModelAndView mv = new ModelAndView("redirect:/pessoa/listar");		
//		return mv;
//		
//	}
//	
//	@GetMapping("/listar")
//	public ModelAndView listarAdmins() {
//	  List<Admin> admins = adminService.listarAdmins();
//	  ModelAndView mv = new ModelAndView("pagina-listagem");
//	  mv.addObject("todasOsAdmins", admins);
//	  
//	  return mv;
//	}
//	
//	@RequestMapping("/atualizar/{id}")
//	public ModelAndView atualizarPessoa(@PathVariable Long id) {
//		Admin admin = adminService.buscarPorId(id);
//		ModelAndView mv = new ModelAndView("formulario");
//		mv.addObject("admin", admin);
//		return mv;
//	}
//	
//	@RequestMapping("/excluir/{id}")
//	public ModelAndView excluirPessoa(@PathVariable Long id) {
//		adminService.excluirPorId(id);
//		ModelAndView mv = new ModelAndView("redirect:/admin/listar");
//		return mv;
//	}
//	
//	
	
	

}
