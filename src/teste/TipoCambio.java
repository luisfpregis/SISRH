package teste;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class TipoCambio {
	
	@Enumerated(EnumType.STRING)
	private Cambio cambio;

	public Cambio getCambio() {
		return cambio;
	}

	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	
	

}
