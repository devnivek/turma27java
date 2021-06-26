programa
{
	
	funcao inicio()
	{
		
		inteiro idade=0, contador=1
		
		escreva("Digite sua idade: ")
		leia(idade)

		enquanto(idade<18){
			linha(50)
			escreva("\nVocê não tem permissão criança!\nLigando para o conselho do telar...\n")
			contador++

			se(contador>3){
				linha(50)
				escreva("\nNúmero de tentativas esgotado, só lamentis!")
				pare
			} 

			escreva("Digite sua idade: ")
			leia(idade)
			
		}

		se(contador==1){
			linha(50)
			escreva("\nParabéns cringe! você tem permissão para entrar")
		} senao{
			escreva("\nAdíos\n")
			linha(50)
		}

	}
	
	funcao linha(inteiro t){
		para(inteiro y=0;y<=t;y++){
			escreva("-")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */