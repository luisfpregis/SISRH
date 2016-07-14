package br.com.bip.rh.Bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.bip.rh.Dao.PaisDao;
import br.com.bip.rh.modelo.Pais;
import teste.Conta;

@Named
@ViewScoped
public class PaisBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Pais pais = new Pais();
    private List<Pais> paises;
    @Inject
    private PaisDao paisDao;
    
	//-----------------GETTERS AND SETTERS e METODOS-------------------------------
    
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
//	public void grava(){
//		paisDao.adiciona(pais);
//		this.paises = paisDao.lista();
//		
//		limpaFormularioDoJSF();
//	}
	
	public List<Pais> getPaises() {
		if(this.paises == null){
			this.paises = paisDao.lista();
		}
		return paises;
	}
	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
    
	private void limpaFormularioDoJSF() {
		this.pais = new Pais();
	}
    

}
