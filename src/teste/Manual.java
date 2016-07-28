package teste;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AttributeOverride(name="id", column=@Column(name="mId"))
public class Manual extends Carro {
	
	
	private BigDecimal desconto;
	
		
	public BigDecimal getDesconto() {
		return desconto;
	}



	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}



	public int getCalculaConsumo(){		
		int consumo = 10*2;
		setConsumo(consumo);
		return getConsumo();		
	}
	


}