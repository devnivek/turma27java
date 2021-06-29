programa
{
	
	funcao inicio()
	{
		cadeia aluno[4]
		inteiro nota[4]
		inteiro i=0
		 
		para(i = 0; i < 4; i++){
			escreva("Insira o nome do "+(i+1)+"º aluno: ")
			leia(aluno[i])
			escreva("Insira a nota do "+(i+1)+"º aluno: ")
			leia(nota[i])
		}

		limpa()
		
		para(i = 0; i < 4; i++){
			
			escreva((i+1)+"º ALUNO: "+aluno[i]+" - NOTA: "+nota[i]+"\n")
			
			se(nota[i]<=5){
				escreva("Infelizmente ainda não deu, estude mais!\n")
			} senao {
				escreva("Parabéns, você foi aprovado, continue o bom trabalho!\n")
			}
			
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {aluno, 6, 9, 5}-{nota, 7, 10, 4}-{i, 8, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */