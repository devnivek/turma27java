package lista1;
import java.util.Scanner;

public class tarefa6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double d, x1, x2, y1, y2;
		
		System.out.print("Insira o valor de X1: ");
		x1 = leia.nextDouble();
		System.out.print("Insira o valor de X2: ");
		x2 = leia.nextDouble();
		System.out.print("Insira o valor de Y1: ");
		y1 = leia.nextDouble();
		System.out.print("Insira o valor de Y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		
		System.out.printf("O resultado da distância D é: %.2f.",d);

	}

}