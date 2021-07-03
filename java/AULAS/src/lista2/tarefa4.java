package lista2;
import java.util.Scanner;

public class tarefa4 {

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
			System.out.printf("A raiz quadrada de %d é %.2f",num,Math.sqrt(num));
		} else {
			System.out.println("O número "+num+" é ímpar");
			System.out.println("O número "+num+" ao quadrado é "+Math.pow(num,2));
		}
		leia.close();
	}

}