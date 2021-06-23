programa
{
	
	funcao inicio()
	{
		inteiro dias, meses, anos, resultado
		escreva("Descreva sua idade separadamente abaixo: \nAnos:")
		leia(anos)
		escreva("Meses:")
		leia(meses)
		escreva("Dias:")
		leia(dias)

		resultado = ((anos*365)+(meses*30)+dias)
		escreva("Sua idade total em dias é: ",resultado," dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */