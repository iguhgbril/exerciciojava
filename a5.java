package listaA;

import java.util.Scanner;

public class a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner meuScanner = new Scanner(System.in);
		
		
		double preco, desconto, preco_vista;
		
		System.out.println("informe o pre�o bruto do produto");
		
		preco= meuScanner.nextDouble();
		
		desconto = (preco / 100)* 10;
		
		preco_vista = (preco - desconto);
		
		System.out.println("o pre�o bruto do seu produto �" + preco + "o pre�o a vista do seu produto �" + preco_vista + "o pre�o do seu produto com desconto �" + desconto );
		
		
	}

}
