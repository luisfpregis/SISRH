package br.com.bip.rh.Dao;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bip.rh.modelo.OperadoraPlanoSaude;
import br.com.bip.rh.modelo.TipoPlanoSaude;
import br.com.bip.rh.modelo.ValoresPlanosDeSaude;

@Stateless
public class ValorPlanosDeSaudeDao {
	
	@Inject
	private EntityManager manager;
	
	private ValoresPlanosDeSaude valorPlano;
	
	private int idadeInicial = 0;
	private int idadeFinal = 18;
	
	public void adiciona(ValoresPlanosDeSaude valorPlano){
		this.manager.joinTransaction();
		this.manager.persist(valorPlano);
	}
	
	public void altera(ValoresPlanosDeSaude valorPlano){
		this.manager.joinTransaction();
//		ValoresPlanosDeSaude planoParaAlterar = this.manager.find(ValoresPlanosDeSaude.class, valorPlano.getId());
		this.manager.merge(valorPlano);
	}
	
	public void gravaIdade(ValoresPlanosDeSaude valorPlano, TipoPlanoSaude planoSaude,
			OperadoraPlanoSaude operadora){
		
		valorPlano.setIdadeInicial(this.idadeInicial);
		valorPlano.setIdadeFinal(this.idadeFinal);
		valorPlano.setValor(new BigDecimal("0"));
		valorPlano.setTipoPlanoSaude(planoSaude);
		valorPlano.setOperadora(operadora);
		adiciona(valorPlano);
		
		valorPlano = new ValoresPlanosDeSaude();
		valorPlano.setIdadeInicial(this.idadeInicial = 19);
		valorPlano.setIdadeFinal(this.idadeFinal = 23);
		valorPlano.setValor(new BigDecimal("0"));
		valorPlano.setTipoPlanoSaude(planoSaude);
		valorPlano.setOperadora(operadora);
		adiciona(valorPlano);
		
		for(int x=1;x<=7;x++ ){
			valorPlano = new ValoresPlanosDeSaude();
			this.idadeInicial = idadeInicial+5;
			this.idadeFinal = idadeFinal+5;
			valorPlano.setIdadeInicial(idadeInicial);
			valorPlano.setIdadeFinal(idadeFinal);
			valorPlano.setValor(new BigDecimal("0"));
			valorPlano.setTipoPlanoSaude(planoSaude);
			valorPlano.setOperadora(operadora);
			adiciona(valorPlano);
		}
		
	}
	
	public List<ValoresPlanosDeSaude>lista(){
		String jpql = "select vp from ValoresPlanosDeSaude vp";
		
		return manager.createQuery(jpql, ValoresPlanosDeSaude.class).getResultList();
		
	}
	
	public void remove(ValoresPlanosDeSaude valorPlano) {
		manager.joinTransaction();
		ValoresPlanosDeSaude planoParaRemover = this.manager.find(ValoresPlanosDeSaude.class, valorPlano.getId());
		this.manager.remove(planoParaRemover);
	}
		
}
