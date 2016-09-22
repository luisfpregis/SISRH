package br.com.bip.rh.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="FROM_CLASS", discriminatorType=DiscriminatorType.STRING)
public abstract class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	//private String emailAcesso;
	private String senha;
	private String nivelDeAcesso;
	
	@OneToOne
	private DadosPessoais dadosPessoais;
	@OneToOne
	private DadosProfissionais dadosProfissionais;
	@OneToOne
	private DadosBancarios dadosBancarios;
	@OneToOne
	private DocumentosParaBrasileiros documentosParaBrasileiros;
	@OneToOne
	private DocumentosParaEstrangeiros documentosParaEstrangeiros;
	@OneToMany(mappedBy = "funcionario")
	private List<DependenteIr> depententesIr;
	@OneToMany(mappedBy = "funcionario")
	private List<DependenteSaude> dependentesSaude;
	
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}
	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public DadosProfissionais getDadosProfissionais() {
		return dadosProfissionais;
	}
	public void setDadosProfissionais(DadosProfissionais dadosProfissionais) {
		this.dadosProfissionais = dadosProfissionais;
	}
	public DadosBancarios getDadosBancarios() {
		return dadosBancarios;
	}
	public void setDadosBancarios(DadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}
	public DocumentosParaBrasileiros getDocumentosParaBrasileiros() {
		return documentosParaBrasileiros;
	}
	public void setDocumentosParaBrasileiros(DocumentosParaBrasileiros documentosParaBrasileiros) {
		this.documentosParaBrasileiros = documentosParaBrasileiros;
	}
	public DocumentosParaEstrangeiros getDocumentosParaEstrangeiros() {
		return documentosParaEstrangeiros;
	}
	public void setDocumentosParaEstrangeiros(DocumentosParaEstrangeiros documentosParaEstrangeiros) {
		this.documentosParaEstrangeiros = documentosParaEstrangeiros;
	}
	public List<DependenteIr> getDepententesIr() {
		return depententesIr;
	}
	public void setDepententesIr(List<DependenteIr> depententesIr) {
		this.depententesIr = depententesIr;
	}
	public List<DependenteSaude> getDependentesSaude() {
		return dependentesSaude;
	}
	public void setDependentesSaude(List<DependenteSaude> dependentesSaude) {
		this.dependentesSaude = dependentesSaude;
	}
	
	
	
	

}
