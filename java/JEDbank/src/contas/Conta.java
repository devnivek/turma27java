package contas;

public class Conta {
	
	//atributos
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	//construtor
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	
	//ENCAPSULAMENTO - GETTERS AND SETTERS
	public int getNumero() {
		return numero;
	}
	/*
	public void setNumero(int numero) {
		this.numero = numero;
	}
	*/

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
*/	
	//METODOS
	
	public void credito(double valorCredito) {
		
		this.saldo = this.saldo + valorCredito;
		
	}
	
	public void debito(double valorDebito) {
		if(valorDebito <=0 ) {
			System.out.println("Impossivel realizar operação....");
		}
		
		else if (valorDebito>saldo) {
			System.out.println("Saldo insulficiente....");
		} else {
			this.saldo = this.saldo - valorDebito;
			System.out.println("Debito realizado!!!");
		}
			
		
		
	}
	
	
	
	
	
	

}