package entidades;

import java.util.Scanner;

public class ContaPoupanca extends Conta {

	private int diaAniversarioConta = 5;
	private double taxaRendimento = 0.05;

	Scanner leia = new Scanner(System.in);
	
	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
		
	}

	public int getDiaAniversarioConta() {
		return diaAniversarioConta;
	}

	public void setDiaAniversarioConta(int diaAniversarioConta) {
		this.diaAniversarioConta = diaAniversarioConta;
	}
	
	public void correcaoDeSaldo(int dia) {
		if (diaAniversarioConta == dia) {
			saldo = saldo + (saldo * taxaRendimento);
			System.out.println("APLICADO TAXA DE RENDIMENTO DE 5%. SALDO ATUALIZADO: " + getSaldo());
		} else {
			System.out.println("SALDO ATUAL: " + getSaldo());
		}
	}
	
	@Override
	public void credito(double valorCredito) {
		if(valorCredito <=0 ) {
			System.out.println("IMPOSSIVEL REALIZAR OPERAÇÃO!");
		}else {
		this.saldo = this.saldo + valorCredito;		
		}
	}
	
	@Override
	public void debito(double valorDebito) {
		if(valorDebito <=0 ) {
			System.out.println("IMPOSSIVEL REALIZAR OPERAÇÃO!");
		}
		
		else if (valorDebito>saldo) {
			System.out.println("SALDO INSUFICIENTE!");
		} else {
			this.saldo = this.saldo - valorDebito;
			System.out.println("DEBITO REALIZADO!");
		}
	
	}
	
}

