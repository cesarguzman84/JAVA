import java.util.*;
public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		
		double numero= entrada.nextDouble();
		
		double raiz= Math.sqrt(numero);
		
		System.out.println("La raiz cuadrada del numero " + numero + " es: " + raiz );
		
		entrada.close();

	}

}
