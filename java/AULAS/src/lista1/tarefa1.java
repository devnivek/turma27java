package lista1;
import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos, resultado;
		
		System.out.print("Descreva sua idade separadamente abaixo: \nAnos:");
		anos = leia.nextInt();
		System.out.print("Meses:");
		meses = leia.nextInt();
		System.out.print("Dias:");
		dias = leia.nextInt();

		resultado = ((anos*365)+(meses*30)+dias);
		System.out.printf("Sua idade total convertida é de: %d dias ",resultado);

	}

}
