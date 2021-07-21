programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6]
		inteiro n2[4][6]
		inteiro m1[4][6]
		inteiro m2[4][6]
		inteiro l=0, c=0

		//preencher n1 e n2 com numeros aleatorios
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				n1[l][c] = sorteia(0,9)
			}
		}
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				n2[l][c] = sorteia(0,9)
			}
		}

		//exibir valores das matrizes n1 e n2
		escreva("------MATRIZ N1------\n")
         	para (l=0; l<4; l++){
          	para (c=0; c<6; c++){
               	escreva(n1[l][c],"   ")
            	}
            	escreva("\n")
        	}
         	escreva("------MATRIZ N2------\n")
         	para (l=0; l<4; l++){
          	para (c=0; c<6; c++){
               	escreva(n2[l][c],"   ")
            	}
            	escreva("\n")
        	}
         	escreva("---------------------\n")

		//preencher matriz m1 com a soma de n1+n2
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				m1[l][c] = n1[l][c]+n2[l][c]
			}
		}
		//preencher matriz m2 com a subtração de n1-n2
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				m2[l][c] = n1[l][c]-n2[l][c]
			}
		}

		//exibir as matrizes resultado de m1 e m2
		escreva("\nMATRIZ M1: SOMA DAS MATRIZES DE N1+N2\n")
		escreva("-------------------------------------------\n")
         	para (l=0; l<4; l++){
          	para (c=0; c<6; c++){
               	escreva(m1[l][c],"\t")
            	}
            	escreva("\n")
        	}
        	escreva("-------------------------------------------\n")
         	escreva("\nMATRIZ M2: DIFERANÇA DAS MATRIZES DE N1-N2\n")
         	escreva("-------------------------------------------\n")
         	para (l=0; l<4; l++){
          	para (c=0; c<6; c++){
               	escreva(m2[l][c],"\t")
            	}
            	escreva("\n")
        	}
         	escreva("-------------------------------------------\n")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 13; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */