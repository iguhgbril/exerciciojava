package listaD;
import java.util.Scanner;
public class D8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meuScanner = new Scanner(System.in);
		int num1, num2, div;
		System.out.println("digite o primeiro valor");
		num1 = meuScanner.nextInt();
		
		System.out.println("digite o segundo valor");
		num2 = meuScanner.nextInt();
		
		if (num1>num2) {
			
			div = num1/num2;
					
					System.out.println("o resultado de "+num1+ " divido por " +num2+" é igual a "+div);
		}
if (num2>num1) {
			
			div = num2/num1;
					
					System.out.println("o resultado de "+num2+ " divido por " +num1+" é igual a "+div);
		}
	}

}
