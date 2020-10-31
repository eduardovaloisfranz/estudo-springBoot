package br.desafiospringboot.desafiospringboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Teste")
public class MetodosHttpController {
	
	@GetMapping
	public String getNome() {
		return "Teste Método Get";
	}
	
	@PostMapping
	public String postNome() {
		return "Teste Método Post";
	}
	
	@DeleteMapping
	public String deleteNome() {
		return "Teste Método Delete";
	}
	
	@PutMapping()
	public String putNome() {
		return "Teste método Put";
	}
}
