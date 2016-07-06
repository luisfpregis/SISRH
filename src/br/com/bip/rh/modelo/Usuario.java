package br.com.bip.rh.modelo;

import java.io.Serializable;

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
	private DadosBancarios dadosBancarios;
	@OneToOne
	private DocumentosParaBrasileiros documentosParaBrasileiros;
	@OneToOne
	private DocumentosParaEstrangeiros documentosParaEstrangeiros;
	@OneToMany
	private DadosDependentesIr dadosDependentesIr;
	@OneToMany
	private DadosDependentesSaude daodsDependentesSaude;
	

}
