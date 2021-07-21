package lista3;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		char sexo, opcao, op='S';
		int idade=0, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0;
		int pessoasNervosasMais40=0, pessoasCalmasMenos18=0, cont=1;
		final int LIMITE=150;
				
		while(op=='S' && cont <= LIMITE) {
			System.out.println(cont+"º PARTICIPANTE");
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.print("Digite o sexo: ");
			System.out.print("1-Feminino | 2-Masculino | 3-Outros : ");
			sexo = leia.next().charAt(0);
			System.out.print("Digite uma opção: ");
			System.out.print("1-Calmo(a) | 2-Nervoso(a) | 3-Agressivo(a) : ");
			opcao = leia.next().charAt(0);
			
			if(opcao == '1') {
				pessoasCalmas++;
			}
			if(sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			if(sexo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			if(sexo == '3' && opcao == '1') {
				outrosCalmos++;
			}
			if(idade >= 40 && opcao == '2') {
				pessoasNervosasMais40++;
			}
			if(idade < 18 && opcao == '1') {
				pessoasCalmasMenos18++;
			}
			
			System.out.print("Continuar Sim(S) ou Não(N): ");
			op=leia.next().toUpperCase().charAt(0);
			cont++;
			System.out.print("\n");
		}
		
		System.out.println("Número de pessoas calmas: "+pessoasCalmas);
		System.out.println("Número de mulheres nervosas: "+mulheresNervosas);
		System.out.println("Número de homens agressivos: "+homensAgressivos);
		System.out.println("Número de outros calmos: "+outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+pessoasNervosasMais40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+pessoasCalmasMenos18);

	}

}
