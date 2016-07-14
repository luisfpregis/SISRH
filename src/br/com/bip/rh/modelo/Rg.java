package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class Rg {

	private String numeroRg;
	private String orgaoEmisorRg;
	private Uf estadoRg;
	private Calendar dataDeEmissaoRg;
	
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	
	public String getNumeroRg() {
		return numeroRg;
	}
	public void setNumeroRg(String numeroRg) {
		this.numeroRg = numeroRg;
	}
	public String getOrgaoEmisorRg() {
		return orgaoEmisorRg;
	}
	public void setOrgaoEmisorRg(String orgaoEmisorRg) {
		this.orgaoEmisorRg = orgaoEmisorRg;
	}
	public Uf getEstadoRg() {
		return estadoRg;
	}
	public void setEstadoRg(Uf estadoRg) {
		this.estadoRg = estadoRg;
	}
	public Calendar getDataDeEmissaoRg() {
		return dataDeEmissaoRg;
	}
	public void setDataDeEmissaoRg(Calendar dataDeEmissaoRg) {
		this.dataDeEmissaoRg = dataDeEmissaoRg;
	}
	
}