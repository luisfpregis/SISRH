package teste;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class CarroDao {
	
	@Inject
	private EntityManager manager;
	
	public void adiciona(Carro carro){
		this.manager.joinTransaction();
		this.manager.persist(carro);
	}
	
	
//	public List<Carro> lista(){
//		
//		return this.manager.createQuery("select c from Carro c", Carro.class).getResultList();
//	}
	
	

}
