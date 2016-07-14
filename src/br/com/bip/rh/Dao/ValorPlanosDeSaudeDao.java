package br.com.bip.rh.Dao;

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
	
	private int idadeInicial = 0;
	private int idadeFinal = 18;
	
	public void adiciona(ValoresPlanosDeSaude valorPlano){
		manager.joinTransaction();
		manager.persist(valorPlano);
	}
	
	public void gravaIdade(ValoresPlanosDeSaude valorPlano, TipoPlanoSaude planoSaude,
			OperadoraPlanoSaude operadora){
		
		valorPlano.setIdadeInicial(this.idadeInicial);
		valorPlano.setIdadeFinal(this.idadeFinal);
		valorPlano.setTipoPlanoSaude(planoSaude);
		valorPlano.setOperadora(operadora);
		adiciona(valorPlano);
		
		valorPlano = new ValoresPlanosDeSaude();
		valorPlano.setIdadeInicial(this.idadeInicial = 19);
		valorPlano.setIdadeFinal(this.idadeFinal = 23);
		valorPlano.setTipoPlanoSaude(planoSaude);
		valorPlano.setOperadora(operadora);
		adiciona(valorPlano);
		
		for(int x=1;x<=7;x++ ){
			valorPlano = new ValoresPlanosDeSaude();
			this.idadeInicial = idadeInicial+5;
			this.idadeFinal = idadeFinal+5;
			valorPlano.setIdadeInicial(idadeInicial);
			valorPlano.setIdadeFinal(idadeFinal);
			valorPlano.setTipoPlanoSaude(planoSaude);
			valorPlano.setOperadora(operadora);
			adiciona(valorPlano);
		}
		
	}
	
}
