package programas;

import objetos.Conta;

public class Bankel {

	public static void main(String[] args) {

		Conta cliente1 = new Conta(002,547.60,1000);
		
		cliente1.exibeExtrato();
		cliente1.sacar(4);
		cliente1.exibeExtrato();
		cliente1.depositar(238.3);
		cliente1.exibeExtrato();
		
		

	}

}
