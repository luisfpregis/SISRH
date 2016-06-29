package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DadosPassaporte {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String numeroPassaporte;
	private Calendar dataDeEmissaoPassaporte;
	private Calendar dataValidadePassaporte;
	private String orgaoEmisorPassaporte;	
	@OneToOne
	private Pais paisEmissor;
	@OneToOne
	private Uf ufPassaporte;
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroPassaporte() {
		return numeroPassaporte;
	}
	public void setNumeroPassaporte(String numeroPassaporte) {
		this.numeroPassaporte = numeroPassaporte;
	}
	public Calendar getDataDeEmissaoPassaporte() {
		return dataDeEmissaoPassaporte;
	}
	public void setDataDeEmissaoPassaporte(Calendar dataDeEmissaoPassaporte) {
		this.dataDeEmissaoPassaporte = dataDeEmissaoPassaporte;
	}
	public Calendar getDataValidadePassaporte() {
		return dataValidadePassaporte;
	}
	public void setDataValidadePassaporte(Calendar dataValidadePassaporte) {
		this.dataValidadePassaporte = dataValidadePassaporte;
	}
	public String getOrgaoEmisorPassaporte() {
		return orgaoEmisorPassaporte;
	}
	public void setOrgaoEmisorPassaporte(String orgaoEmisorPassaporte) {
		this.orgaoEmisorPassaporte = orgaoEmisorPassaporte;
	}
	public Pais getPaisEmissor() {
		return paisEmissor;
	}
	public void setPaisEmissor(Pais paisEmissor) {
		this.paisEmissor = paisEmissor;
	}
	public Uf getUfPassaporte() {
		return ufPassaporte;
	}
	public void setUfPassaporte(Uf ufPassaporte) {
		this.ufPassaporte = ufPassaporte;
	}
	
	

}
