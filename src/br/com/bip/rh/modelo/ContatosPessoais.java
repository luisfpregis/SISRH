package br.com.bip.rh.modelo;

import javax.persistence.Embeddable;

@Embeddable
public class ContatosPessoais {
	
	private String telefoneFixoPessoal;
	private String numeroCelularPessoal;
	private String emailPessoal;
	
	public String getTelefoneFixoPessoal() {
		return telefoneFixoPessoal;
	}
	public void setTelefoneFixoPessoal(String telefoneFixoPessoal) {
		this.telefoneFixoPessoal = telefoneFixoPessoal;
	}
	public String getNumeroCelularPessoal() {
		return numeroCelularPessoal;
	}
	public void setNumeroCelularPessoal(String numeroCelularPessoal) {
		this.numeroCelularPessoal = numeroCelularPessoal;
	}
	public String getEmailPessoal() {
		return emailPessoal;
	}
	public void setEmailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}

	
}
