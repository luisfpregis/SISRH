package br.com.bip.rh.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.bip.rh.modelo.Pais;
import teste.Conta;

@Stateless
public class PaisDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(Pais pais){		
		this.manager.persist(pais);
	}
	
	public Pais busca (Integer id){
		
		return this.manager.find(Pais.class, id);
	}
	
	public List<Pais> lista(){
		return this.manager.createQuery("select p from Pais p", Pais.class).getResultList();
	}
	
}
