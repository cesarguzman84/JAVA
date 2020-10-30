package cesar.guzman.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int distancia_colegio;
		
		double renta_familiar;
		
		distancia_colegio=Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia al colegio "));
		
		renta_familiar=Double.parseDouble(JOptionPane.showInputDialog("Introduce la renta familiar "));
		
		
		if(distancia_colegio>10 && renta_familiar<20000) {
			
			System.out.println("El alumno tiene beca");			
		} else {
			
			System.out.println("El alumno no tiene beca");
		}
	}

}
