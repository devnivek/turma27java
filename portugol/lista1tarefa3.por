programa
{
	
	funcao inicio()
	{
		//PROGRAMA : NOME - OBJETIVO
		//INICIO
			//VARIAVEIS
			//ENTRADAS
			//PROCESSAMENTOS
			//SAIDAS 
		//FIM
		/*OBJETIVO
		 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos
		 * 1 minuto = 60 seg / 1 hora = 3600 seg
		 */

		inteiro tempoEvento, horas, minutos, segundos
		
		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(tempoEvento)

		horas = tempoEvento/3600
		minutos = (tempoEvento%3600)/60
		segundos = (tempoEvento%3600)%60

		escreva("Horas : "+horas+"\n")
		escreva("Minutos : "+minutos+"\n")
		escreva("Segundos : "+segundos)
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 700; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */