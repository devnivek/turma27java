package lista1;

import java.util.Scanner;

public class novo {

	public static void main(String[] args) {
		
		int num;
		Scanner leia = new Scanner(System.in);

		System.out.println("digite um número:");
		num = leia.nextInt();
		
		if (num<0){
			System.out.println("O número "+num+" é negativo, ");
		}
		
		if (num==0){
			System.out.println("O número "+num+" é neutro");
		}

		if ((num%2)==0){
			System.out.println("O número "+num+" é par");
		} else {
			System.out.println("O número "+num+" é ímpar");
		}
		leia.close();
	}

}
