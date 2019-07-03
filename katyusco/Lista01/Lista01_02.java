import java.util.Scanner;

class Lista01_02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int ano;
		
		while (true) {	
		
			System.out.print("ano de nascimento: ");
			ano = input.nextInt();
			
			System.out.println("idade atual: " + (2019 - ano));
			
		}
		
	}
	
}