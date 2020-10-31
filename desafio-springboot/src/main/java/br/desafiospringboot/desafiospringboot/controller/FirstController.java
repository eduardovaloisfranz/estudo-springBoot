package br.desafiospringboot.desafiospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {	
	
	@GetMapping()
	public String ola() {
		return "Olá Spring Boot!";
	}
}
