package br.com.bip.rh.teste;

import org.junit.Test;

import br.com.bip.rh.Bean.EnderecoBean;
import br.com.bip.rh.modelo.BuscaComCep;
import br.com.bip.rh.modelo.Endereco;
import junit.framework.Assert;

public class testaBuscaComCep {
	
	@Test
	public void retornaOBairroVilaOlimpiaNoCepInformado () {
		Endereco endereco;

				
		EnderecoBean busca = new EnderecoBean();
		
		endereco = busca.getEndereco();
		endereco.setCep("04550004");
				
		busca.encontraCEP();
		
		org.junit.Assert.assertEquals("Vila Olímpia", endereco.getBairro());
				
	}
	

	@Test
	public void retornaOLogradouroETipoRuaAlvoradaNoCepInformado () {
		Endereco endereco;
	
				
		EnderecoBean busca = new EnderecoBean();
		
		endereco = busca.getEndereco();
		endereco.setCep("04550004");
				
		busca.encontraCEP();
		
		org.junit.Assert.assertEquals("Rua Alvorada", endereco.getTipoLogradouro() + " " + endereco.getLogradouro());
		
	}
	
	@Test
	public void retornaACidadeSaoPauloNoCepInformado () {
		Endereco endereco;
	
				
		EnderecoBean busca = new EnderecoBean();
		
		endereco = busca.getEndereco();
		endereco.setCep("04550004");
				
		busca.encontraCEP();
		
		org.junit.Assert.assertEquals("São Paulo", endereco.getCidade());
		
	}	



	@Test
	public void retornaOEstadoSpNoCepInformado () {
		Endereco endereco;
	
				
		EnderecoBean busca = new EnderecoBean();
		
		endereco = busca.getEndereco();
		endereco.setCep("04550004");
				
		busca.encontraCEP();
		
		org.junit.Assert.assertEquals("SP", endereco.getEstado());
		
	}	

}