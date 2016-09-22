package br.com.bip.rh.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DadosProfissionais {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String cargo;
	private String tipoDoContrato;
	private Calendar dataDeAdmicao;
	private String  cidadeBase;
	private BigDecimal salario;
	
	@Embedded
	private Encargos encargos = new Encargos();
	
	
	//-----------------GETTERS AND SETTERS-------------------------------
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTipoDoContrato() {
		return tipoDoContrato;
	}

	public void setTipoDoContrato(String tipoDoContrato) {
		this.tipoDoContrato = tipoDoContrato;
	}

	public Calendar getDataDeAdmicao() {
		return dataDeAdmicao;
	}

	public void setDataDeAdmicao(Calendar dataDeAdmicao) {
		this.dataDeAdmicao = dataDeAdmicao;
	}

	public String getCidadeBase() {
		return cidadeBase;
	}

	public void setCidadeBase(String cidadeBase) {
		this.cidadeBase = cidadeBase;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Encargos getEncargos() {
		return encargos;
	}

	public void setEncargos(Encargos encargos) {
		this.encargos = encargos;
	}

	
	

}
