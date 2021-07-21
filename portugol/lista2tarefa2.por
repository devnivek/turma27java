programa
{
	
	funcao inicio()
	{
		cadeia codigo 
		inteiro horasTrab
		const real valorHtrab = 10.00
		const real valorHextra = 20.00
		const inteiro limite = 50
		real saldoTotal = 0.00, saldoExtra = 0.00
		
		escreva("Insira o código do operário: ")
		leia(codigo)
		escreva("Insira as horas totais trabalhadas: ")
		leia(horasTrab)

		limpa()

		se(horasTrab>limite){
			saldoExtra = (horasTrab-limite)*valorHextra
			saldoTotal = (limite*valorHtrab)+saldoExtra
		} senao {
			saldoTotal = horasTrab*valorHtrab
		}

		escreva("Código do operador: "+codigo)
		escreva("\n-----------------------------------")
		escreva("\nHoras totais trabalhadas: "+horasTrab+" horas")
		escreva("\n-----------------------------------")
		escreva("\nSalário excedente      : "+saldoExtra+" reais")
		escreva("\nSalário total a receber: "+saldoTotal+" reais")
		escreva("\n-----------------------------------")   
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 164; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */