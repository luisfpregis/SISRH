package teste;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Manual extends Carro implements CarroMetodos {
	
	public int getCalculaConsumo(){		
		int consumo = 10*2;
		setConsumo(consumo);
		return getConsumo();		
	}

	@Override
	public void CalculaDoisSalarios(BigDecimal salario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalculaTresSalarios(BigDecimal salario) {
		// TODO Auto-generated method stub
		
	}
	

	


}