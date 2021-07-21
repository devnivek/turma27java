programa
{
	
	funcao inicio()
	{
		inteiro tamanho=0, idade=0 , totalIdade=0
		cadeia nome
		escreva("Quantas pessoas você deseja inserir? ")
		leia(tamanho)

		para(inteiro x=1;x<=tamanho;x++){
			linha(50)
			pula()
			escreva("Digite o "+x+"º nome: ")
			leia(nome)
			escreva("Digite a idade do "+x+"º nome: ")
			leia(idade)
			totalIdade += idade
		}

		linha(50)
		pula()
		escreva("A média de idades é: ",((totalIdade)/tamanho)," anos")
		pula()
		linha(50)
		
	}

	funcao linha(inteiro t){
		para(inteiro y=0;y<=t;y++){
			escreva("-")
		}
	}
	
	funcao pula(){
		escreva("\n")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */