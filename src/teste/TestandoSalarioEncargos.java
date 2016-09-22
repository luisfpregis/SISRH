package teste;

import java.math.BigDecimal;

public class TestandoSalarioEncargos {
	
	public static void main(String[] args) {
		
		TesteSalario tSalario = new TesteSalario();
//		TesteSalarioBean sBean = new TesteSalarioBean();
		
		tSalario.setNome("Juquinha");
		tSalario.setSalario(new BigDecimal("100"));

		
		String nome = tSalario.getNome();
		BigDecimal salario = tSalario.getSalario();
		
		tSalario.getDoisSalarios().setDoisSalariosE(salario);;
		BigDecimal dS = tSalario.getDoisSalarios().getDoisSalariosE();
		
//		BigDecimal dS = sBean.doisSalarios(salario);
		
		System.out.println(nome);
		System.out.println(salario);
		System.out.println(dS);
		
	}

}
