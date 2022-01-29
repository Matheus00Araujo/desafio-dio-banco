package Entidades;

public class Endereco {
	private final String país = "Brasil", estado, cidade, rua, cep;;
	private final int numero;
	
	//construtor
	public Endereco(String estado, String cidade, String rua, String cep, int numero) {
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
	}

	
	//getters e setters
	public String getEstado() {
		return estado;
	}

	public String getCidade() {
		return cidade;
	}

	public String getRua() {
		return rua;
	}

	public String getCep() {
		return cep;
	}

	public int getNumero() {
		return numero;
	}

	public String getPaís() {
		return país;
	}
	
}
