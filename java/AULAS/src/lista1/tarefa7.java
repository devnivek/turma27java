package lista1;
import java.util.Scanner;

public class tarefa7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Insira o valor de A: ");
		a = leia.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = leia.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = leia.nextDouble();
		System.out.print("Insira o valor de D: ");
		d = leia.nextDouble();
		System.out.print("Insira o valor de E: ");
		e = leia.nextDouble();
		System.out.print("Insira o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("O resultado de X: %.2f e Y: %.2f.",x,y);

	}

}