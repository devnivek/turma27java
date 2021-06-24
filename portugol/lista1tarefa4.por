programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro a, b, c, r, s
		real d
		
		escreva("Insira o valor de A: ")
		leia (a)
		escreva("Insira o valor de B: ")
		leia (b)
		escreva("Insira o valor de C: ")
		leia (c)

		r = Mat.potencia((a+b),2)
		s = Mat.potencia((b+c),2)
		d = (r+s)/2

		escreva("O resultado é: ",d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */