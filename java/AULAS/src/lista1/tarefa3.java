package lista1;
import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoEvento, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		tempoEvento = leia.nextInt();

		horas = tempoEvento/3600;
		minutos = (tempoEvento%3600)/60;
		segundos = (tempoEvento%3600)%60;
		
		System.out.printf("O evento tem %d hora(s), %d minuto(s) e %d segundo(s).",horas,minutos,segundos);

	}

}