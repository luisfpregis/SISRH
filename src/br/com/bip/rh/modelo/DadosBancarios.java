package br.com.bip.rh.modelo;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.bip.rh.modelo.enums.TipoDeConta;

@Entity
public class DadosBancarios {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String banco;
	private String agencia;
	@Enumerated	
	private TipoDeConta tipoDeConta;
	
	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public TipoDeConta getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(TipoDeConta tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
	

}
