programa
{
	
	funcao inicio()
	{
		inteiro peso, multa, excesso
		
		escreva("Insira o peso total dos tomates: ")
		leia(peso)

		limpa()
		
		se(peso>50){
			excesso = peso-50
			multa = excesso*4
			escreva("Peso: "+peso+" Kg\nExcesso: "+excesso+" Kg\nMulta: "+multa+" Reais")
		}senao{
			excesso = 0
			multa = 0
			escreva("Peso: "+peso+" Kg\nExcesso: "+excesso+" Kg\nMulta: "+multa+" Reais")
		}

		escreva("\n\nFim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */