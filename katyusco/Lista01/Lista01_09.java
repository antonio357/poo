import java.util.Scanner;

class Lista01_09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1, num2, sum, q_imp, q_par, i;
		
		while (true) {
			System.out.print("primeiro numero: ");
			num1 = input.nextInt();
			System.out.print("segundo numero: ");
			num2 = input.nextInt();
			sum = num1 + num2;
			q_imp = 0;
			q_par = 0;
			
			
			if (num1 > num2){
				for (i = num1; i >= num2; i--) {
					if (i%2 == 0) 
						q_par++;
					else 
						q_imp++;
				}
			}
			
			else if (num1 <= num2) {
				for (i = num2; i >= num1; i--) {
					if (i%2 == 0) 
						q_par++;
					else 
						q_imp++;
				}
			}
			
			System.out.println("quantidade de numeros impares: " + q_imp);
			System.out.println("quantidade de numeros pares: " + q_par);
			System.out.println("soma: " + sum);
		}
	}
	
}