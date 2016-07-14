package br.com.bip.rh.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.bip.rh.modelo.Pais;

@Stateless
public class PaisDao {
	
	@Inject
	private EntityManager manager;
	
//	public void adiciona(Pais pais){
//		manager.joinTransaction();
//		this.manager.persist(pais);
//	}
	
	public Pais busca (Integer id){
		
		return this.manager.find(Pais.class, id);
	}
	
	public List<Pais> lista(){
		return this.manager.createQuery("select p from Pais p", Pais.class).getResultList();
	}
	
}
