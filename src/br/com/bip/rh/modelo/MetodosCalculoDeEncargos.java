package br.com.bip.rh.modelo;

import java.math.BigDecimal;

public interface MetodosCalculoDeEncargos {
	
	public void calculaInss(BigDecimal salario, BigDecimal decimoTerceiroSalario, BigDecimal valorFerias, BigDecimal salarioMinimo, BigDecimal impostoInss);
	public void calculaDecimoTerceiroSalario (BigDecimal salario);
	public void calculaFgts(BigDecimal salario, BigDecimal decimoTerceiroSalario, BigDecimal valorFerias, BigDecimal impostoFgts);
	public void calculaValorFerias(BigDecimal salario);
	public void calculaDissidio(BigDecimal salario);

}
