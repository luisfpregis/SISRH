package teste;


import javax.persistence.Entity;

@Entity
public class Automatico extends Carro{
	
	public int getCalculaConsumo(){		
		int consumo = 10*1;
		setConsumo(consumo);
		return getConsumo();	
	}

}
