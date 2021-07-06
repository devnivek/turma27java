package lista3;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		
		int n=0;
		Scanner leia = new Scanner(System.in);
		
		for(int i=1000; i<2000; i++) {
			n = i%11;
			if(n == 5) {
				System.out.println(i);
			}
		}
		

	}

}
