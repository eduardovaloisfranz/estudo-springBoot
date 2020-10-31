package br.desafiospringboot.desafiospringboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.desafiospringboot.desafiospringboot.model.entities.Cliente;


@RestController
@RequestMapping("/Clientes")
public class ClienteController {

	@GetMapping
	public Cliente getCliente() {
		return new Cliente(1, "Nome", "10118916971");		
	}
	
	@GetMapping("/{id}")
	public Cliente getClientById1(@PathVariable int id) {
	  return new Cliente(id, "Seila", "sem cpfkkk");	
	}
	
	@PutMapping("{/id}")
	public Cliente PutClientById(@PathVariable int id, @RequestBody Cliente cl) {
		cl.setId(id);
		return cl;
	}
}
