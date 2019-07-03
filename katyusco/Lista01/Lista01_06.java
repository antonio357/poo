import java.util.Scanner;
import java.util.Locale; // necessário se não o scanner não funciona para floats com notação de . so para notação de , 

class Lista01_06 {
	
	private static double diaria = 60.0, complemento = 6.0, result;
	
	private static void calcula_conta(String nome, double num_diarias) {
		
		if (num_diarias > 15.0) {
			complemento = 5.50;
		}
			
		else if (num_diarias < 15.0) {
			complemento = 8.0;
		}
		
		result = (diaria + complemento) * num_diarias;
		System.out.println("Cliente: " + nome);
		System.out.println("Total: " + result);
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH); // necessário se não o scanner não funciona para floats com notação de . so para notação de ,
		
		double dias;
		String name;
		
		while (true) {	
		
			System.out.print("nome: ");
			name = input.nextLine();
			System.out.print("quantidade de dias: ");
			dias = input.nextDouble();
			calcula_conta(name, dias);
			
		}
		
	}
	
}