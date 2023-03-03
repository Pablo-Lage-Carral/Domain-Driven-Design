package beans;

public class Endereco {
	private String logradouro;
	private int numero;
	
	
	//GETTERS SETTERS
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	//CONSTRUTOR VAZIO
	public Endereco() {
		super();
	}
	
	//CONSTRUTOR CHEIO
	public Endereco(String logradouro, int numero) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
	}

}
