package entidades;

import java.util.Scanner;

public abstract class Conta {
	
	Scanner leia = new Scanner(System.in);
	
	//ATRIBUTOS
	private int numero;
	private String nomeCliente;
	protected double saldo;
	protected double valor;
	private char sair;
	private char op;
	
	//CONSTRUTOR
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;		
	}
	
	//ENCAPSULAMENTO - GETTERS AND SETTERS
	public int getNumero() {
		return numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}


	//METODOS PROPRIOS
	public void credito(double valorCredito) {
		if(valorCredito <=0 ) {
			System.out.println("IMPOSSIVEL REALIZAR OPERAÇÃO!");
		}
		else{
		this.saldo = this.saldo + valorCredito;
		}
	}
	

	public void debito(double valorDebito) {
		if(valorDebito <=0 ) {
			System.out.println("IMPOSSIVEL REALIZAR OPERAÇÃO!");
		}
		
		else if (valorDebito>saldo) {
			System.out.println("SALDO INSUFICIENTE!");
		} else {
			this.saldo = this.saldo - valorDebito;
			System.out.println("DEBITO REALIZADO!");
			System.out.println("SALDO ATUALIZADO: R$ " + saldo);
		}
	
	}
	public void movimentacao() {
		System.out.print("MOVIMENTO: DEBITO(D) - CREDITO(C) - SAIR(S): ");	
		op = leia.next().toUpperCase().charAt(0);
		
		while(op != 'D' && op != 'C' && op != 'S'){
			System.out.print("DIGITE UMA OPÇÃO VALIDA: ");
			op = leia.next().toUpperCase().charAt(0);
		}
		
		if(op == 'D') {
			System.out.print("QUAL O VALOR: R$ ");
			valor = leia.nextDouble();
			debito(valor);
		}
		else if(op == 'C') {
			System.out.print("QUAL O VALOR: R$ ");
			valor = leia.nextDouble();
			credito(valor);
			System.out.println("SALDO ATUAL: " + getSaldo());
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