package teste;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ContaDao {
	
	@PersistenceContext
	private EntityManager manager;

	public void adiciona(Conta conta) {
		this.manager.persist(conta);
	}

	public Conta busca(Integer id) {
		return this.manager.find(Conta.class, id);
	}

	public List<Conta> lista() {
		return this.manager.createQuery("select c from Conta c", Conta.class)
				.getResultList();
	}

//	public void remove(Conta conta) {
//		Conta contaParaRemover = this.manager.find(Conta.class, conta.getId());
//		this.manager.remove(contaParaRemover);
//	}
//	
//	public void altera(Conta conta){
////		Conta contaAlterar = this.manager.find(Conta.class, conta.getId());	
//		this.manager.merge(conta);
//		
//	}

}




