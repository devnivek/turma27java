package lista2;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o 2º número: ");
		num2 = leia.nextInt();
		System.out.println("Digite o 3º número: ");
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3){
			System.out.println("O número "+num1+" é o maior");
		}
		else if (num2 > num1 && num2 > num3){
			System.out.println("O número "+num2+" é o maior");
		}
		else if (num3 > num2 && num3 > num1){
			System.out.println("O número "+num3+" é o maior");
		}
	}

}
