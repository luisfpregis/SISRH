package br.com.bip.rh.Bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.bip.rh.modelo.ConsultorClt;

@Named
@ViewScoped
public class ConsultorCltBean extends UsuarioBean {
	
	 private ConsultorClt consultorClt = new ConsultorClt();
	 
	 
	 public void grava (){
		 getDadosPessoaisDao().adiciona(getDadosPessoais());
		 
		 consultorClt.setDadosPessoais(getDadosPessoais());
		 getUsuarioDao().adiciona(consultorClt);
		 
	 }
		
//		-------------------GETTERS AND SETTERS------------------

	public ConsultorClt getConsultorClt() {
		return consultorClt;
	}

	public void setConsultorClt(ConsultorClt consultorClt) {
		this.consultorClt = consultorClt;
	}
	 
	 

}
