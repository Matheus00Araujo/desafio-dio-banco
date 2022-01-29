package Entidades;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}

	public void imprimirDadosConta() {
		super.imprimirDadosConta("Poupança");
	}
}