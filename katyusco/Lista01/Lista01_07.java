import java.util.Scanner;
import java.util.Locale;

class Lista01_07 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		double nota;
		
		while (true) {
			System.out.print("Nota: ");
			nota = input.nextDouble();
			System.out.print("Conceito: ");
			if (nota >= 0 && nota <= 49) System.out.println("Insuficiente");
			else if (nota >= 50 && nota <= 64) System.out.println("Regular");
			else if (nota >= 65 && nota <= 84) System.out.println("Bom");
			else if (nota >= 85 && nota <= 100) System.out.println("Ótimo");
			else System.out.println("Nota invalida");
		}
		
	}
	
}