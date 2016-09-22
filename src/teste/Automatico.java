package teste;


import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public abstract class Automatico extends Carro implements CarroMetodos{
	
	
	public int getCalculaConsumo(){		
		int consumo = 10*1;
		setConsumo(consumo);
		return getConsumo();	
	}


	public void CalculaDoisSalarios(BigDecimal salario){		
		salario = getSalario().getSalario();		
		BigDecimal doisSalarios = salario.multiply(new BigDecimal("2"));				
		getSalario().getDoisSalarios().setDoisSalariosE(doisSalarios);	
	}


	public void CalculaTresSalarios(BigDecimal salario) {
		salario = getSalario().getSalario();		
		BigDecimal tresSalarios = salario.multiply(new BigDecimal("3"));				
		getSalario().getDoisSalarios().setTresSalariosE(tresSalarios);
		
	}

	
	
}