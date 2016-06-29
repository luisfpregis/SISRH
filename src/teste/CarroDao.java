package teste;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class CarroDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(Carro carro){
		this.manager.persist(carro);
	}
	
	public List<Carro> lista(){
		
		return this.manager.createQuery("select c from Carro c", Carro.class).getResultList();
	}
	
	

}
