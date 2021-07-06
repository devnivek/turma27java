package lista4;

import java.util.Random;
import java.util.Scanner;

public abstract class tarefa3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		int n1[][] = new int [4][6];
		int n2[][] = new int [4][6];
		int m1[][] = new int [4][6];
		int m2[][] = new int [4][6];
		int l=0, c=0;

		//preencher n1 e n2 com numeros aleatorios
		for(l=0;l<4;l++){
			for(c=0;c<6;c++){
				n1[l][c] = gerador.nextInt(11);
			}
		}
		for(l=0;l<4;l++){
			for(c=0;c<6;c++){
				n2[l][c] = gerador.nextInt(11);
			}
		}

		//exibir valores das matrizes n1 e n2
		System.out.print("------MATRIZ N1------\n");
			for(l=0; l<4; l++){
				for(c=0; c<6; c++){
					System.out.print(n1[l][c]+"   ");
		        }
			System.out.print("\n");
		}
			//exibir valores das matrizes n1 e n2
		System.out.print("------MATRIZ N2------\n");
			for(l=0; l<4; l++){
				for(c=0; c<6; c++){
					System.out.print(n1[l][c]+"   ");
		        }
			System.out.print("\n");
		}        	
		System.out.print("---------------------\n");

		//preencher matriz m1 com a soma de n1+n2
		for(l=0;l<4;l++){
			for(c=0;c<6;c++){
				m1[l][c] = n1[l][c]+n2[l][c];
			}
		}
		//preencher matriz m2 com a subtração de n1-n2
		for(l=0;l<4;l++){
			for(c=0;c<6;c++){
				m2[l][c] = n1[l][c]-n2[l][c];
			}
		}

		//exibir as matrizes resultado de m1 e m2
		System.out.print("\nMATRIZ M1: SOMA DAS MATRIZES DE N1+N2\n");
		System.out.print("-------------------------------------------\n");
			for(l=0; l<4; l++){
		    	for(c=0; c<6; c++){
		        	System.out.print(m1[l][c]+"\t");
		    	}
		    	System.out.print("\n");
			}
			System.out.print("-------------------------------------------\n");
			System.out.print("\nMATRIZ M2: DIFERANÇA DAS MATRIZES DE N1-N2\n");
			System.out.print("-------------------------------------------\n");
		    for(l=0; l<4; l++){
		  		for(c=0; c<6; c++){
		  			System.out.print(m2[l][c]+"\t");
		       	}
		  		System.out.print("\n");
		    }
		    System.out.print("-------------------------------------------\n");

	}

}
