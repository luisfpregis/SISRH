package br.com.bip.rh.modelo;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ValoresPlanosDeSaude {
	
	@Id
	@GeneratedValue
	private Integer id;
	private int idadeInicial;
	private int idadeFinal;
	private BigDecimal valor;
	@OneToOne
	private OperadoraPlanoSaude operadora;
	@OneToOne
	private TipoPlanoSaude tipoPlanoSaude;


	//-----------------GETTERS AND SETTERS-------------------------------
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getIdadeInicial() {
		return idadeInicial;
	}
	public void setIdadeInicial(int idadeInicial) {
		this.idadeInicial = idadeInicial;
	}
	public int getIdadeFinal() {
		return idadeFinal;
	}
	public void setIdadeFinal(int idadeFinal) {
		this.idadeFinal = idadeFinal;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public OperadoraPlanoSaude getOperadora() {
		return operadora;
	}
	public void setOperadora(OperadoraPlanoSaude operadora) {
		this.operadora = operadora;
	}
	public TipoPlanoSaude getTipoPlanoSaude() {
		return tipoPlanoSaude;
	}
	public void setTipoPlanoSaude(TipoPlanoSaude tipoPlanoSaude) {
		this.tipoPlanoSaude = tipoPlanoSaude;
	}

}
