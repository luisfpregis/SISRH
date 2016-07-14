package br.com.bip.rh.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.bip.rh.modelo.Pais;
import br.com.bip.rh.modelo.Uf;


@Stateless
public class UfDao {
	
	@Inject
	private EntityManager manager;
	
//	public void adiciona(Uf uf){
//		manager.joinTransaction();
//		this.manager.persist(uf);
//	}
	
	public List<Uf> lista(){
		return this.manager.createQuery("select u from Uf u",Uf.class).getResultList();
	}
	
	public List<Uf> listaPorPais(Pais pais){
		
		String jpql = "select u from Uf u where u.pais = :pais order by u.estado asc";
		TypedQuery<Uf> query = manager.createQuery(jpql,Uf.class);	
		query.setParameter("pais", pais);
		return query.getResultList();
		
	}
	

}
