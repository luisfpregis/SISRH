package teste;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class AutomaticoBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private TipoCambio tc = new TipoCambio();
    private String teste;
	private Automatico carro = new Automatico();
	private List<Carro> carros;
	@Inject
	private CarroDao carroDao;
	
	
	public Automatico getCarro() {
		return carro;
	}
	public void setCarro(Automatico carro) {
		this.carro = carro;
	}
	

	public void grava(){
		carroDao.adiciona(carro);
		//this.carros = carroDao.lista();
		
//		limpaFormularioDoJSF();
				
	}
	
	public List<Carro> getCarros() {
		
		if(this.carros == null){
			this.carros = carroDao.lista();
		}
		
		return this.carros;
	}
	
	
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
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
	public String getTeste() {
		return teste;
	}
	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
	

//	private void limpaFormularioDoJSF() {
//		this.carro = new Carro();
//	}
	
}
