
package cesar.guzman.entradaSalida;

import java.util.*;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer # por favor ");
				
		int numero1= entrada.nextInt();
		
		System.out.println("Introduce el segundo # por favor ");
		
		int numero2= entrada.nextInt();
		
		System.out.println("Introduce el tercer # por favor ");
		
		int numero3= entrada.nextInt();
		
		System.out.println("La sumea de los numeros es: " + (numero1+numero2+numero3));
		
		entrada.close();
		
	}

}
