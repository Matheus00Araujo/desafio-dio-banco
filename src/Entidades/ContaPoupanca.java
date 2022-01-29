package Entidades;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}

	@Override
	public void imprimirExtrato() {
	}
}