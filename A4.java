package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int raio, altura, volume;
		
		System.out.println("informe o valor do raio");
		raio= meuScanner.nextInt();
		System.out.println("informe o valor da altura");
		altura= meuScanner.nextInt();
		volume = (314159 * raio * raio * altura);
		
		System.out.println("o volume de sua lata de oleo é:" + volume);
		
	}

}
