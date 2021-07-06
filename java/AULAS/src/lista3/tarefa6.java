package lista3;

import java.util.Scanner;

public class tarefa6 {

	public static void main(String[] args) {

		int n = 0;
		double soma=0, cont=0, media=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite uma idade: ");
			n=leia.nextInt();
			if(n%3 == 0.0) {
				soma += n;
				cont++;
			}
		}while(n!=0);
		
		media = soma/(cont-1);
		System.out.println("A média dos números múltiplos de 3 é: "+media);
		leia.close();

	}

}
