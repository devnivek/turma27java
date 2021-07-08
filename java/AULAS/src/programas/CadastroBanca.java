package programas;

import java.util.Scanner;

import objetos.Pessoa;

public class CadastroBanca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa clientes = new Pessoa(); 
		
		for(int i=0; i<5; i++) {
			System.out.print("Escreva seu nome: ");
			clientes.nome = leia.next();
			System.out.print("Escreva seu ano de nascimento: ");
			clientes.anoNasc = leia.nextInt();
			
			if(clientes.calcularIdade(2021) >= 18) {
				System.out.println("Parabéns Cringe, você tem acesso a todo acervo da banca!");
			} else {
				System.out.println("Bem vinda Criança, só lamentis mas você não tem acesso ao contéudo para maiores");
			}
		}
		

	}

}
