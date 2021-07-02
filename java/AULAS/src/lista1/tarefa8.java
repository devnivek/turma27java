package lista1;
import java.util.Scanner;

public class tarefa8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorFabrica, valorConsumidor;
		
		System.out.print("Insira o valor de fábrica do carro: ");
		valorFabrica = leia.nextDouble();
		
		valorConsumidor = ((valorFabrica*0.28)*100)+((valorFabrica*0.45)*100);
		
		System.out.printf("O consumidor pagará %.2f reais neste carro",valorConsumidor);

	}

}