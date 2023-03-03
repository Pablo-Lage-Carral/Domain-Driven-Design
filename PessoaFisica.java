package beans;

public class PessoaFisica extends Pessoa{
	private String rg;
	private String cpf;
	
	
	//GETTERS SETTERS
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//CONSTRUTOR VAZIO
	public PessoaFisica() {
		super();
		
	}
	
	
	//CONSTRUTOR CHEIO
	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	
	//CONSTRUTOR CHEIO2
		public PessoaFisica(String nome, String email, int idade, Endereco endereco, String rg, String cpf) {
			super(nome, email, idade, endereco);
			this.rg = rg;
			this.cpf = cpf;
		}
		
		public PessoaFisica(String nome, String email, int idade, String rg, String cpf) {
			super(nome, email, idade);
			this.rg = rg;
			this.cpf = cpf;
		}
		
		
		

	
}
