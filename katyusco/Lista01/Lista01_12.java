import java.util.Scanner;

class Lista01_12 {
	
	private static int calcula_expoente(int num, int expoente) {
		int result = num;
		int counter = 1;
		while (counter < expoente) {
			counter++;
			result *= num;
		}
		return result;
	}
	
	
	public static void main (String[] args) {
		
		int quad, cub, espac_num, espc_quad, espc_cub;
		
		for (int i = 0; i <= 10; i++) {
			
			quad = calcula_expoente(i, 2);
			cub = calcula_expoente(i, 3);
			
			if (i == 0) {
				System.out.println("-------------------------------------");
				System.out.println("|  Número  | Quadrado  |   Cubo    |");
				System.out.println("-------------------------------------");
			}
			
			System.out.print("|");
			// para numero
			if (i >= 0 && i <= 9) System.out.print("     " + i + "     ");
			else if (i >= 10 && i <= 99)System.out.print("     " + i + "    ");
			System.out.print("|");
		
			// para quad
			if (quad >= 0 && quad <= 9) System.out.print("     " + quad + "     ");
			else if (quad >= 10 && quad <= 99) System.out.print("     " + quad + "    ");
			else if (quad >= 100 && quad <= 999) System.out.print("    " + quad + "    ");
			System.out.print("|");
			
			// para cub
			if (cub >= 0 && cub <= 9) System.out.print("     " + cub + "     ");
			else if (cub >= 10 && cub <= 99) System.out.print("     " + cub + "    ");
			else if (cub >= 100 && cub <= 999) System.out.print("    " + cub + "    ");
			else if (cub >= 1000 && cub <= 9999) System.out.print("    " + cub + "   ");
			System.out.println("|");
			
			System.out.println("-------------------------------------");
			
		}
		
	}
	
}