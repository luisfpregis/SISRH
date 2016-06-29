package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;

@Embeddable
public class ConselhoRegional {
	
	private String nomeConselho;
	private String numeroConselho;
	private String sigla;
	private String regiaoConselho;
	private String orgaoEmisorConselho;
	private Calendar dataDeEmissaoConselho;
	private Calendar dataVencimentoConselho;
	
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public String getNomeConselho() {
		return nomeConselho;
	}
	public void setNomeConselho(String nomeConselho) {
		this.nomeConselho = nomeConselho;
	}
	public String getNumeroConselho() {
		return numeroConselho;
	}
	public void setNumeroConselho(String numeroConselho) {
		this.numeroConselho = numeroConselho;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getRegiaoConselho() {
		return regiaoConselho;
	}
	public void setRegiaoConselho(String regiaoConselho) {
		this.regiaoConselho = regiaoConselho;
	}
	public String getOrgaoEmisorConselho() {
		return orgaoEmisorConselho;
	}
	public void setOrgaoEmisorConselho(String orgaoEmisorConselho) {
		this.orgaoEmisorConselho = orgaoEmisorConselho;
	}
	public Calendar getDataDeEmissaoConselho() {
		return dataDeEmissaoConselho;
	}
	public void setDataDeEmissaoConselho(Calendar dataDeEmissaoConselho) {
		this.dataDeEmissaoConselho = dataDeEmissaoConselho;
	}
	public Calendar getDataVencimentoConselho() {
		return dataVencimentoConselho;
	}
	public void setDataVencimentoConselho(Calendar dataVencimentoConselho) {
		this.dataVencimentoConselho = dataVencimentoConselho;
	}
	
	

}
