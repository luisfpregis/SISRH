package teste;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@ViewScoped
public class CarroBean implements Serializable {
    
    private TipoCambio tc = new TipoCambio();
	private TesteSalario sal = new TesteSalario();
	private List<Carro> carros;
	
	@Inject
	private CarroDao carroDao;
	@Inject
	private TesteSalarioDao salDao;

	
//--------------------------------------------------------	
	
	public TipoCambio getTc() {
		return tc;
	}
	public void setTc(TipoCambio tc) {
		this.tc = tc;
	}
	public TesteSalario getSal() {
		return sal;
	}
	public void setSal(TesteSalario sal) {
		this.sal = sal;
	}
	public List<Carro> getCarros() {
		return carros;
	}
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	public CarroDao getCarroDao() {
		return carroDao;
	}
	public void setCarroDao(CarroDao carroDao) {
		this.carroDao = carroDao;
	}
	public TesteSalarioDao getSalDao() {
		return salDao;
	}
	public void setSalDao(TesteSalarioDao salDao) {
		this.salDao = salDao;
	}

	
	
}
