package br.org.generation.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloEventoController {
	
	@RequestMapping ("/cadastrarEvento")
	public String form() {
		return "eventos/formEvento";
	}
}
