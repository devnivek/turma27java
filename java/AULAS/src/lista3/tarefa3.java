package lista3;

import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		
		int idade=0, conta21=0, conta50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade != (-99)) {
			System.out.print("Digite uma idade: ");
			idade=leia.nextInt();
			if(idade < 21 && idade>0) {
				conta21++;
			} else if(idade > 50) {
				conta50++;
			}
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+conta21);
		System.out.println("Total de pessoas com mais de 50 anos: "+conta50);

	}

}
