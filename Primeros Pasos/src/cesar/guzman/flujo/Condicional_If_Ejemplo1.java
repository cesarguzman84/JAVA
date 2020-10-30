package cesar.guzman.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad;
		
		edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		
				
		if(edad>=18) {

			System.out.println("Eres mayor ");
	} else {

		System.out.println("Eres menor");
		}
	}
}
