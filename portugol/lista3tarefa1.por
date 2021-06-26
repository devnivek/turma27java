programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro filhos=0, tamanho=0, populacao=0, totFilhos=0, percentual=0
		real salario=0.00, salPopulacao=0.00, maiorSalario=0.00, salMin=0.00, mediaSalario=0.00, mediaFilhos=0.00

		escreva("Quantas famílias deseja cadastrar? ")
		leia(tamanho)

			para(inteiro x=1;x<=tamanho;x++){
	
				escreva("Insira o valor do salário da ",x,"º família: ")
				leia(salario)
				escreva("Insira o número de filhos da ",x,"º família: ")
				leia(filhos)
	
				populacao++
				salPopulacao += salario
				totFilhos += filhos
				
				se(salario>maiorSalario){
					maiorSalario=salario
				}
				se(salario<=100){
					salMin++
				}
			
			}

		mediaSalario = salPopulacao/populacao
		escreva("\nA média de salário da população é: ",mat.arredondar(mediaSalario,2)," reais")
		mediaFilhos = totFilhos/populacao
		escreva("\nA média de filhos da população é: ",mat.arredondar(mediaFilhos,2)," filhos")
		escreva("\nO maior salário da população é: ",mat.arredondar(maiorSalario,2)," reais")
		percentual = (salMin/populacao)*100
		escreva("\nO percentual de pessoas com salário até R$100,00 é: ",percentual,"% da população")

		escreva("\n\nFIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1155; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */