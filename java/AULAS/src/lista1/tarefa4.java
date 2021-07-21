package lista1;
import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		System.out.print("Insira o valor de A: ");
		a = leia.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = leia.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.printf("O resultado final é: %.2f.",d);

	}

}