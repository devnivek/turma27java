package entidades;

import java.util.Scanner;

public class MenuPrincipal{
	
	Scanner leia = new Scanner(System.in);

	private char opcao;
	private boolean repete;
	
	public boolean isRepete() {
		return repete;
	}

	public void setRepete(boolean repete) {
		this.repete = repete;
	}

	public void getCabecalho() {	
		System.out.println("\n===========================================================");
		System.out.println("                        G5 JEDBANK");
		System.out.println("===========================================================");
		System.out.println("SE VOCÊ NÃO CUIDA DO SEU DINHEIRO, A GENTE CUIDA PARA VOCÊ!");
		System.out.println("===========================================================\n");
	}

	public boolean repeteOperacao() {
		
		System.out.print("DESEJA REALIZAR OUTRA MOVIMENTAÇÃO (S/N): ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		if(opcao == 'S') {
			repete = true;
			return repete;
		}
		else {
			repete = false;
			return repete;
		}
	}
    
	

}
