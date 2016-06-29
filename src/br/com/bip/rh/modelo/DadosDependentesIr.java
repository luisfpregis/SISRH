package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.bip.rh.modelo.enums.Genero;

@Entity
public class DadosDependentesIr {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nomeDependenteIr;
	private String tipoParentesco;
	private Calendar dataDeNascimento;
	private String nacionalidade;
	private String cpfDependente;
	
	@OneToOne
	private Pais naturalidadeDependente;
	@OneToOne
	private Uf ufDependente;
	@OneToOne
	private DadosPassaporte dadosPassaporte;
	
	@Embedded
	private Rg rgDependente;
	@Embedded
	private Rne rneDependente;
		
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	//-----------------GETTERS AND SETTERS-------------------------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDependenteIr() {
		return nomeDependenteIr;
	}

	public void setNomeDependenteIr(String nomeDependenteIr) {
		this.nomeDependenteIr = nomeDependenteIr;
	}

	public String getTipoParentesco() {
		return tipoParentesco;
	}

	public void setTipoParentesco(String tipoParentesco) {
		this.tipoParentesco = tipoParentesco;
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpfDependente() {
		return cpfDependente;
	}

	public void setCpfDependente(String cpfDependente) {
		this.cpfDependente = cpfDependente;
	}

	public Pais getNaturalidadeDependente() {
		return naturalidadeDependente;
	}

	public void setNaturalidadeDependente(Pais naturalidadeDependente) {
		this.naturalidadeDependente = naturalidadeDependente;
	}

	public Uf getUfDependente() {
		return ufDependente;
	}

	public void setUfDependente(Uf ufDependente) {
		this.ufDependente = ufDependente;
	}

	public DadosPassaporte getDadosPassaporte() {
		return dadosPassaporte;
	}

	public void setDadosPassaporte(DadosPassaporte dadosPassaporte) {
		this.dadosPassaporte = dadosPassaporte;
	}

	public Rg getRgDependente() {
		return rgDependente;
	}

	public void setRgDependente(Rg rgDependente) {
		this.rgDependente = rgDependente;
	}

	public Rne getRneDependente() {
		return rneDependente;
	}

	public void setRneDependente(Rne rneDependente) {
		this.rneDependente = rneDependente;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
	

}
