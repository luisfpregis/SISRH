package br.com.bip.rh.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.bip.rh.modelo.OperadoraPlanoSaude;

@Stateless
public class OperadoraPlanoSaudeDao {
	
	@Inject
	private EntityManager manager;
	
	public void adiciona (OperadoraPlanoSaude operadora){
		this.manager.joinTransaction();
		this.manager.persist(operadora);
			
	}
	
	public List<OperadoraPlanoSaude> lista(){
		String jpql = "select p from OperadoraPlanoSaude p";
		
		TypedQuery<OperadoraPlanoSaude> query = manager.createQuery(jpql, OperadoraPlanoSaude.class);
		
		return query.getResultList();
	}
	
	public OperadoraPlanoSaude buscaId (Integer id){
		
		return this.manager.find(OperadoraPlanoSaude.class, id);
		
	}

}
