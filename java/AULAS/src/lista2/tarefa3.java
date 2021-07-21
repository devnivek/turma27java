package lista2;
import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		idade= leia.nextInt();

		if(idade>=5 && idade<=7){
			System.out.println("Você está na categoria Infantil A");
		}
		else if(idade>=8 && idade<=11){
			System.out.println("Você está na categoria Infantil B");
		}
		else if(idade>=12 && idade<=13){
			System.out.println("Você está na categoria Juvenil A");
		}
		else if(idade>=14 && idade<=17){
			System.out.println("Você está na categoria Juvenil B");
		}
		else if(idade>17){
			System.out.println("Você está na categoria Adultos");
		}
		else {
			System.out.println("Você não devia nem estar aqui criança!");
		}
	}

}

