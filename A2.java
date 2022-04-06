package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner meuScanner = new Scanner(System.in);
		
		int lado1, lado2;
		double area;
	
		System.out.println("digite o primeiro lado");
		lado1= meuScanner.nextDouble();
		System.out.println("digite o segundo lado");
		lado2 = meuScanner.nextDouble();
		area = (lado1 * lado2);
		
		System.out.println("a area do retangulo é" + area);
	}

}
