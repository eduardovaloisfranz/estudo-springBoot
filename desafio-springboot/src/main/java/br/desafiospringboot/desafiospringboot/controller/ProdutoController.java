package br.desafiospringboot.desafiospringboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.desafiospringboot.desafiospringboot.model.entities.Produto;
import br.desafiospringboot.desafiospringboot.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> getAllProdutos(){
		
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getProdutoById(@PathVariable int id) {
		try {
			Produto prod = produtoRepository.findById(id).get();			
			return new ResponseEntity<Produto>(prod, HttpStatus.OK);		
			
		}catch(Exception ex) {			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado");
		}
	}
	
	@PostMapping()
	public Produto addProduto(@RequestBody Produto produto) {	
		try {
			produtoRepository.save(produto);	
			return produto;			
		}catch(Exception ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado");
		}
		
	}
	
	@PutMapping("/{id}")		
	public Produto editProduto(@RequestBody Produto prod, @PathVariable int id) {
		var oldProd = produtoRepository.findById(id);
		oldProd.get().setNome(prod.getNome());
		oldProd.get().setDesconto(prod.getDesconto());
		oldProd.get().setPreco(prod.getPreco());
		
		produtoRepository.save(oldProd.get());
		
		return oldProd.get();
	}
	
	@DeleteMapping("/{id}")
	public Produto deleteProduct(@PathVariable int id) {
		Produto oldProd = produtoRepository.findById(id).get();	
		produtoRepository.delete(oldProd);
		return oldProd;
	}
	
	
}
