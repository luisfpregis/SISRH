package br.com.bip.rh.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;

@Entity
public abstract class Cotista extends Usuario implements MetodosCalculoDeEncargos{
	
	@Override
	public void calculaInss(BigDecimal salario, BigDecimal decimoTerceiroSalario, BigDecimal valorFerias,
			BigDecimal salarioMinimo,BigDecimal impostoInss) {
										
		BigDecimal inss = salarioMinimo.multiply(impostoInss);
		
		getDadosProfissionais().getEncargos().setInss(inss);
		
	}

	@Override
	public void calculaDecimoTerceiroSalario(BigDecimal salario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculaFgts(BigDecimal salario, BigDecimal decimoTerceiroSalario, BigDecimal valorFerias, BigDecimal impostoFgts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculaValorFerias(BigDecimal salario) {
		
		salario = getDadosProfissionais().getSalario();
		BigDecimal valorFerias = salario.divide(new BigDecimal("30"), 2, RoundingMode.HALF_UP).multiply(new BigDecimal("1.75"));
		
		getDadosProfissionais().getEncargos().setValorFerias(valorFerias);
		
	}

	@Override
	public void calculaDissidio(BigDecimal salario) {
		// TODO Auto-generated method stub
		
	}

}
