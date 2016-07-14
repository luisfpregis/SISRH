package br.com.bip.rh.Dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bip.rh.modelo.TipoPlanoSaude;

@Stateless
public class TipoPlanoSaudeDao {
	
	@Inject
	private EntityManager manager;
	
	public void adiciona(TipoPlanoSaude planoSaude){
		this.manager.joinTransaction();
		this.manager.persist(planoSaude);
	}
	
	public TipoPlanoSaude buscaId (Integer id){
		return this.manager.find(TipoPlanoSaude.class, id);
	}
}
