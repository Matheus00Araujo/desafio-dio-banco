package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private static int SEQUENCIAL = 1;
	
	//ATRIBUTOS
	private final Banco banco;
	private final int numero;
	private Endereco endereco;
	private List<Conta> contas = new ArrayList();
	
	//CONSTRUTOR
	public Agencia(Banco banco, Endereco endereco) {
		this.banco = banco;
		this.numero = SEQUENCIAL++;
		this.endereco = endereco;
	}

	//GETTERS E SETTERS
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

	public Banco getBanco() {
		return banco;
	}
	

	//M�TODOS
	//M�todo Para Adicionar Contas na lista de contas da Ag�ncia
	public void adicionarContas(Conta conta) {
		contas.add(conta);
	}
	
	//M�todo para Listas as Contas que tem em uma Ag�ncia
	public void listarContas() {
		System.out.println(String.format("\n=== CONTAS DA AG�NCIA %01d ===", getNumero()));
		for(Conta conta : contas) {
			System.out.println(String.format("%04d", conta.getNumero()));
		}
	}
}
