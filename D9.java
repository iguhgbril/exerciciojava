package listaD;
import java.util.Scanner;
public class D9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		
		double salaA, cod, salaF, reaj;
		
		System.out.println("digite o valor do salario atual");
		salaA = meuScanner.nextInt();
		
		System.out.println("digite o codigo do departamento");
		cod = meuScanner.nextInt();
		
		if (cod == 1) {
			reaj = (salaA/100)*5;
			salaF = (reaj + salaA);
			System.out.println("o operador, ao receber um reajuste de 5%, agora recebe um salario de "+salaF);
		}
		if (cod == 2) {
			reaj = (salaA/100)*10;
			salaF = (reaj + salaA);
			System.out.println("o programador, ao receber um reajuste de 10%, agora recebe um salario de "+salaF);
		}
		if (cod == 3) {
			reaj = (salaA/100)*15;
			salaF = (reaj + salaA);
			System.out.println("o analista, ao receber um reajuste de 15%, agora recebe um salario de "+salaF);
		}
	}

}
