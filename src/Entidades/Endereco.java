package Entidades;

public class Endereco {
	//ATRIBUTOS
	private final String país = "Brasil", estado, cidade, rua, cep;;
	private final int numero;
	
	//CONSTRUTOR
	public Endereco(String estado, String cidade, String rua, int numero, String cep) {
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
	}

	
	//GETTERS E SETTERS
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
	
	//MÉTODOS
	//Método que monta e retorno o endereço completo da Agência
	public String enderecoCompleto() {
		return " - " + rua + ", " + numero
			+"\n - " + cidade + ", " + estado + " - " + país
			+"\n - Cep - " + cep;
	}
}
