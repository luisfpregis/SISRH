package br.com.bip.rh.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TipoPlanoSaude {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nomePlano;
	@ManyToOne
	private OperadoraPlanoSaude Operadora;

	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomePlano() {
		return nomePlano;
	}
	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}
	public OperadoraPlanoSaude getOperadora() {
		return Operadora;
	}
	public void setOperadora(OperadoraPlanoSaude operadora) {
		Operadora = operadora;
	}
	
}
