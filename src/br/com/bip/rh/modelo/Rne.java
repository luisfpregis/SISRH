package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class Rne {
	
	private String numeroRne;
	private String orgaoEmisorRne;
	private Calendar validadeRne;
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public String getNumeroRne() {
		return numeroRne;
	}
	public void setNumeroRne(String numeroRne) {
		this.numeroRne = numeroRne;
	}
	public String getOrgaoEmisorRne() {
		return orgaoEmisorRne;
	}
	public void setOrgaoEmisorRne(String orgaoEmisorRne) {
		this.orgaoEmisorRne = orgaoEmisorRne;
	}
	public Calendar getValidadeRne() {
		return validadeRne;
	}
	public void setValidadeRne(Calendar validadeRne) {
		this.validadeRne = validadeRne;
	}
	

}
