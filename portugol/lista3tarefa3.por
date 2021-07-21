programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real valor=0.00, soma=0.00, media=0.00
		inteiro total=0

		enquanto(valor>=0){

			escreva("Digite um valor: ")
			leia(valor)
			
			se(valor>=0){
				total++
				soma += valor		
			}
		}

		media = soma/total
		escreva("\nO somatório total foi: ", soma)
		escreva("\nO total de números lidos foi: ", total)
		escreva("\nO média foi: ",mat.arredondar(media, 2))

		escreva("\n\nFIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */