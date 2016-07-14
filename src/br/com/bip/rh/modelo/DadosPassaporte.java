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
	private String numero;
	private Calendar dataDeEmissao;
	private Calendar dataValidade;
	private String orgaoEmisor;	
	@OneToOne
	private Pais paisEmissor;
	@OneToOne
	private Uf uf;

	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}
	public void setDataDeEmissao(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getOrgaoEmisor() {
		return orgaoEmisor;
	}
	public void setOrgaoEmisor(String orgaoEmisor) {
		this.orgaoEmisor = orgaoEmisor;
	}
	public Pais getPaisEmissor() {
		return paisEmissor;
	}
	public void setPaisEmissor(Pais paisEmissor) {
		this.paisEmissor = paisEmissor;
	}
	public Uf getUf() {
		return uf;
	}
	public void setUf(Uf uf) {
		this.uf = uf;
	}
	

}
