package br.org.generation.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hellocontroller {
	
	@GetMapping
	public String Hello() {
		return "Primeiro String";
	}
	@GetMapping("/mentalidade")
	public String Mentalidade() {
		return "Persistência";
	}
	@GetMapping("/objetivo")
		public String Objetivo() {
		return "Focar no aprendizado e tentar aprender corretamente";
	}
}
