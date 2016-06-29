package br.com.bip.rh.Bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.bip.rh.Dao.PaisDao;
import br.com.bip.rh.Dao.UfDao;
import br.com.bip.rh.modelo.Pais;
import br.com.bip.rh.modelo.Uf;

@Named
@ViewScoped
public class UfBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Uf> estados;
	private List<Uf> estadosPais;
	private Uf uf = new Uf();
	private Pais pais = new Pais();
	private Integer paisId;
	@Inject
	private UfDao ufDao;
	@Inject
	private PaisDao paisDao;
	
	//-----------------GETTERS AND SETTERS e METODOS-------------------------------
	
	public void grava(){
		
		Pais paisRelacionado = paisDao.busca(paisId);
		uf.setPais(paisRelacionado);
		ufDao.adiciona(uf);
		this.estados = ufDao.lista();		
	}

	public List<Uf> getEstados() {
		if(this.estados == null){	
			this.estados = ufDao.lista();
		}
		
		return this.estados;
	}

	public void setEstados(List<Uf> estados) {
		this.estados = estados;
	}
	
	public void listaPorPais(){
		estadosPais = ufDao.listaPorPais(pais);
	}
	

	public List<Uf> getEstadosPais() {
		
		return estadosPais;
	}

	public void setEstadosPais(List<Uf> estadosPais) {
		this.estadosPais = estadosPais;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public Integer getPaisId() {
		return paisId;
	}

	public void setPaisId(Integer paisId) {
		this.paisId = paisId;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
