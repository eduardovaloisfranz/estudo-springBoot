package br.desafiospringboot.desafiospringboot.model.entities;

public class Cliente {
	
	private int id;	
	private String nome;
	private String cpf;
	
	public Cliente(int id, String nome, String cpf) {
		this.setId(id);
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public int getId() {
		return this.id;		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}


