package main;

import javax.swing.JOptionPane;

import beans.Endereco;
import beans.PessoJuridica;
import beans.PessoaFisica;



public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String nome, String email, int idade, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica(JOptionPane.showInputDialog("Digite seu nome"),
										JOptionPane.showInputDialog("Digite seu email"),
										Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade")),
										JOptionPane.showInputDialog("Digite seu RG"),
										JOptionPane.showInputDialog("Digite seu CPF")
										);
		Endereco objEnderecoPf = new Endereco();
		objEnderecoPf.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		objEnderecoPf.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número")));
		
		//String nome, String email, int idade, String razaoSocial, String cnpj
		PessoJuridica objPj = new PessoJuridica(JOptionPane.showInputDialog("Digite seu nome"),
				JOptionPane.showInputDialog("Digite seu email"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade")),
				JOptionPane.showInputDialog("Digite Razão Social"),
				JOptionPane.showInputDialog("Digite seu CNPJ")
				);
		Endereco objEnderecoPj = new Endereco();
		objEnderecoPj.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		objEnderecoPj.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número")));
		
		
		//SAIDAS
		System.out.println("PF");
		System.out.println("NOME: " + objPf.getNome() + "\n" + 
		"LOGRADOURO: " + objEnderecoPf.getLogradouro() );
		
		System.out.println("PJ");
		System.out.println("Nome da Empresa: " + objPj.getNome() + "\n" + 
		"Logradouro: " + objEnderecoPj.getLogradouro() );
		
	}

}
