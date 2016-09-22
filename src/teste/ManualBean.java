package teste;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ManualBean extends CarroBean implements Serializable {
    
	private Manual carro = new Manual();

	// OS ATRIBUTOS SE REPETEM NOS BEANS, ENTÃO TODOS ESTÃO NA CLASSE CarroBean
	// E OS DEMAIS BEANS EXTENDEM ESSA CLASSE    
	//--------------------------------------------------------	
		
		public Manual getCarro() {
			return carro;
		}

		public void setCarro(Manual carro) {
			this.carro = carro;
		}
		
		
		public void grava(){

			getSalDao().adicionaSal(getSal());
			
			carro.setSalario(getSal());
			getCarroDao().adiciona(carro);
			
			carro.CalculaDoisSalarios(getSal().getSalario());
			getSalDao().alteraSal(getSal());
			
			//this.carros = carroDao.lista();
			
			limpaFormularioDoJSF();
					
		}
		


		private void limpaFormularioDoJSF() {
			this.carro = new Manual();
			setSal(new TesteSalario());
		}
		
	}