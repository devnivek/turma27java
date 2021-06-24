programa
{
	
	funcao inicio()
	{

		inteiro idade
		
		escreva("Digite sua idade:")
		leia(idade)

		se(idade>=5 e idade<=7){
			escreva("Você está na categoria Infantil A")
		}senao se(idade>=8 e idade<=11){
			escreva("Você está na categoria Infantil B")
		}senao se(idade>=12 e idade<=13){
			escreva("Você está na categoria Juvenil A")
		}senao se(idade>=14 e idade<=17){
			escreva("Você está na categoria Juvenil B")
		}senao se(idade>17){
			escreva("Você está na categoria Adultos")
		}senao{
			escreva("Você não devia nem estar aqui criança\nChamem o conselho do telar")
		}

		escreva("\n\nFim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */