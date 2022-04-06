package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		double ht, vh, pd, sb, td, sl;
		
		System.out.println("informe as horas trabalhadas no mes");
		ht= meuScanner.nextDouble();
		System.out.println("informe o valor da hora trabalhada");
		vh= meuScanner.nextDouble();
		System.out.println("informe o percentual de desconto");
		pd= meuScanner.nextDouble();
		sb = (ht * vh);
		td = ( pd / 100) * sb;
		sl = (sb - td);
		
		System.out.println("o valor do salario bruto e" + sb);
		System.out.println("o valor do salario liquido e" + sl);
		System.out.println"o valor do desconto total e" + td );
	}

}
