package cesar.guzman.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Cesar";
		
		String acceso="";
		
		while (!clave.equals(acceso)) {
		
		acceso=JOptionPane.showInputDialog("Introduce la clave");
		
		if (!clave.equals(acceso)) {
			
			System.out.println("Clave erronea");
		}

	}
	
	System.out.println("Bienvenido");
	
	}	

}
