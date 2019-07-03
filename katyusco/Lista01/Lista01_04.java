import java.util.Scanner;
import java.util.Locale; // necessário se não o scanner não funciona para floats com notação de . so para notação de , 

class Lista01_04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH); // necessário se não o scanner não funciona para floats com notação de . so para notação de ,
		
		
		double n1, n2, n3, n4, result;
		
		while (true) {	
		
			System.out.print("nota do primeiro bimestre: ");
			n1 = input.nextDouble();
			
			System.out.print("nota do segundo bimestre: ");
			n2 = input.nextDouble();
			
			System.out.print("nota do terceiro bimestre: ");
			n3 = input.nextDouble();
			
			System.out.print("nota do quarto bimestre: ");
			n4 = input.nextDouble();

			
			result = (n1 + n2 + n3 + n4)/4;
			
			if (result >= 7.0)
				System.out.println("aprovado");
			
			else if (result >= 5.0 && result < 7.0)
				System.out.println("final");
			
			else if (result < 5.0)
				System.out.println("reprovado");
			
		}
		
	}
	
}