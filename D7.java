package listaD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int num;
		System.out.println("insira um valor: ");
		num = meuScanner.nextInt();
		
		if(num<5) {
			System.out.println("o numero é menor que 5");
		}
		if(num>10) {
			System.out.println("o numero é maior que 10");
		}
		if(num>5 && num<10) {
		 System.out.println("o numero esta entre 5 e 10");
		}
	
	}

}
