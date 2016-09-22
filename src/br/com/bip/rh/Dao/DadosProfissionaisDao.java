package br.com.bip.rh.Dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bip.rh.modelo.DadosProfissionais;

@Stateless
public class DadosProfissionaisDao {
	
	@Inject
	private EntityManager manager;
	
	public void adiciona (DadosProfissionais dadosProfissionais){
		this.manager.joinTransaction();
		this.manager.persist(dadosProfissionais);
	}
	
	public void edita (DadosProfissionais dadosProfissionais){
		this.manager.joinTransaction();
		this.manager.merge(dadosProfissionais);
	}

}
