package br.com.bip.rh.Bean;

import java.io.Serializable;
import java.util.List;

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
public class TipoPlanoSaudeBean implements Serializable{
	

	private static final long serialVersionUID = -9143371380761554576L;
	
	@Inject
	private TipoPlanoSaudeDao planoDao;
	@Inject
	private OperadoraPlanoSaudeDao operadoraDao;
	@Inject
	private ValorPlanosDeSaudeDao valorDao;
	
	private TipoPlanoSaude planoSaude = new TipoPlanoSaude();
	private ValoresPlanosDeSaude valorPlano = new ValoresPlanosDeSaude();
	private Integer operadoraId;

	
	public void grava(){
		OperadoraPlanoSaude operadoraAtibuida = operadoraDao.buscaId(operadoraId);
		planoSaude.setOperadora(operadoraAtibuida);
		planoDao.adiciona(planoSaude);
		valorDao.gravaIdade(valorPlano, planoSaude, operadoraAtibuida);
		
	}
	
	
	public TipoPlanoSaudeDao getPlanoDao() {
		return planoDao;
	}


	public void setPlanoDao(TipoPlanoSaudeDao planoDao) {
		this.planoDao = planoDao;
	}


	public OperadoraPlanoSaudeDao getOperadoraDao() {
		return operadoraDao;
	}


	public void setOperadoraDao(OperadoraPlanoSaudeDao operadoraDao) {
		this.operadoraDao = operadoraDao;
	}


	public TipoPlanoSaude getPlanoSaude() {
		return planoSaude;
	}


	public void setPlanoSaude(TipoPlanoSaude planoSaude) {
		this.planoSaude = planoSaude;
	}
	

	public Integer getOperadoraId() {
		return operadoraId;
	}


	public void setOperadoraId(Integer operadoraId) {
		this.operadoraId = operadoraId;
	}



}
