package br.com.bip.rh.Bean;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.bip.rh.Dao.DadosPessoaisDao;
import br.com.bip.rh.Dao.UsuarioDao;
import br.com.bip.rh.modelo.DadosPessoais;

public class UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DadosPessoais dadosPessoais = new DadosPessoais();
	
	@Inject
	private UsuarioDao usuarioDao;
	
	@Inject
	private DadosPessoaisDao dadosPessoaisDao;


	
//	-------------------GETTERS AND SETTERS------------------
	
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	public DadosPessoaisDao getDadosPessoaisDao() {
		return dadosPessoaisDao;
	}

	public void setDadosPessoaisDao(DadosPessoaisDao dadosPessoaisDao) {
		this.dadosPessoaisDao = dadosPessoaisDao;
	}

}
