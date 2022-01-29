package Entidades;
import java.util.ArrayList;
import java.util.List;

public class Banco {

	//ATRIBUTOS
	private final String nome;
	private List<Agencia> agencias = new ArrayList();

	//CONSTRUTOR
	public Banco(String nome) {
		this.nome = nome;
	}

	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	//MÉTODOS
	//Método para adicionar uma agência na lista de agências do banco
	public void adicionarAgencia(Agencia agencia) {
		agencias.add(agencia);
	}

	//Métodos Para listar as Agências junto de seus endereços
	public void listarAgencias() {
		System.out.println(String.format("=== BANCO %s ===", getNome()));
		for(Agencia ag : agencias) {
			System.out.println("Agência " + ag.getNumero());
			System.out.println(ag.getEndereco().enderecoCompleto());
		}
	}
	
	//Método Para realizar a consulta de uma Conta
	public Conta procurarConta(int numeroAgencia, int numeroConta) {
		for(int i = 0; i < agencias.size(); i++) {
			if(agencias.get(i).getNumero() == numeroAgencia) {
				for(int j = 0; j < agencias.get(i).getContas().size(); j++) {
					if(numeroConta == agencias.get(i).getContas().get(j).getNumero()) {
						return agencias.get(i).getContas().get(j);
					}
				}
			}
			
		}
		return null;
	}
}
