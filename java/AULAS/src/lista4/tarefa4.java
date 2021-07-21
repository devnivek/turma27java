package lista4;

import java.util.Random;
import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		int matriz[][] = new int [3][3];
		int soma=0, somaDiagonal=0;

		//inserindo dados na matriz e efetuando a soma de todos os elementos
		for(int x=0; x<3; x++){
			for(int y=0; y<3; y++){
				System.out.print("Insira o valor da Linha "+x+" | Coluna "+y+" : ");
		        matriz[x][y] = leia.nextInt();
		        soma += matriz[x][y];
			}
		    System.out.print("\n");
		}

		//somando a diagonal principal da matriz
      	for(int i=0; i<3; i++){
      		somaDiagonal += matriz[i][i];
		}
      	System.out.print("-----------------\n");

      	//exibindo os valores da matriz
		for(int x=0; x<3; x++){
			for(int y=0; y<3; y++){
				System.out.print(matriz[x][y]+"\t");
		    }
			System.out.print("\n");
		}
		System.out.print("-----------------");

		//exibindo os resultados de media da matriz e soma da diagonal
		System.out.print("\nSoma de todos os valores = "+soma+"\nSoma dos valores da diagonal principal: "+somaDiagonal+"\n");

	}

}
