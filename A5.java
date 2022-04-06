package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner meuScanner = new Scanner(System.in);
		
		
		double preco, desconto, preco_vista;
		
		System.out.println("informe o preço bruto do produto");
		
		preco= meuScanner.nextDouble();
		
		desconto = (preco / 100)* 10;
		
		preco_vista = (preco - desconto);
		
		System.out.println("o preço bruto do seu produto é" + preco + "o preço a vista do seu produto é" + preco_vista + "o preço do seu produto com desconto é" + desconto );
		
		
	}

}
