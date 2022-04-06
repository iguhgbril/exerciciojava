package listaA;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("informe o valor de A");
		A= meuScanner.nextDouble();
		System.out.println("informe o valor de B");
		B = meuScanner.nextDouble();
		C = (A);
		A = (B);
		B = (C);
		
		System.out.println("o valor de A é" +  A);
		System.out.println("o valor de B é" +  C);
	}

}
