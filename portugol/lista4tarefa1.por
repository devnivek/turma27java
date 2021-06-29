programa
{
	
	funcao inicio()
	{

		real pontuacao[5]
		real maiorPontuacao=0.00
		inteiro i=0

		//inserindo os valores no vetor
		para(i = 0; i < 5; i++){
			escreva("Insira a "+(i+1)+"º pontuação: ")
			leia(pontuacao[i])
		}

		//procurando o maior valor dentro do vetor
		para(i = 0; i < 5; i++){
			se(pontuacao[i] > maiorPontuacao){
				maiorPontuacao = pontuacao[i]
			}
		}

		//exibindo o maior valor encontrado
		escreva("A maior pontuação encontrada foi de ",maiorPontuacao,"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 184; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */