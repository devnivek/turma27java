package entidades;

import java.util.Scanner;

public class ContaEspecial extends Conta {

	private double limite=1000.00;
	private double resto;
	private char opcao;
	private char sair;
	

	Scanner leia = new Scanner(System.in);
	
	public ContaEspecial(int numero, String nomeCliente) {
		super(numero, nomeCliente);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void usarLimite(double valor) {
				
		this.limite = this.limite - valor;
		super.credito(valor);
		
	}

	@Override
	public void movimentacao() {
		System.out.print("MOVIMENTO: DEBITO(D) - CREDITO(C) - SAIR(S): ");	
		char op = leia.next().toUpperCase().charAt(0);
		
		while(op != 'D' && op != 'C' && op != 'S') {
			System.out.print("DIGITE UMA OPÇÃO VALIDA: ");
			op = leia.next().toUpperCase().charAt(0);
		}
		
		if(op == 'D') {
			System.out.print("QUAL O VALOR: R$ ");
			valor = leia.nextDouble();
			
			if(valor>saldo) {
				System.out.println("VOCÊ NÃO TEM SALDO SUFICIENTE PARA REALIZAR ESSA OPERAÇÃO!");
				System.out.println();
				System.out.print("DESEJA RETIRAR DO LIMITE (S/N): ");
				opcao = leia.next().toUpperCase().charAt(0);
				
				if(opcao == 'S') {
					resto = valor - saldo;
					limite = limite - resto; 
					saldo = 0.0;
					System.out.println("LIMITE ATUALIZADO: R$ " + limite);
					System.out.println("SALDO ATUALIZADO: R$ " + saldo);			
				}else {
					return;
				}
			}
			else {
				debito(valor);		
			}
		}
		else if(op == 'C') {
			System.out.print("QUAL O VALOR: R$ ");
			valor = leia.nextDouble();
			credito(valor);
			System.out.println("SALDO ATUAL: R$ " + getSaldo());
		}
		else if(op == 'S') {
			sair = 'S';
		}
		
	}

	public char getSair() {
		return sair;
	}

	public void setSair(char sair) {
		this.sair = sair;
	}
	
}