package beans;

public class Pessoa {
	private String nome;
	private String email;
	private int idade;
	private Endereco endereco;
	
	
	//getters setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	//CONSTRUTOR VAZIO
	public Pessoa() {
		super();
	}
	
	//CONSTRUTOR CHEIO
	public Pessoa(String nome, String email, int idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, String email, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		
	}
}
