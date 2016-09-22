package teste;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class PCincoBean extends CarroBean implements Serializable {
        
    private PontoCinco carro = new PontoCinco();

// OS ATRIBUTOS SE REPETEM NOS BEANS, ENTÃO TODOS ESTÃO NA CLASSE CarroBean
// E OS DEMAIS BEANS EXTENDEM ESSA CLASSE    
//--------------------------------------------------------	
	
	public PontoCinco getCarro() {
		return carro;
	}
	public void setCarro(PontoCinco carro) {
		this.carro = carro;
	}
	
	
	public void grava(){

		getSalDao().adicionaSal(getSal());
		
		carro.setSalario(getSal());
		getCarroDao().adiciona(carro);
		
		
		carro.CalculaDoisSalarios(getSal().getSalario());
		carro.CalculaTresSalarios(getSal().getSalario());
		getSalDao().alteraSal(getSal());
		
		
		//this.carros = carroDao.lista();
		
		limpaFormularioDoJSF();
				
	}
	
		
	private void limpaFormularioDoJSF() {
		this.carro = new PontoCinco();
		setSal(new TesteSalario());
	}
	
}
	
