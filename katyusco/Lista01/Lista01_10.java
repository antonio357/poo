import java.util.Scanner;
import java.util.Locale;

class Lista01_10 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		double num;
		int counter;
		
		while (true) {
			
			counter = 0;
			System.out.print("número: ");
			num = input.nextDouble();
			
			while (num / 2.0 >= 1.0) {
				
				num /= 2.0;
				counter++;
				
			}
			
			if (num >= 1.0) {
				num /= 2.0;
				counter++;
			}
			
			System.out.println("resultado da última divisão: " + num);
			System.out.println("quantidade de divisões: " + counter);
			
		}
		
	}
	
}