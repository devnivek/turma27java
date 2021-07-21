package lista4;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dado[] = new int [10];
		int soma=0, media=0, maiorValor=0, repetido=0;

		//inserindo os valores do dado
		for(int i = 0; i < 10; i++){
			System.out.print("Insira o "+(i+1)+"º valor lançado: ");
			dado[i] = leia.nextInt();
			soma += dado[i];
		}

		//calculando a media dos valores
		media = soma/10;

		//encontrando o maior valor lançado no vetor
		for(int i = 0; i < 10; i++){
			if(dado[i] > maiorValor){
				maiorValor = dado[i];
			}
		}

		//contabilizando quantas vezes o maior valor apareceu
		for(int i = 0; i < 10; i++){
			if(dado[i] == maiorValor){
				repetido++;
			}
		}

		//exibindo os resultados da media e quantas vezes o maior valor apareceu
		System.out.println("\nA média dos valores foi de: "+media+" pontos\nA maior pontuação registrada foi "+maiorValor+" e apareceu "+repetido+" vez(es).\n");
				
	}

}
