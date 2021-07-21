package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCad {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario("X1",70,13.7);
		Terceiro func2 = new Terceiro("X9",70,13.7,41);
		
		System.out.println("FUNCIONÁRIO 1");
		System.out.println("Matrícula:"+func1.getMatricula());
		System.out.println("Salário:"+func1.salario());
		
		System.out.println("\nFUNCIONÁRIO 2");
		System.out.println("Matrícula:"+func2.getMatricula());
		System.out.println("Salário:"+func2.salario());

	}

}
