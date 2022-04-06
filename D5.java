package listaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("digite o primeiro valor");
		a= meuScanner.nextInt();
		
		System.out.println("digite o segundo valor");
		b= meuScanner.nextInt();
		
		System.out.println("digite o terceiro valor");
		c= meuScanner.nextInt();
		
		if (a>b && a>c && b<c) {
			System.out.println(a+ " "+c+" "+b );
			
		}
		if (b>a && b>c && c<a) {
			System.out.println(b+ " "+a+ " "+c);
		}
		if (c>a && c>b && a<b) {
			System.out.println(c+" "+b+" "+a);
			
		}
		if (a>b && a>c && b>c) {
			System.out.println(a+ " "+b+" "+c );
			
		}
		if (b>a && b>c && c>a) {
			System.out.println(b+ " "+c+ " "+a);
		}
		if (c>a && c>b && a>b) {
			System.out.println(c+" "+a+" "+b);
			
		}
	}

}
