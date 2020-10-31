package br.desafiospringboot.desafiospringboot.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.desafiospringboot.desafiospringboot.model.entities.Produto;

@Repository
public interface ProdutoRepository 
 extends CrudRepository<Produto, Integer>{
	 @Override
	    List<Produto> findAll();
}
