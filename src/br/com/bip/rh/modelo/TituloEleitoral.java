package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class TituloEleitoral {
	
	private String numeroTitulo;
	private String zona;
	private String secao;
	private Calendar dataDeEmissaoTitulo;
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public String getNumeroTitulo() {
		return numeroTitulo;
	}
	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getSecao() {
		return secao;
	}
	public void setSecao(String secao) {
		this.secao = secao;
	}
	public Calendar getDataDeEmissaoTitulo() {
		return dataDeEmissaoTitulo;
	}
	public void setDataDeEmissaoTitulo(Calendar dataDeEmissaoTitulo) {
		this.dataDeEmissaoTitulo = dataDeEmissaoTitulo;
	}
	
	


}
