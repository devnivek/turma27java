programa
{
	
	funcao inicio()
	{

		cadeia carretaFuracao[] = {"SHANG-CHI","WICCANO","GAMORA","SHAZAM","INVENCÍVEL"}
		inteiro i=0

		escreva("\nLISTA DE PERSONAGENS ")
		escreva("\n----------------------------------")
		
		para(i = 0; i < 5; i++){
			escreva("\n"+i+" - "+carretaFuracao[i])
		}

		escreva("\n----------------------------------")

		escreva("\nEscolha um personagem: ")
		leia(i)
		escreva("O personagem escolhido foi "+carretaFuracao[i])
		
		escreva("\n\nFIM DE PROGRAMA")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */