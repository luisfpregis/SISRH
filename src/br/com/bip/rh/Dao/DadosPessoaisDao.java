package br.com.bip.rh.Dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bip.rh.modelo.DadosPessoais;

@Stateless
public class DadosPessoaisDao {

	@Inject
	private EntityManager manager;
	
	public void adiciona (DadosPessoais dadosPessoais){
		this.manager.joinTransaction();
		this.manager.persist(dadosPessoais);
	}
	
	public void alterar(DadosPessoais dadosPessoais){
		this.manager.merge(dadosPessoais);
	}
	
}
