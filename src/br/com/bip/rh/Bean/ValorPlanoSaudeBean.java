package br.com.bip.rh.Bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.bip.rh.Dao.OperadoraPlanoSaudeDao;
import br.com.bip.rh.Dao.TipoPlanoSaudeDao;
import br.com.bip.rh.Dao.ValorPlanosDeSaudeDao;
import br.com.bip.rh.modelo.OperadoraPlanoSaude;
import br.com.bip.rh.modelo.TipoPlanoSaude;
import br.com.bip.rh.modelo.ValoresPlanosDeSaude;

@Named
@ViewScoped
public class ValorPlanoSaudeBean implements Serializable {
	
	private static final long serialVersionUID = 5794242727979565443L;
	
	@Inject
	private ValorPlanosDeSaudeDao valorDao;
	@Inject
	private OperadoraPlanoSaudeDao operadoraDao;
	@Inject
	private TipoPlanoSaudeDao planoDao;
	
	
	private ValoresPlanosDeSaude valorPlano = new ValoresPlanosDeSaude();
	private Integer operadoraId;
	private Integer planoId;

	
	public void grava (){
		OperadoraPlanoSaude operadoraAtribuida = operadoraDao.buscaId(operadoraId);
		
	}
	


}
