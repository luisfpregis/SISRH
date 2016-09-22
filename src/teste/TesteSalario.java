package teste;

import java.math.BigDecimal;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TesteSalario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private String nome;
	private BigDecimal Salario;
	
	@Embedded
	private TesteEncardos doisSalarios = new TesteEncardos();
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSalario() {
		return Salario;
	}
	public void setSalario(BigDecimal salario) {
		Salario = salario;
	}
	public TesteEncardos getDoisSalarios() {
		return doisSalarios;
	}
	public void setDoisSalarios(TesteEncardos doisSalarios) {
		this.doisSalarios = doisSalarios;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	
}
