package br.com.bip.rh.Dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bip.rh.modelo.DocumentosParaEstrangeiros;

public class DocumentosParaEstrangeirosDao {

		@Inject
		private EntityManager manager;
		
		public void adiciona (DocumentosParaEstrangeiros docEstrangeiros){
			this.manager.joinTransaction();
			this.manager.persist(docEstrangeiros);
		}
		
		public void alterar(DocumentosParaEstrangeiros docEstrangeiros){
			this.manager.merge(docEstrangeiros);
		}
}
