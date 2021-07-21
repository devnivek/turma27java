programa
{
	
	funcao inicio()
	{
		inteiro dado[10]
		inteiro i=0, soma=0, media=0, maiorValor=0, repetido=0

		//inserindo os valores do dado
		para(i = 0; i < 10; i++){
			escreva("Insira o "+(i+1)+"º valor lançado: ")
			leia(dado[i])
			soma += dado[i]
		}

		//calculando a media dos valores
		media = soma/10

		//encontrando o maior valor lançado no vetor
		para(i = 0; i < 10; i++){
			se(dado[i] > maiorValor){
				maiorValor = dado[i]
			}
		}

		//contabilizando quantas vezes o maior valor apareceu
		para(i = 0; i < 10; i++){
			se(dado[i] == maiorValor){
				repetido++
			}
		}

		//exibindo os resultados da media e quantas vezes o maior valor apareceu
		escreva("\nA média dos valores foi de: "+media+" pontos\nA maior pontuação registrada foi "+maiorValor+" e apareceu "+repetido+" vez(es).\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 673; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */