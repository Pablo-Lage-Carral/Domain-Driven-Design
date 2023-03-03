package beans;

public class PessoJuridica extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	
	
	
	public PessoJuridica() {
		super();
	}
	
	public PessoJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	public PessoJuridica(String nome, String email, int idade, Endereco endereco, String razaoSocial, String cnpj) {
		super(nome, email, idade, endereco);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	public PessoJuridica(String nome, String email, int idade, String razaoSocial, String cnpj) {
		super(nome, email, idade);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}



	
	
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}



	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
	
	

}
