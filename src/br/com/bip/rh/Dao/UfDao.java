package br.com.bip.rh.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.bip.rh.modelo.Pais;
import br.com.bip.rh.modelo.Uf;


@Stateless
public class UfDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(Uf uf){
		this.manager.persist(uf);
	}
	
	public List<Uf> lista(){
		return this.manager.createQuery("select u from Uf u",Uf.class).getResultList();
	}
	
	public List<Uf> listaPorPais(Pais pais){
		
		String jpql = "select u from Uf u where u.pais = :pais order by u.estado asc";
		Query query = manager.createQuery(jpql);	
		query.setParameter("pais", pais);
		return query.getResultList();
		
	}
	

}
