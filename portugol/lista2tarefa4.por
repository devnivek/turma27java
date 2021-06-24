programa
{
	
	funcao inicio()
	{
		inteiro num
		
		escreva("Digite um número: ")
		leia(num)

		limpa()
		
		se ((num%2)==0 e num>0){
			escreva("O número "+num+" é par e positivo")
		}senao se((num%2)==0 e num<0){
			escreva("O número "+num+" é par e negativo")
		}senao se((num%2)!=0 e num>0){
			escreva("O número "+num+" é ímpar e positivo")
		}senao se((num%2)!=0 e num<0){
			escreva("O número "+num+" é ímpar e negativo")
		}senao{
			escreva("O número digitado é zero")
		}

		escreva("\n\nFim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */