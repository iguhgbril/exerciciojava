package listaD;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner meuScanner = new Scanner(System.in);
		
		int num;
		System.out.println("Escolha um numero de 0 a 10");
		num= meuScanner.nextInt();
		
		if (num == 0) {
			System.out.println(" O numero que voc� escolheu � 0 - zero");
		}
		if (num == 1) {
			System.out.println(" O numero que voc� escolheu � 1 - um");
		}
		if (num == 2) {
			System.out.println(" O numero que voc� escolheu � 2 - dois");
		}
		if (num == 3) {
			System.out.println(" O numero que voc� escolheu � 3 - tres");
		}
		if (num == 4) {
			System.out.println(" O numero que voc� escolheu � 4 - quatro");
		}
		if (num == 5) {
			System.out.println(" O numero que voc� escolheu � 5 - cinco");
		}
		if (num == 6) {
			System.out.println(" O numero que voc� escolheu � 6 - seis");
		}
		if (num == 7) {
			System.out.println(" O numero que voc� escolheu � 7 - sete");
		}
		if (num == 8) {
			System.out.println(" O numero que voc� escolheu � 8 - oito");
		}
		if (num == 9) {
			System.out.println(" O numero que voc� escolheu � 9 - nove");
		}
		if (num == 10) {
			System.out.println(" O numero que voc� escolheu � 10 - dez");
		}
		if (num>10) {
			System.out.println(" O numero que voc� escolheu � invalido");
		}
	}

}
