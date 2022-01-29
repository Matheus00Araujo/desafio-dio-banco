package Entidades;
public class Cliente {

	//ATRIBUTOS
	private final String nome;
	private final String cpf;
	
	//CONSTRUTOR
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

}