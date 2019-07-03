import java.util.Scanner;
import java.util.Locale; // necessário se não o scanner não funciona para floats com notação de . so para notação de , 

class Lista01_03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH); // necessário se não o scanner não funciona para floats com notação de . so para notação de ,
		
		int prova1 = 2, prova2 = 3, prova3 = 5;
		double n1, n2, n3;
		
		while (true) {	
		
			System.out.print("nota da primeira prova: ");
			n1 = input.nextDouble();
			
			System.out.print("nota da segunda prova: ");
			n2 = input.nextDouble();
			
			System.out.print("nota da terceira prova: ");
			n3 = input.nextDouble();
			
			System.out.println("média final: " + ((n1 * prova1 + n2 * prova2 + n3 * prova3)/(n1 + n2 + n3)));
			
		}
		
	}
	
}