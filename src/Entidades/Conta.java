package Entidades;

import Contratos.IConta;

public abstract class Conta implements IConta {
	private static int SEQUENCIAL = 1;

	protected final Agencia agencia;
	protected final int numero;
	protected double saldo;
	protected final Cliente cliente;

	public Conta(Cliente cliente, Agencia agencia) {
		this.numero = SEQUENCIAL++;
		this.agencia = agencia;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
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
}