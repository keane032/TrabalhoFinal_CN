package br.com.ufc.TrabalhoFinal_CN.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
}
