package teste;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class TesteSalarioDao {
	
	@Inject
	private EntityManager manager;
	
	public void adicionaSal (TesteSalario salario){
		manager.joinTransaction();
		manager.persist(salario);
	}
	
	public void alteraSal (TesteSalario salario){
		manager.joinTransaction();
		manager.merge(salario);
	}

}
