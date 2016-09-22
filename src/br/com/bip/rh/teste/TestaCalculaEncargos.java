package br.com.bip.rh.teste;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.bip.rh.modelo.ConsultorClt;
import br.com.bip.rh.modelo.ConsultorCotista;
import br.com.bip.rh.modelo.DadosProfissionais;
import br.com.bip.rh.modelo.SalarioMinimo;
import br.com.bip.rh.modelo.TaxasPessoas;

public class TestaCalculaEncargos {
	
	@Test
	public void testaOCalculoDeInssClt() {
		
		DadosProfissionais dadosProfissionais = new DadosProfissionais();
		ConsultorClt consultorClt = new ConsultorClt();
				
		dadosProfissionais.setSalario(new BigDecimal("100"));
		dadosProfissionais.getEncargos().setDecimoTerceiroSalario(new BigDecimal("10"));
		dadosProfissionais.getEncargos().setValorFerias(new BigDecimal("100"));
		
		consultorClt.setDadosProfissionais(dadosProfissionais);
		
		BigDecimal salario = new BigDecimal("100");
		BigDecimal decimoTerceiroSalario = new BigDecimal("10");
		BigDecimal valorFerias = new BigDecimal("100");
		BigDecimal salarioMinimo = new BigDecimal("0");
		BigDecimal impostoInss = new BigDecimal("0.278");


		consultorClt.calculaInss(salario, decimoTerceiroSalario, valorFerias, salarioMinimo, impostoInss);
		
		BigDecimal resultado = dadosProfissionais.getEncargos().getInss();
				
		org.junit.Assert.assertEquals(new BigDecimal("58.380"), resultado);
		
	}

	
	@Test
	public void testaOCalculoDeInssCotista() {
		
		DadosProfissionais dadosProfissionais = new DadosProfissionais();
		ConsultorCotista consultorCotista = new ConsultorCotista();
		
		dadosProfissionais.setSalario(new BigDecimal("0"));
		dadosProfissionais.getEncargos().setDecimoTerceiroSalario(new BigDecimal("0"));
		dadosProfissionais.getEncargos().setValorFerias(new BigDecimal("0"));
		
		consultorCotista.setDadosProfissionais(dadosProfissionais);
		
		BigDecimal salario = new BigDecimal("0");
		BigDecimal decimoTerceiroSalario = new BigDecimal("0");
		BigDecimal valorFerias = new BigDecimal("0");
		BigDecimal salarioMinimo = new BigDecimal("100");
		BigDecimal impostoInss = new BigDecimal("0.278");
		
		consultorCotista.calculaInss(salario, decimoTerceiroSalario, valorFerias, salarioMinimo, impostoInss);

		BigDecimal resultado = dadosProfissionais.getEncargos().getInss();

		org.junit.Assert.assertEquals(new BigDecimal("27.800"), resultado);
	}

	@Test
	public void testaCalculoDeDecimoTerceiroSalarioClt() {
		
		DadosProfissionais dadosProfissionais = new DadosProfissionais();
		ConsultorClt consultorClt = new ConsultorClt();
				
		dadosProfissionais.setSalario(new BigDecimal("1200"));
		BigDecimal salario = new BigDecimal("1200");
		
		consultorClt.setDadosProfissionais(dadosProfissionais);
		
		consultorClt.calculaDecimoTerceiroSalario(salario);
		
		BigDecimal resultado = dadosProfissionais.getEncargos().getDecimoTerceiroSalario();

		org.junit.Assert.assertEquals(new BigDecimal("100.00"), resultado);
		
		
	}

	@Test
	public void testaCalculoDeFgtsClt() {
		
		DadosProfissionais dadosProfissionais = new DadosProfissionais();
		ConsultorClt consultorClt = new ConsultorClt();
				
		dadosProfissionais.setSalario(new BigDecimal("100"));
		dadosProfissionais.getEncargos().setDecimoTerceiroSalario(new BigDecimal("10"));
		dadosProfissionais.getEncargos().setValorFerias(new BigDecimal("100"));
		
		consultorClt.setDadosProfissionais(dadosProfissionais);
		
		BigDecimal salario = new BigDecimal("100");
		BigDecimal decimoTerceiroSalario = new BigDecimal("10");
		BigDecimal valorFerias = new BigDecimal("100");
		BigDecimal impostoFgts = new BigDecimal("0.08");


		consultorClt.calculaFgts(salario, decimoTerceiroSalario, valorFerias, impostoFgts);
		
		BigDecimal resultado = dadosProfissionais.getEncargos().getFgts();
				
		org.junit.Assert.assertEquals(new BigDecimal("16.80"), resultado);

		
	}

	
	@Test	
	public void calculaValorFeriasClt() {

		DadosProfissionais dadosProfissionais = new DadosProfissionais();
		ConsultorClt consultorClt = new ConsultorClt();
				
		dadosProfissionais.setSalario(new BigDecimal("900"));
		BigDecimal salario = new BigDecimal("900");
		
		consultorClt.setDadosProfissionais(dadosProfissionais);
		
		consultorClt.calculaValorFerias(salario);
		
		BigDecimal resultado = dadosProfissionais.getEncargos().getValorFerias();

				
		org.junit.Assert.assertEquals(new BigDecimal("100.00"), resultado);
		
	}
	
	
	@Test	
	public void calculaValorFeriasCotista() {

		DadosProfissionais dadosProfissionais = new DadosProfissionais();
		ConsultorCotista consultorCotista = new ConsultorCotista();
				
		dadosProfissionais.setSalario(new BigDecimal("100"));
		BigDecimal salario = new BigDecimal("100");
		
		consultorCotista.setDadosProfissionais(dadosProfissionais);
		
		consultorCotista.calculaValorFerias(salario);
		
		BigDecimal resultado = dadosProfissionais.getEncargos().getValorFerias();
		System.out.println(resultado);
				
		org.junit.Assert.assertEquals(new BigDecimal("5.8275"), resultado);
		
	}
//
//	@Test
//	public void calculaDissidio(BigDecimal salario) {
//
//		
//	}

}
