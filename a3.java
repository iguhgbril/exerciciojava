package listaA;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
	int C, F;
	System.out.println("digite a temperatura em C°");
	C= meuScanner.nextInt();
	F = (9 * C + 160 / 5);
	System.out.println("a temperatura em fahrenheit é" + F);
	
	}

}
