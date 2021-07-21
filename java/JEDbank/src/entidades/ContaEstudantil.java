package entidades;

public class ContaEstudantil extends Conta {

	private double limiteEstudantil=5000.00;
	private char sair;
	
	public ContaEstudantil(int numero, String nomeCliente) {
		super(numero, nomeCliente);
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	
	public void usarLimiteEstudantil(double valor) {
		
		this.limiteEstudantil = this.limiteEstudantil - valor;
		super.credito(valor);
		
	}
	
	@Override
	public void movimentacao() {
		System.out.print("MOVIMENTO: DEBITO(D) - CREDITO(C) - EMPRESTIMO(E) - SAIR(S): ");	
		char op = leia.next().toUpperCase().charAt(0);
		
		while(op != 'D' && op != 'C' && op != 'S' && op != 'E') {
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
			System.out.println("SALDO ATUALIZADO: R$ " + getSaldo());
		}
		else if(op == 'E') {
			System.out.print("QUAL VALOR DESEJA SOLICITAR DO EMPRESTIMO: R$ ");
			valor = leia.nextDouble();
			
			if(valor>limiteEstudantil) {
				System.out.println("DESCULPE! IMPOSSIVEL REALIZAR OPERAÇÃO!");
				System.out.println("VALOR SOLICITADO R$ "+valor+". EMPRESTIMO DISPONIVEL: R$ "+limiteEstudantil);
			}
			else if(valor<=0) {
				System.out.println("DESCULPE! INFORME UM VALOR VALIDO!");
			}
			else {
				limiteEstudantil -= valor;
				credito(valor);
				System.out.println("ATUALIZADO EMPRESTIMO DISPONIVEL: R$ " + limiteEstudantil);
				System.out.println("SALDO ATUALIZADO: R$ " + getSaldo());
			}
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