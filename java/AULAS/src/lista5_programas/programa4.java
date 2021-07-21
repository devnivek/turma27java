package lista5_programas;

import java.util.Scanner;

import lista5_objetos.Funcionario;

public class programa4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Funcionario operador = new Funcionario();
		
		System.out.print("Digite o nome do funcionário: ");
		operador.nome = leia.next().toUpperCase();
		System.out.print("Digite o valor hora: ");
		operador.valorHora = leia.nextDouble();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		operador.horasTrabalhadas = leia.nextInt();
		
		//operador.geraCodigo();
		operador.exibeDados();
		System.out.println("Salário recebido: "+operador.calculaSalario()+" reais.");

	}

}
