programa
{
	inclua biblioteca Matematica --> mat

	funcao inicio()
	{
	
		inteiro a, b, c, d, n1, n2, n3, n4
		
		escreva("Digite o primeiro número: ")
		leia(a)
		escreva("Digite o segundo número: ")
		leia(b)
		escreva("Digite o terceiro número: ")
		leia(c)
		escreva("Digite o quarto número: ")
		leia(d)

		limpa()

		n1 = mat.potencia(a,2)
		n2 = mat.potencia(b,2)
		n3 = mat.potencia(c,2)
		n4 = mat.potencia(d,2)

		se (n3>=1000){
			escreva("O quadrado de "+c+" é: "+n3)
			escreva("\n\nFim de programa")
		} senao{
			escreva("O quadrado de "+a+" é: "+n1)
			escreva("\nO quadrado de "+b+" é: "+n2)
			escreva("\nO quadrado de "+c+" é: "+n3)
			escreva("\nO quadrado de "+d+" é: "+n4)
			escreva("\n\nFim de programa")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */