package teste;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class TesteEncardos {
	
	private BigDecimal doisSalariosE = new BigDecimal("0");
	
	private BigDecimal tresSalariosE = new BigDecimal("0");


	public BigDecimal getDoisSalariosE() {
		return doisSalariosE;
	}

	public void setDoisSalariosE(BigDecimal doisSalariosE) {
		this.doisSalariosE = doisSalariosE;
	}

	public BigDecimal getTresSalariosE() {
		return tresSalariosE;
	}

	public void setTresSalariosE(BigDecimal tresSalariosE) {
		this.tresSalariosE = tresSalariosE;
	}


	
	

}
