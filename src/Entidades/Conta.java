package Entidades;

import Contratos.IConta;

public abstract class Conta implements IConta {
	private static int SEQUENCIAL = 1;

	//ATRIBUTOS
	protected final Agencia agencia;
	protected final int numero;
	protected double saldo;
	protected final Cliente cliente;

	//CONSTRUTOR
	public Conta(Cliente cliente, Agencia agencia) {
		this.numero = SEQUENCIAL++;
		this.agencia = agencia;
		this.cliente = cliente;
	}

	//GETTERS E SETTERS
	public Cliente getCliente() {
		return cliente;
	}

	public int getNumero() {
		return numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	//MÉTODOS
	//Método para sacar um valor da conta
	@Override
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}else {
			System.out.println("Valor insuficiente para realizar o saque!");
		}
	}

	//Método para depositar um valor na conta
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	//Método para transferir um valor para uma conta x
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}else {
			System.out.println("Valor insuficiente para concluir o deposito!");
		}
		
	}
	
	//Método para mostrar os dados da conta
	public void imprimirDadosConta(String tipoConta) {
		System.out.println("=== DADOS DA CONTA ===");
		System.out.println("Banco: " + agencia.getBanco().getNome());
		System.out.println("Agência: " + agencia.getNumero());
		System.out.println("Tipo de Conta: " + tipoConta);
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Saldo: " + this.saldo);
	}
}