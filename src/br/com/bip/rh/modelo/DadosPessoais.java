package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.bip.rh.modelo.enums.EstadoCivil;
import br.com.bip.rh.modelo.enums.Genero;
import br.com.bip.rh.modelo.enums.GrauDeInstrucao;
import br.com.bip.rh.modelo.enums.RacaCor;
import br.com.bip.rh.modelo.enums.SimOuNao;

@Entity
public class DadosPessoais {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Calendar dataDeNascimento;
	private int idade;
	
	@Enumerated(EnumType.STRING)
	private Genero genero;
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	
	private String nomeDoPai;
	private String nomeDaMae;
	private String nacionalidade;
	
	@OneToOne
	private Pais naturalidade;
	@OneToOne
	private Uf uf;
	
	@Enumerated(EnumType.STRING)	
	private GrauDeInstrucao grauDeInstrucao;
	@Enumerated(EnumType.STRING)
	private SimOuNao deficienteFisico;
	private String tipoDeDeficiencia;
	@Enumerated(EnumType.STRING)
	private RacaCor racaCor;
	
//	@Embedded
//	private Endereco endereco;
	@Embedded
	private ContatosPessoais contatosPessoais = new ContatosPessoais();
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
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
	public GrauDeInstrucao getGrauDeInstrucao() {
		return grauDeInstrucao;
	}
	public void setGrauDeInstrucao(GrauDeInstrucao grauDeInstrucao) {
		this.grauDeInstrucao = grauDeInstrucao;
	}
	public SimOuNao getDeficienteFisico() {
		return deficienteFisico;
	}
	public void setDeficienteFisico(SimOuNao deficienteFisico) {
		this.deficienteFisico = deficienteFisico;
	}
	public String getTipoDeDeficiencia() {
		return tipoDeDeficiencia;
	}
	public void setTipoDeDeficiencia(String tipoDeDeficiencia) {
		this.tipoDeDeficiencia = tipoDeDeficiencia;
	}
	public RacaCor getRacaCor() {
		return racaCor;
	}
	public void setRacaCor(RacaCor racaCor) {
		this.racaCor = racaCor;
	}
//	public Endereco getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
	public ContatosPessoais getContatosPessoais() {
		return contatosPessoais;
	}
	public void setContatosPessoais(ContatosPessoais contatosPessoais) {
		this.contatosPessoais = contatosPessoais;
	}
	
	

}	
