import java.util.Scanner;
import java.util.Locale;

class Lista01_11 {
	
	private static int lis_cod[] = {10,11,12,20,30,50};
	private static double lis_price[] = {1.5,1.80,1.90,10.0,8.0,2.50};
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		int i;
		int cod;
		int quant;
		double valor_a_ser_pago = 0;
			
			while (true) {

				System.out.print("codigo do produto: ");
				cod = input.nextInt();
				System.out.print("quantiadade deste produto: ");
				quant = input.nextInt();
				
				for (i = 0; i < 6; i++) {
		
					if (lis_cod[i] == cod) {
						valor_a_ser_pago += lis_price[i] * quant;
					}
					
				}
				
				if (valor_a_ser_pago > 50.0) valor_a_ser_pago -= valor_a_ser_pago*(5.0/100.0);				
			
				System.out.println("Valor a ser pago: " + valor_a_ser_pago);
			}
		
	}
	
}