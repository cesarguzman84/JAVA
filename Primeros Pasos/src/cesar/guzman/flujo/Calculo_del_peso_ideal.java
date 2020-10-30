package cesar.guzman.flujo;

import javax.swing.JOptionPane;

public class Calculo_del_peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int altura;
		
		String genero;
		
			
		altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura en cm "));
		
		genero=JOptionPane.showInputDialog("Introduce tu genero: H/M");
		
		if(genero.equalsIgnoreCase("H")) {
			
			System.out.println ("Tu peso ideal es: "  + (altura-110) + "Kg ");
			
			
		} else {
			
			System.out.println ("Tu peso ideal es: "  + (altura-120) + "Kg ");
		}
	}

}
