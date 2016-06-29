package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.bip.rh.modelo.enums.TipoDeVistos;

@Entity
public class DocumentosParaEstrangeiros {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String cpf;
	private String pis;
	private Calendar dataDeChegada;
	
	@Enumerated(EnumType.STRING)
	private TipoDeVistos tipoDeVisto;
	
	@Embedded
	private CarteiraDeTrabalho carteiraDeTrabalho;
	@Embedded
	private ConselhoRegional conselhoRegional;
	@Embedded
	private Rne rne;
	
	@OneToOne
	private Pais paisDeOrigem;
	@OneToOne
	private DadosPassaporte dadosPassaporte;
	
	
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
	
	public Rne getRne() {
		return rne;
	}
	public void setRne(Rne rne) {
		this.rne = rne;
	}
	public Calendar getDataDeChegada() {
		return dataDeChegada;
	}
	public void setDataDeChegada(Calendar dataDeChegada) {
		this.dataDeChegada = dataDeChegada;
	}
	public TipoDeVistos getTipoDeVisto() {
		return tipoDeVisto;
	}
	public void setTipoDeVisto(TipoDeVistos tipoDeVisto) {
		this.tipoDeVisto = tipoDeVisto;
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
	public Pais getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public void setPaisDeOrigem(Pais paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	public DadosPassaporte getDadosPassaporte() {
		return dadosPassaporte;
	}
	public void setDadosPassaporte(DadosPassaporte dadosPassaporte) {
		this.dadosPassaporte = dadosPassaporte;
	}
	
	

}
