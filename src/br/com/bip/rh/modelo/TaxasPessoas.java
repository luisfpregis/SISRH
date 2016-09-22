package br.com.bip.rh.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaxasPessoas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private BigDecimal totalImpostosInssCLT;
	private BigDecimal totalImpostosInssCotista;
	private BigDecimal totalFGTS;

	
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
	public BigDecimal getTotalImpostosInssCLT() {
		return totalImpostosInssCLT;
	}
	public void setTotalImpostosInssCLT(BigDecimal totalImpostosInssCLT) {
		this.totalImpostosInssCLT = totalImpostosInssCLT;
	}
	public BigDecimal getTotalImpostosInssCotista() {
		return totalImpostosInssCotista;
	}
	public void setTotalImpostosInssCotista(BigDecimal totalImpostosInssCotista) {
		this.totalImpostosInssCotista = totalImpostosInssCotista;
	}
	public BigDecimal getTotalFGTS() {
		return totalFGTS;
	}
	public void setTotalFGTS(BigDecimal totalFGTS) {
		this.totalFGTS = totalFGTS;
	}

}
