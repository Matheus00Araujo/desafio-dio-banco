package Entidades;

import java.util.List;

public class Agencia {
	
	
	private final Banco banco;
	private final int numero;
	private Endereco endereco;
	private List<Conta> contas;
	
	public Agencia(Banco banco, int numero, Endereco endereco) {
		this.banco = banco;
		this.numero = numero;
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public Banco getBanco() {
		return banco;
	}
}
