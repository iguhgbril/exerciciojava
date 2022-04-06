package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in); 
			
				int n1, n2, n3, n4;
				double soma, media;
		
		System.out.println("digite o primeiro numero");
		n1= meuScanner.nextInt();
		System.out.println("digite o segundo numero");
		n2 = meuScanner.nextInt();
		System.out.println("digite o terceiro numero");
		n3= meuScanner.nextInt();
		System.out.println("digite o quarto numero");
		n4 = meuScanner.nextInt();
		soma = (n1 + n2 + n3 + n4);
			media = (soma / 4);
			System.out.println("a media dos numeros é" + media);
	}

}
