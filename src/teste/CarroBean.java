package teste;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@ViewScoped
public class CarroBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private TipoCambio tc = new TipoCambio();
	
	public String selecionaClasse(){
		if(tc.getCambio().equals(Cambio.AUTO)){	
			return "/carroautomatico.faces?faces-redirect=true";
		}else if (tc.getCambio().equals(Cambio.MANUAL)) {
			
			return "/carromanual.faces?faces-redirect=true";
			
		}
		return "/direciona.faces?faces-redirect=true";
		
	}
	
		

	public TipoCambio getTc() {
		return tc;
	}
	public void setTc(TipoCambio tc) {
		this.tc = tc;
	}
	
	public Cambio[] getTiposDeCambio() {
		return Cambio.values();
	}

	
	
	

//	private void limpaFormularioDoJSF() {
//		this.carro = new Carro();
//	}
	
}
