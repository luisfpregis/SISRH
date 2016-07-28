package teste;

import javax.persistence.Entity;

@Entity
public class PontoCinco extends Automatico{

	private String travas;

	public String getTravas() {
		return travas;
	}

	public void setTravas(String travas) {
		this.travas = travas;
	}
	
	
	
}
