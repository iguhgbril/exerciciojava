package listaA;

import java.util.Scanner;

public class a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner meuScanner = new Scanner(System.in);
		
		double tempo, distancia, velocidade, litros_usados;
		
		System.out.println("informe o tempo asto na viagem");
		tempo= meuScanner.nextDouble();
		System.out.println("informe a velocidade media durante a viagem");
		velocidade = meuScanner.nextInt();
		distancia = ( tempo * velocidade);
		litros_usados (distancia / 12);
		
		
		System.out.println("o tempo gasto na viagem foi" + tempo, "a distancia percorrida foi" + distancia, "a quantidade de combustivel utilizada na viagem foi de" + litros_usados + "litros");
	}

}
