package br.com.bip.rh.modelo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DocumentosParaBrasileiros {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String cpf;
	private String pis;
	private String reservista;
	
	@Embedded
	private Rg rg;
	@Embedded
	private TituloEleitoral tituloEleitoral;
	@Embedded
	private CarteiraDeTrabalho carteiraDeTrabalho;
	@Embedded
	private ConselhoRegional conselhoRegional;
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	public String getReservista() {
		return reservista;
	}
	public void setReservista(String reservista) {
		this.reservista = reservista;
	}
	public Rg getRg() {
		return rg;
	}
	public void setRg(Rg rg) {
		this.rg = rg;
	}
	public TituloEleitoral getTituloEleitoral() {
		return tituloEleitoral;
	}
	public void setTituloEleitoral(TituloEleitoral tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}
	public CarteiraDeTrabalho getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}
	public void setCarteiraDeTrabalho(CarteiraDeTrabalho carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}
	public ConselhoRegional getConselhoRegional() {
		return conselhoRegional;
	}
	public void setConselhoRegional(ConselhoRegional conselhoRegional) {
		this.conselhoRegional = conselhoRegional;
	}
	
	
	
	
	
}
