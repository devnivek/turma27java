package entidades;

import java.util.Scanner;

public class ContaCorrente extends Conta {

	Scanner leia = new Scanner(System.in);
	
	private int contadorTalao=3;
	private char opcao;
    private int quantidadeCheque;
    private double valorTalao = 30.00;
    private double tarifa;
	
	public ContaCorrente(int numero, String nomeCliente) {
		super(numero, nomeCliente);
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	public void solicitaCheque() {
		System.out.print("DESEJA SOLICITAR ALGUM CHEQUE (S/N): ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		while(opcao != 'S' && opcao != 'N') {
			System.out.print("DIGITE UMA OPÇÃO VALIDA: ");
			opcao = leia.next().toUpperCase().charAt(0);
		}
		
		if(opcao == 'S') {
	        
			if(contadorTalao>0) {
				System.out.print("QUANTOS TALÕES DESEJA SOLICITAR (DISPONÍVEL: "+contadorTalao+"): ");
				quantidadeCheque = leia.nextInt();
				
	            while(quantidadeCheque < 1 || quantidadeCheque > contadorTalao) {
				    System.out.print("DIGITE UMA QUANTIDADE VALIDA (DISPONÍVEL: "+contadorTalao+"): ");
				    quantidadeCheque = leia.nextInt();
				}
				//PROBLEMA MENSAGEM
	            tarifa = quantidadeCheque * valorTalao;
	            if(tarifa<=saldo) {
	            	debito(tarifa);
	            	System.out.println("TARIFA DESCONTADA: R$ " + tarifa);
	            	contadorTalao -= quantidadeCheque;
	            } else {
					System.out.println("SALDO INSUFICIENTE, REALIZE ALGUM CREDITO E TENTE NOVAMENTE");
	            }
			} else {
				System.out.println("QUANTIDADE DIÁRIA DE TALÕES ESGOTADA, VOLTE AMANHÃ");
			}
		}
	}
	
	
	
}