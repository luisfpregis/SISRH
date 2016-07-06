package br.com.bip.rh.modelo;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.bip.rh.modelo.enums.VinculoDependenteSaude;

@Entity
public class DadosDependentesSaude {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nomeDependenteSaude;
	private String nomeMaeDependente;
	private Calendar dataDeNascimento;
	private String cpf;
	
	@OneToOne
	private OperadoraPlanoSaude operadoraPlanoSaude;
	@OneToOne	
	private TipoPlanoSaude planoDeSaude;
	
	@Embedded
	private Rg rgDependente;
	@Enumerated (EnumType.STRING)
	private VinculoDependenteSaude vinculoDependenteSaude;
	
	


}
