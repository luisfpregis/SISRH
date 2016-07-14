package br.com.bip.rh.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import br.com.bip.rh.modelo.enums.ResponsavelPagamento;
import br.com.bip.rh.modelo.enums.VinculoDependenteSaude;

@Entity
public class DependenteSaude {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String nomeMae;
	private Calendar dataDeNascimento;
	private String cpf;
	private BigDecimal valor;
	
	@ManyToOne
	private Usuario funcionario;
	@OneToOne
	private OperadoraPlanoSaude operadoraPlanoSaude;
	@OneToOne	
	private TipoPlanoSaude planoDeSaude;
	
	@Embedded
	private Rg rg;
	
	@Enumerated (EnumType.STRING)
	private VinculoDependenteSaude vinculoDependenteSaude;
	@Enumerated (EnumType.STRING)
	private ResponsavelPagamento responsavelPagamento;
	
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
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public OperadoraPlanoSaude getOperadoraPlanoSaude() {
		return operadoraPlanoSaude;
	}
	public void setOperadoraPlanoSaude(OperadoraPlanoSaude operadoraPlanoSaude) {
		this.operadoraPlanoSaude = operadoraPlanoSaude;
	}
	public TipoPlanoSaude getPlanoDeSaude() {
		return planoDeSaude;
	}
	public void setPlanoDeSaude(TipoPlanoSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	public Rg getRg() {
		return rg;
	}
	public void setRg(Rg rg) {
		this.rg = rg;
	}
	public VinculoDependenteSaude getVinculoDependenteSaude() {
		return vinculoDependenteSaude;
	}
	public void setVinculoDependenteSaude(VinculoDependenteSaude vinculoDependenteSaude) {
		this.vinculoDependenteSaude = vinculoDependenteSaude;
	}
	public Usuario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Usuario funcionario) {
		this.funcionario = funcionario;
	}
	public ResponsavelPagamento getResponsavelPagamento() {
		return responsavelPagamento;
	}
	public void setResponsavelPagamento(ResponsavelPagamento responsavelPagamento) {
		this.responsavelPagamento = responsavelPagamento;
	}
	
	


}
