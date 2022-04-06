package listaD;

import java.util.Scanner;

public class D2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner meuScanner = new Scanner(System.in);
	
		int val1;
		
		System.out.println("Digite o numero");
		val1 = meuScanner.nextInt();
		
	if (val1>100) {
		System.out.println("o numero é maior que 100");
	}
	if (100>val1) {
		System.out.println("100 é maior");
	}
	if (val1 == 100) {
		System.out.println("os numeros são iguais");
	}
	}

}