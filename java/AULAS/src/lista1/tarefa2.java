package lista1;
import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos;
		
		System.out.println("Insira o total de dias: ");
		dias = leia.nextInt();

		anos = dias/365;
		dias = dias%365;
		meses = dias/30;
		dias = dias%30;
		
		System.out.printf("Você possui %d anos, %d meses e %d dias.",anos,meses,dias);

	}

}
