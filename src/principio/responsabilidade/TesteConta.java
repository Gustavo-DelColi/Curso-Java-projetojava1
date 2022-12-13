package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do Gustavo");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinherio(400);
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		
		System.out.println(bancaria);
		
		String string = new String();
		
		string.getBytes();
	}

}
