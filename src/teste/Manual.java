package teste;

import javax.persistence.Entity;

@Entity
public class Manual extends Carro {
	
	public int getCalculaConsumo(){		
		int consumo = 10*2;
		setConsumo(consumo);
		return getConsumo();		
	}

}
