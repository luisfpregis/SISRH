package br.com.bip.rh.Bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.bip.rh.Dao.ValorPlanosDeSaudeDao;
import br.com.bip.rh.modelo.ValoresPlanosDeSaude;

@Named
@ViewScoped
public class ValorPlanoSaudeBean implements Serializable {
	
	private static final long serialVersionUID = 5794242727979565443L;
	
	private List<ValoresPlanosDeSaude> valores;
	
	@Inject
	private ValorPlanosDeSaudeDao valorDao;
	
//	private ValoresPlanosDeSaude valorPlano = new ValoresPlanosDeSaude();
	
	private BigDecimal valorDoPlano = new BigDecimal("0");
	

	public List<ValoresPlanosDeSaude> getValores() {
		if(this.valores == null){
			this.valores = valorDao.lista();
		}
		return valores;
	}

	public void setValores(List<ValoresPlanosDeSaude> valores) {
		this.valores = valores;
	}

	public BigDecimal getValorDoPlano() {
		return valorDoPlano;
	}

	public void setValorDoPlano(BigDecimal valorDoPlano) {
		this.valorDoPlano = valorDoPlano;
	}
	
	
	
//	public ValoresPlanosDeSaude getValorPlano() {
//		return valorPlano;
//	}
//
//	public void setValorPlano(ValoresPlanosDeSaude valorPlano) {
//		this.valorPlano = valorPlano;
//	}
	

	public void gravaValorPlano(ValoresPlanosDeSaude valorPlano){
		
//		valorPlano.setValor(valorDoPlano);
		
//		System.out.println(valorPlano.getId());
//		System.out.println(valorPlano.getValor());
//		System.out.println(valorDoPlano);
		
		valorDao.altera(valorPlano);
		this.valores = valorDao.lista();
	}
	
}
