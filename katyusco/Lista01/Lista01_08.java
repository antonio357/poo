import java.util.Scanner;
import java.util.Locale;

class Lista01_08 {
	
	private static double notas[] = {0,1,2,3,4,5,6,7,8,9};
	private static double menor, maior, soma;
	private static int i;
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		while (true) {
			
			for (i = 0; i < 10; i++) {
				System.out.print("Nota " + (i + 1) + ": ");
				notas[i] = input.nextDouble();
			}
			
			menor = notas[0];
			maior = notas[0];
			soma = 0;
			
			for (i = 0; i < 10; i++) {
				if (notas[i] < menor) menor = notas[i];
				if (notas[i] > maior) maior = notas[i];
				soma += notas[i];
			}
			
			System.out.println("média: " + soma/10);
			System.out.println("maior: " + maior);
			System.out.println("menor: " + menor);
			
		}
		
	}
	
}