package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import br.com.bip.rh.modelo.enums.Genero;

@Entity
public class DependenteIr {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String tipoParentesco;
	private Calendar dataDeNascimento;
	private String nacionalidade;
	private String cpf;
	
	@ManyToOne
	private Usuario funcionario;
	@OneToOne
	private Pais naturalidade;
	@OneToOne
	private Uf uf;
	@OneToOne
	private DadosPassaporte dadosPassaporte;
	
	@Embedded
	private Rg rg;
	@Embedded
	private Rne rne;
		
	@Enumerated(EnumType.STRING)
	private Genero genero;


	
	//-----------------GETTERS AND SETTERS-------------------------------

		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Pais getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(Pais naturalidade) {
		this.naturalidade = naturalidade;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public DadosPassaporte getDadosPassaporte() {
		return dadosPassaporte;
	}

	public void setDadosPassaporte(DadosPassaporte dadosPassaporte) {
		this.dadosPassaporte = dadosPassaporte;
	}

	public Rg getRg() {
		return rg;
	}

	public void setRg(Rg rg) {
		this.rg = rg;
	}

	public Rne getRne() {
		return rne;
	}

	public void setRne(Rne rne) {
		this.rne = rne;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Usuario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Usuario funcionario) {
		this.funcionario = funcionario;
	}
	
	

}
