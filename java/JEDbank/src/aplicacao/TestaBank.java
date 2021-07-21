package aplicacao;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaEstudantil;
import entidades.ContaPoupanca;
import entidades.MenuPrincipal;

public class TestaBank {

	static int opcao;
	static String nome;
	static int numeroConta;
	static MenuPrincipal menu = new MenuPrincipal();
	static Scanner leia = new Scanner(System.in);	
	static ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, nome);
	static ContaCorrente contaCorrente = new ContaCorrente(numeroConta, nome);
	static ContaEspecial contaEspecial = new ContaEspecial(numeroConta, nome);
	static ContaEmpresa contaEmpresa = new ContaEmpresa(numeroConta, nome);
	static ContaEstudantil contaEstudantil = new ContaEstudantil(numeroConta, nome);

	public static void menu(){	
		menu.getCabecalho();
		
		while(opcao < 1 || opcao > 6) {
			System.out.print("DIGITE UMA CONTA VALIDA: ");
			opcao = leia.nextInt();
		}
	}
	
	public static void main(String[] args) {
		// SOLICITANDO INFORMAÇÕES DO USUARIO
		System.out.print("NOME CLIENTE: ");
		nome = leia.next().toUpperCase();
		System.out.print("NUMERO DA CONTA: ");
		numeroConta = leia.nextInt();
		
		inicio();
	}
	
	public static void inicio(){
		//FUNÇÃO MENU
		menu();	
		
		//LAÇOS CONDICIONAIS RESPONSAVEL POR DIRECIONAR O USUARIO PARA A CLASSE E METODOS DE ACORDO COM A CONTA ESCOLHIDA
		if(opcao == 1) {			
			
			for(int i=1; i<=10; i++) {	
				menu.getCabecalho();
				System.out.println("\n                      CONTA POUPANÇA\n");
				System.out.println("NOME CLIENTE: " + contaPoupanca.getNomeCliente());
				System.out.println("NUMERO CONTA: " + contaPoupanca.getNumero());
				System.out.println("SALDO ATUAL: R$ " + contaPoupanca.getSaldo());
				System.out.println();
				System.out.println(i + "º MOVIMENTO");
				
				contaPoupanca.movimentacao();
				if(contaPoupanca.getSair() == 'S') {
					inicio();		
		        }
				menu.repeteOperacao();
				if(menu.isRepete() == false){
					System.out.println();
					System.out.print("INFORME O DIA: ");
					int dia = leia.nextInt();
					contaPoupanca.correcaoDeSaldo(dia);
					inicio();
			    }
			}
			System.out.println("VOCÊ REALIZOU O MAXIMO DE MOVIMENTAÇÕES DIÁRIAS. VOLTE AMANHÃ!");
			menu();
		}	
		if(opcao == 2) {
			
			for(int i=1; i<=10; i++) {
				menu.getCabecalho();
				System.out.println("\n                      CONTA CORRENTE\n");
				System.out.println("NOME CLIENTE: " + contaCorrente.getNomeCliente());
				System.out.println("NUMERO CONTA: " + contaCorrente.getNumero());
				System.out.println("SALDO ATUAL: R$ " + contaCorrente.getSaldo());
				System.out.println();
				System.out.println(i + "º MOVIMENTO");
				
				contaCorrente.movimentacao();
				if(contaCorrente.getSair() == 'S') {
					inicio();										
		        }
				menu.repeteOperacao();
				if(menu.isRepete() == false){
					contaCorrente.solicitaCheque();
					inicio();
			    }
			}
			System.out.println("VOCÊ REALIZOU O MAXIMO DE MOVIMENTAÇÕES DIÁRIAS. VOLTE AMANHÃ!");
			inicio();
		}
		if(opcao == 3) {
			
			for(int i=1; i<=10; i++) {
				menu.getCabecalho();
				System.out.println("\n                      CONTA ESPECIAL\n");
				System.out.println("NOME CLIENTE: " + contaEspecial.getNomeCliente());
				System.out.println("NUMERO CONTA: " + contaEspecial.getNumero());
				System.out.println("LIMITE DISPONIVEL NO VALOR DE: R$ " + contaEspecial.getLimite());
				System.out.println("SALDO ATUAL: R$ " + contaEspecial.getSaldo());
				System.out.println();
				System.out.println(i + "º MOVIMENTO");
				
				contaEspecial.movimentacao();
				if(contaEspecial.getSair() == 'S') {
					inicio();							
				}
				menu.repeteOperacao();
				if(menu.isRepete() == false){
					inicio();
				}		
		        	
		   }
		    System.out.println("VOCÊ REALIZOU O MAXIMO DE MOVIMENTAÇÕES DIÁRIAS. VOLTE AMANHÃ!");
		    inicio();
    }
		if(opcao == 4) {
				
				for(int i=1; i<=10; i++) {
					menu.getCabecalho();
					System.out.println("\n                      CONTA EMPRESA\n");
					System.out.println("NOME CLIENTE: " + contaEmpresa.getNomeCliente());
					System.out.println("NUMERO CONTA: " + contaEmpresa.getNumero());
					System.out.println("EMPRESTIMO DISPONIVEL NO VALOR DE: R$ " + contaEmpresa.getEmprestimoEmpresa());
					System.out.println("SALDO ATUAL: R$ " + contaEmpresa.getSaldo());
					System.out.println();
					System.out.println(i + "º MOVIMENTO");
					contaEmpresa.movimentacao();
					if(contaEmpresa.getSair() == 'S') {
						inicio();	
			        }	
					menu.repeteOperacao();
					if(menu.isRepete() == false){
						inicio();
				    }
			    }	
				System.out.println("VOCÊ REALIZOU O MAXIMO DE MOVIMENTAÇÕES DIÁRIAS. VOLTE AMANHÃ!");
				inicio();
		}
		if(opcao == 5) {
			
			for(int i=1; i<=10; i++) {
				menu.getCabecalho();
				System.out.println("\n                      CONTA ESTUDANTIL\n");
				System.out.println("NOME CLIENTE: " + contaEstudantil.getNomeCliente());
				System.out.println("NUMERO CONTA: " + contaEstudantil.getNumero());
				System.out.println("EMPRESTIMO DISPONIVEL NO VALOR DE: R$ " + contaEstudantil.getLimiteEstudantil());
				System.out.println("SALDO ATUAL: R$ " + contaEstudantil.getSaldo());
				System.out.println();
				System.out.println(i + "º MOVIMENTO");
				contaEstudantil.movimentacao();
				if(contaEstudantil.getSair() == 'S') {
					inicio();		
		        }	
				menu.repeteOperacao();
				if(menu.isRepete() == false){
					inicio();
			    }
		    }
			System.out.println("VOCÊ REALIZOU O MAXIMO DE MOVIMENTAÇÕES DIÁRIAS. VOLTE AMANHÃ!");
			inicio();
		}
		else if(opcao == 6) {
			System.out.println("\n                       FINALIZADO OPERAÇÃO");
			System.out.println("\n                         VOLTE SEMPRE! :)");
		}	
	}
}