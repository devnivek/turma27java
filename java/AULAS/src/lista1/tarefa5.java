package lista1;
import java.util.Scanner;

public class tarefa5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double a, b, c, r;
		
		System.out.print("Insira o valor da 1º nota: ");
		a = leia.nextDouble();
		System.out.print("Insira o valor da 2º nota: ");
		b = leia.nextDouble();
		System.out.print("Insira o valor da 3º nota: ");
		c = leia.nextDouble();
		
		r = ((a*2)+(b*3)+(c*5))/10;
		
		System.out.printf("O resultado da média foi de %.2f ",r);
	}

}
