import java.util.Scanner;
import java.util.Locale; // necessário se não o scanner não funciona para floats com notação de . so para notação de , 

class Lista01_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH); // necessário se não o scanner não funciona para floats com notação de . so para notação de ,
		
		double m_s;
		
		while (true) {	
		
			System.out.print("m/s: ");
			m_s = input.nextDouble();
			
			System.out.println("km/h: " + m_s * 3.6);
			
		}
		
	}
	
}