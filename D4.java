package listaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		

		Scanner meuScanner = new Scanner(System.in);
		
		int val1, val2, dif, maior, menor;
		System.out.println("digite o primeiro valor");
		val1 = meuScanner.nextInt();
		System.out.println("digite o segundo valor");
		val2 = meuScanner.nextInt();
		
		
		
		if (val1>val2) {
			dif = (val1 - val2);
			System.out.println("a diferença é" + dif);
		}
		if (val2>val1) {
			dif = (val2 - val1);
				System.out.println("a diferença é" + dif);
		}
	}

}
 
