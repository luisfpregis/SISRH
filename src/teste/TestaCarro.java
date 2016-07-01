package teste;

public class TestaCarro {
	
	public static void main(String[] args) {
		PontoCinco pc = new PontoCinco();
		
		pc.setMarca("Ford");
		pc.setNomeModelo("ranger");
		
		System.out.println(pc.getMarca());
		System.out.println(pc.getNomeModelo());
		System.out.println(pc.getCalculaConsumo());
		
	}

}
