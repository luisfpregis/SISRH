package br.com.bip.rh.Dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bip.rh.modelo.Usuario;

@Stateless
public class UsuarioDao {
	
	@Inject
	private EntityManager manager;
	
	public void adiciona (Usuario usuario){
		this.manager.joinTransaction();
		this.manager.persist(usuario);
	}
	
	public void altera (Usuario usuario){
		this.manager.merge(usuario);
	}
	
	

}
