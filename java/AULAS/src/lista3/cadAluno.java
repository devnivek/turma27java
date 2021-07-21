package lista3;

import java.util.Scanner;

public class cadAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//String alunos[] = new String[4];
		//alunos[0] = "Nate";
		
		String alunos[] = {"DIEGO", "JUAREZ", "VIVIANE", "ALDO"};
		int notas[] = new int[4];
		
		System.out.println("Cadastro de notas");
		
		for(int x=0; x<alunos.length; x++) {
			System.out.println((x+1)+"º ALUNO");
			System.out.println("Alune "+alunos[x].toLowerCase());
		}
		
		/*System.out.println("");
		
		for(String x : alunos) {
			System.out.println(x);
		}
		
		System.out.println("/digite o nome completo: ");
		nome = leia.nextLine();
		*/
		
	}

}
