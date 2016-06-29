package br.com.bip.rh.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OperadoraPlanoSaude {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nomeOperadora;

}
