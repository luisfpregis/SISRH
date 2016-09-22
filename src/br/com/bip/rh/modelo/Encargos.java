package br.com.bip.rh.modelo;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Encargos {
	
	
	private BigDecimal inss = new BigDecimal("0");
	private BigDecimal decimoTerceiroSalario = new BigDecimal("0");
	private BigDecimal fgts = new BigDecimal("0");
	private BigDecimal valorFerias = new BigDecimal("0");
	private BigDecimal dissidio = new BigDecimal("0");

	
	//-----------------GETTERS AND SETTERS-------------------------------
	
	
	public BigDecimal getInss() {
		return inss;
	}

	public void setInss(BigDecimal inss) {
		this.inss = inss;
	}
	public BigDecimal getDecimoTerceiroSalario() {
		return decimoTerceiroSalario;
	}
	public void setDecimoTerceiroSalario(BigDecimal decimoTerceiroSalario) {
		this.decimoTerceiroSalario = decimoTerceiroSalario;
	}
	public BigDecimal getFgts() {
		return fgts;
	}
	public void setFgts(BigDecimal fgts) {
		this.fgts = fgts;
	}
	public BigDecimal getValorFerias() {
		return valorFerias;
	}
	public void setValorFerias(BigDecimal valorFerias) {
		this.valorFerias = valorFerias;
	}
	public BigDecimal getDissidio() {
		return dissidio;
	}
	public void setDissidio(BigDecimal dissidio) {
		this.dissidio = dissidio;
	}
	

}
