import javax.swing.*;
public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base= Integer.parseInt(JOptionPane.showInputDialog(" Introduce la base "));
		
		int exponente= Integer.parseInt(JOptionPane.showInputDialog(" Introduce la base "));
		
		double resultado= Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a la " + exponente + " es " + resultado);
		

	}

}
