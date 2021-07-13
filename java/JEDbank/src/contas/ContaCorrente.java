package contas;

import java.util.Scanner;

public class ContaCorrente {
	
	Scanner leia = new Scanner(System.in);

	int contadorTalao = 0;
	double tarifaTalao = 0.0, saldoCorrente=0.0;
			
	//iniciando movimentação da conta
	int contadorOperacao=0;
	char op;

	for (int i=0; i<10; i++){
		//limpa()
		//cabecalho()
		System.out.println("                        CONTA CORRENTE\n");
		System.out.println("\n");
		//exibindo menu de movimentação
		System.out.println("SALDO ATUAL: "+saldoCorrente+" REAIS\n");
		System.out.println("-----------------------------------------------------------\n");
		System.out.println("D - DEBITO\nC - CREDITO\nS - SAIR\n");
		//escolhendo a opção debito ou credito
		System.out.println("\n"+(contadorOperacao+1)+"º MOVIMENTAÇÃO (MÁXIMO DIÁRIO PERMITIDO = 10)")
		System.out.println("\n===========================================================");
		System.out.println("\nDIGITE A OPERAÇÃO QUE DESEJA REALIZAR (D, C ou S): ");
		op = leia.next().charAt(0);
		System.out.println("\n");
		         
		double valor = 0.0;
		//debitando da conta
		if(tipoOperacao == 'D' || tipoOperacao == 'd'){
			//alertando que a conta não possui dinheiro para saque
			if(saldoCorrente <= 0){
				System.out.println("VOCÊ NÃO POSSUI SALDO PARA SAQUE! AGUARDE...\n");
				contadorOperacao++;
			} else {
				System.out.println("INSIRA O VALOR QUE DESEJA RETIRAR DA CONTA: ");
			    valor = leia.nextDouble();
			    //verificando se o valor de saque não é maior que o saldo
			    if(valor > saldoCorrente){
			    	System.out.println("VOCÊ NÃO TEM SALDO SUFICIENTE PARA ESTE SAQUE! AGUARDE...\n");
			        contadorOperacao++;
			    } else {
				    saldoCorrente -= valor;
				    contadorOperacao++;
			    }
			}
		}
		//adicionando dinheiro na conta
		if(tipoOperacao == 'C' || tipoOperacao == 'c'){
			System.out.println("INSIRA O VALOR QUE DESEJA ADICIONAR NA CONTA: ");
		    valor = leia.nextDouble();
		    saldoCorrente += valor;
		    contadorOperacao++;
		}
		if(tipoOperacao == 'S' || tipoOperacao == 's'){
			contadorOperacao = 10;
		}	
	}
	
	//limpando tela e exibindo o cabeçalho
	     	//limpa()
	     	cabecalho()
	     	escreva("           CONTA CORRENTE  Nº: "+numeroConta+" AGÊNCIA: "+agencia+"\n")
	     	//verificando se possui saldo suficiente para solicitar cheque
	     	se(saldoAtual<30.0){
	     		escreva("SALDO ATUAL: "+saldoAtual+" REAIS\n")
				escreva("-----------------------------------------------------------\n")
	     		escreva("\nDESCULPE, VOCÊ NÃO TEM SALDO SUFICIENTE PARA SOLICITAR CHEQUE\n")
	     		escreva("\nRETORNANDO AO MENU PRINCIPAL...")
			     Util.aguarde(7000)
			     limpa()
			     saldoAtual = 0.0
			     inicio()
	     		
	     	}
			//perguntando se vai querer solicitar cheque
	     	escreva("\nDESEJA SOLICITAR ALGUM CHEQUE?\n")
	     	escreva("1 - SIM OU 2 - NÃO: ")
		     leia(opcao)
		     //verificando se o numero digitado está dentro do menu
			enquanto(opcao < 1 ou opcao > 2){                      	
		          escreva("DIGITE UMA OPÇÃO VALIDA (1-3): ")
		          leia(opcao)        	 	
		     }  
			//solicitando a quantidade de cheques desejada
		     se(opcao == 1){
		     	escreva("\nSALDO ATUAL: "+saldoAtual+" REAIS | TARIFA POR TALÃO: 30 REAIS")
		     	escreva("\n=======================================================")
		     	escreva("\nQUANTOS CHEQUES DESEJA SOLICITAR? (MÁXIMO 3): ")
			     leia(contadorTalao)
			     //efetuando validações
			     inteiro valida=0
			     faca{ 
			     	//verificando se a quantidade digitada está dentro do limite
			     	enquanto(contadorTalao < 1 ou contadorTalao > 3){    
				          escreva("DIGITE UMA QUANTIDADE VALIDA: ")
				          leia(contadorTalao)   
				     }
				     //efetuando a contagem da tarifa a ser paga
				     tarifaTalao = (30.0*contadorTalao)
				     //verificando se o saldo atual permite essa operação
			          se(tarifaTalao > saldoAtual){    
			          	escreva("VOCÊ NÃO TEM SALDO SUFICIENTE PARA ESSA QUANTIDADE!\n")
			          	//reiniciando a validação
			          	valida=0
			          	contadorTalao = 0
			          } senao {
			          	//debitando a tarifa do saldo da conta
			          	saldoAtual -= tarifaTalao 
			          	escreva("=======================================================\n")
		         			escreva("\nFORAM DEBITADOS "+(30.0*contadorTalao)+" REAIS PELA TARIFA DE "+contadorTalao+" TALÃO(ES)\nSEU SALDO ATUAL FICOU: "+saldoAtual+" REAIS.\n")
		         			//saindo da validação
		         			valida=1
		     		}
		     	} enquanto (valida==0)
		     }
		     //saindo da função conta corrente e voltando ao inicio
		     escreva("\nRETORNANDO AO MENU PRINCIPAL...")
		     Util.aguarde(10000)
		     limpa()
		     saldoAtual = 0.0
		     inicio()
}
