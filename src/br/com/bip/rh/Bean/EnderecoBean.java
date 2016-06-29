package br.com.bip.rh.Bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.bip.rh.modelo.BuscaComCep;
import br.com.bip.rh.modelo.Endereco;

@ManagedBean(name = "mbService")
@RequestScoped
public class EnderecoBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Endereco endereco = new Endereco();
 
    public void encontraCEP() {
        BuscaComCep buscaComCep = new BuscaComCep(endereco.getCep());
        	System.out.println(buscaComCep.getResultado());
        if (buscaComCep.getResultado() == 1) {
            endereco.setTipoLogradouro(buscaComCep.getTipoLogradouro());
            endereco.setLogradouro(buscaComCep.getLogradouro());
            endereco.setEstado(buscaComCep.getEstado());
            endereco.setCidade(buscaComCep.getCidade());
            endereco.setBairro(buscaComCep.getBairro());
        } else {
 
//            FacesContext.getCurrentInstance().addMessage(
//                    null,
//                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
//                            "Servidor não está respondendo",
//                            "Servidor não está respondendo"));
        }
    }

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
    
    

}