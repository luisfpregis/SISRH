package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class CarteiraDeTrabalho {
	
	private String numeroCtps;
	private String serieCtps;
	private Uf ufCtps;
	private Calendar dataDeEmissaoCtps;
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public String getNumeroCtps() {
		return numeroCtps;
	}
	public void setNumeroCtps(String numeroCtps) {
		this.numeroCtps = numeroCtps;
	}
	public String getSerieCtps() {
		return serieCtps;
	}
	public void setSerieCtps(String serieCtps) {
		this.serieCtps = serieCtps;
	}
	public Uf getUfCtps() {
		return ufCtps;
	}
	public void setUfCtps(Uf ufCtps) {
		this.ufCtps = ufCtps;
	}
	public Calendar getDataDeEmissaoCtps() {
		return dataDeEmissaoCtps;
	}
	public void setDataDeEmissaoCtps(Calendar dataDeEmissaoCtps) {
		this.dataDeEmissaoCtps = dataDeEmissaoCtps;
	}

}
