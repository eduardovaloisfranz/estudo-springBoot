package br.desafiospringboot.desafiospringboot.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private double preco;
	private double desconto;
	public Produto() {	}
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	public int getId() {
		return this.id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}	
	public double getDesconto() {
		return this.desconto;
	}
	
	

}
