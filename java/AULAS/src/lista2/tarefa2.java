package lista2;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o 2º número: ");
		num2 = leia.nextInt();
		System.out.println("Digite o 3º número: ");
		num3 = leia.nextInt();

		if (num1 == num2 && num2 == num3){
			System.out.printf("%d - %d - %d",num1,num2,num3);
		}
		else if (num3 > num2 && num2 > num1){
			System.out.printf("%d - %d - %d",num1,num2,num3);
		}
		else if (num1 > num2 && num2 > num3){
			System.out.printf("%d - %d - %d",num3,num2,num1);
		}
		else if (num1 > num2 && num1 > num3 && num3 > num2){
			System.out.printf("%d - %d - %d",num2,num3,num1);
		}
		else if (num2 > num1 && num2 > num3 && num3 > num1){
			System.out.printf("%d - %d - %d",num1,num3,num2);
		}
		else if (num3 > num1 && num3 > num2 && num1 > num2){
			System.out.printf("%d - %d - %d",num2,num1,num3);
		}
		else if (num2 > num1 && num2 > num3 && num1 > num3){
			System.out.printf("%d - %d - %d",num3,num1,num2);
		}
	}

}
