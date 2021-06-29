programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro soma=0, somaDiagonal=0

		//inserindo dados na matriz e efetuando a soma de todos os elementos
		para (inteiro x=0; x<3; x++){
          	para (inteiro y=0; y<3; y++){
     		escreva("Insira o valor da Linha "+x+" | Coluna "+y+" : ")
               	leia(matriz[x][y])
               	soma += matriz[x][y]
            	}
            	escreva("\n")
        	}

        	limpa()

		//somando a diagonal principal da matriz
        	para (inteiro i=0; i<3; i++){
               somaDiagonal += matriz[i][i]
         	}
		escreva("-----------------\n")

		//exibindo os valores da matriz
         	para (inteiro x=0; x<3; x++){
          	para (inteiro y=0; y<3; y++){
               	escreva(matriz[x][y],"\t")
            	}
            	escreva("\n")
        	}
         	escreva("-----------------")

         	//exibindo os resultados de media da matriz e soma da diagonal
		escreva("\nSoma de todos os valores = "+soma+"\nSoma dos valores da diagonal principal: "+somaDiagonal+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 871; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */