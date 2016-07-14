package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class TituloEleitoral {
	
	private String numeroTitulo;
	private String zonaTitulo;
	private String secaoTitulo;
	private Calendar dataDeEmissaoTitulo;


	//-----------------GETTERS AND SETTERS-------------------------------
	
	public String getNumeroTitulo() {
		return numeroTitulo;
	}
	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}
	public String getZonaTitulo() {
		return zonaTitulo;
	}
	public void setZonaTitulo(String zonaTitulo) {
		this.zonaTitulo = zonaTitulo;
	}
	public String getSecaoTitulo() {
		return secaoTitulo;
	}
	public void setSecaoTitulo(String secaoTitulo) {
		this.secaoTitulo = secaoTitulo;
	}
	public Calendar getDataDeEmissaoTitulo() {
		return dataDeEmissaoTitulo;
	}
	public void setDataDeEmissaoTitulo(Calendar dataDeEmissaoTitulo) {
		this.dataDeEmissaoTitulo = dataDeEmissaoTitulo;
	}

}
