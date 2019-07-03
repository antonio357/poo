import java.util.Scanner;

class Lista01_05 {
	
	private static String lis[] = {"Janeiro", "Fevereiro", "Março", "Abril", 
					"Maio", "Junho", "Julho", "Agosto", 
					"Setembro", "Outubro", "Novembro", "Dezembro"};
	
	private static void identificaMes(int num) {
		
		if (num >= 1 && num <= 12) {
			num--;
			System.out.println("mês: " + lis[num]);
		}
		
		else {
			System.out.println("mês não existe ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {	
		
			System.out.print("numero do mes: ");
			identificaMes(input.nextInt());
			
		}
		
	}
	
}