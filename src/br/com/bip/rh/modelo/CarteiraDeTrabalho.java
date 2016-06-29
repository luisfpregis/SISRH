package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class CarteiraDeTrabalho {
	
	private String numeroCTPS;
	private String serieCTPS;
	private Uf ufCTPS;
	private Calendar dataDeEmissaoCTPS;
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public String getNumeroCTPS() {
		return numeroCTPS;
	}
	public void setNumeroCTPS(String numeroCTPS) {
		this.numeroCTPS = numeroCTPS;
	}
	public String getSerieCTPS() {
		return serieCTPS;
	}
	public void setSerieCTPS(String serieCTPS) {
		this.serieCTPS = serieCTPS;
	}
	public Uf getUfCTPS() {
		return ufCTPS;
	}
	public void setUfCTPS(Uf ufCTPS) {
		this.ufCTPS = ufCTPS;
	}
	public Calendar getDataDeEmissaoCTPS() {
		return dataDeEmissaoCTPS;
	}
	public void setDataDeEmissaoCTPS(Calendar dataDeEmissaoCTPS) {
		this.dataDeEmissaoCTPS = dataDeEmissaoCTPS;
	}
	
	
	

	

}
