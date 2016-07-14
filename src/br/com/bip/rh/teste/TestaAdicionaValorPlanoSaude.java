package br.com.bip.rh.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.bip.rh.modelo.ValoresPlanosDeSaude;


public class TestaAdicionaValorPlanoSaude {
		
	public static void main(String[] args) {
		List<ValoresPlanosDeSaude> valores = new ArrayList<ValoresPlanosDeSaude>();
		int idadeInicial=1;
		int idadeFinal=2;
		ValoresPlanosDeSaude planoValores = new ValoresPlanosDeSaude();
		
		planoValores.setIdadeInicial(idadeInicial);
		planoValores.setIdadeFinal(idadeFinal);
		
		valores.add(planoValores);
				
		for(ValoresPlanosDeSaude valor : valores){
			System.out.println(valores);
		}
		
		
		
	}

}
