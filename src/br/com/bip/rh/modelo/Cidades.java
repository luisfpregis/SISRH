package br.com.bip.rh.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidades implements Serializable {
	 
		private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String cidade;
	@ManyToOne
	private Uf estado;
	
	
//-----------------GETTERS AND SETTERS-------------------------------
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Uf getEstado() {
		return estado;
	}
	public void setEstado(Uf estado) {
		this.estado = estado;
	}
	
	
	

}
