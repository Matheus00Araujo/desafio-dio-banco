package Entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}

	@Override
	public void imprimirExtrato() {
	}
	
}