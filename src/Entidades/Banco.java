package Entidades;
import java.util.List;

public class Banco {

	private final String nome;
	private List<Agencia> agencias;

	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencia> agencias) {
		this.agencias = agencias;
	}

	
}
