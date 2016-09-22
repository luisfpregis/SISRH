package br.com.bip.rh.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;

@Entity
public abstract class Clt extends Usuario implements MetodosCalculoDeEncargos {
	
	@Override
	public void calculaInss(BigDecimal salario, BigDecimal decimoTerceiroSalario, BigDecimal valorFerias,
			BigDecimal salarioMinimo, BigDecimal impostoInss) {
		
		salario = getDadosProfissionais().getSalario();
		decimoTerceiroSalario = getDadosProfissionais().getEncargos().getDecimoTerceiroSalario();
		valorFerias = getDadosProfissionais().getEncargos().getValorFerias();
								
		BigDecimal inss = salario.add(decimoTerceiroSalario).add(valorFerias).multiply(impostoInss);
		
		getDadosProfissionais().getEncargos().setInss(inss);
		
	}

	
	@Override
	public void calculaDecimoTerceiroSalario(BigDecimal salario) {
		
		salario = getDadosProfissionais().getSalario();
		BigDecimal decimoTerceiroSalario = salario.divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP);
		
		getDadosProfissionais().getEncargos().setDecimoTerceiroSalario(decimoTerceiroSalario);
		
	}
	
	

	@Override
	public void calculaFgts(BigDecimal salario, BigDecimal decimoTerceiroSalario, BigDecimal valorFerias, BigDecimal impostoFgts) {
		
		salario = getDadosProfissionais().getSalario();
		decimoTerceiroSalario = getDadosProfissionais().getEncargos().getDecimoTerceiroSalario();
		valorFerias = getDadosProfissionais().getEncargos().getValorFerias();
								
		BigDecimal fgts = salario.add(decimoTerceiroSalario).add(valorFerias).multiply(impostoFgts);
		
		getDadosProfissionais().getEncargos().setFgts(fgts);
		
	}

	@Override
	public void calculaValorFerias(BigDecimal salario) {
		
		salario = getDadosProfissionais().getSalario();
		BigDecimal valorFerias = salario.divide(new BigDecimal("9"), 2, RoundingMode.HALF_UP);
		
		getDadosProfissionais().getEncargos().setValorFerias(valorFerias);
		
		
	}

	@Override
	public void calculaDissidio(BigDecimal salario) {
		
//		salario = getDadosProfissionais().getSalario();
//		BigDecimal valorDssidio = salario.multiply(new BigDecimal("1").add(augend));
//		
//		getDadosProfissionais().getEncargos().setValorFerias(valorFerias);
		
	}

}
