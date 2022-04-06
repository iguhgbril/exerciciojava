package listaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		
		int cod;
		
		System.out.println("digite o codigo do departamento");
		cod = meuScanner.nextInt();
		
		if (cod == 1) {
			System.out.println("o codigo corresponde ao departamento Expedição");
	
		}
		
		if (cod == 2) {
			System.out.println("o codigo corresponde ao departamento de Recursos Humanos");
			
		}
		
		if (cod == 3) {
			System.out.println("o codigo corresponde ao departamento de Logistica");
		}
		
		if (cod == 4) {
			System.out.println("o codigo corresponde ao departamento de Contabilidade");
		}
		
		if (cod>4)
			System.out.println("o departamento não existe");
	}

}
