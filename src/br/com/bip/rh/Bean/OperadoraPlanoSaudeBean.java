package br.com.bip.rh.Bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.bip.rh.Dao.OperadoraPlanoSaudeDao;
import br.com.bip.rh.modelo.OperadoraPlanoSaude;

@Named
@ViewScoped
public class OperadoraPlanoSaudeBean implements Serializable{

	private static final long serialVersionUID = 6835814091302362438L;
	
	private OperadoraPlanoSaude operadora = new OperadoraPlanoSaude();
	@Inject
	private OperadoraPlanoSaudeDao dao;
	private List<OperadoraPlanoSaude> operadoras;

	public OperadoraPlanoSaude getOperadora() {
		return operadora;
	}

	public void setOperadora(OperadoraPlanoSaude operadora) {
		this.operadora = operadora;
	}
	
	public void grava (){
		dao.adiciona(operadora);
	}

	public List<OperadoraPlanoSaude> getOperadoras() {
		if(this.operadoras == null){
		this.operadoras = dao.lista();
	}
	return operadoras;
	}

	public void setOperadoras(List<OperadoraPlanoSaude> operadoras) {
		this.operadoras = operadoras;
	}
	


}
