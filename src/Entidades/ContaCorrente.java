package Entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}

	public void imprimirDadosConta() {
		super.imprimirDadosConta("Corrente");
	}
	
}