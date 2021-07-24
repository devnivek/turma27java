package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
	
	@GetMapping
	public String hello() {
		return "MENTALIDADES E HABILIDADES:"
				+ "\n- Atenção aos detalhes"
				+ "\n- Mentalidade de crescimento"
				+ "\n\nOBJETIVOS DE APRENDIZAGEM:"
				+ "\n- Aprender mais sobre banco de dados"
				+ "\n- Dar os primeiros passos com Spring";
	}
	
	
	

}
