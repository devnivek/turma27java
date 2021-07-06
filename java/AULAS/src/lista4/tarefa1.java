package lista4;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double pontuacao[] = new double [5];
		double maiorPontuacao = 0.00;

		//inserindo os valores no vetor
		for(int i = 0; i < 5; i++){
			System.out.print("Insira a "+(i+1)+"º pontuação: ");
			pontuacao[i] = leia.nextDouble();
		}

		//procurando o maior valor dentro do vetor
		for(int i = 0; i < 5; i++){
			if(pontuacao[i] > maiorPontuacao){				
			maiorPontuacao = pontuacao[i];
			}
		}

		//exibindo o maior valor encontrado
		System.out.println("A maior pontuação encontrada foi de "+maiorPontuacao+"\n");

	}

}
