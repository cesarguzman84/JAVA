package cesar.guzman.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la frase introducida \n"
				+ "Para terminar escribe salir");
		
		String texto="";
		
		while(!texto.equals("salir")) {
		
		texto = JOptionPane.showInputDialog("Introduce el texto");
		
		JOptionPane.showMessageDialog(null, "El texto introducido tiene " + texto.length() + " caracteres");
		}
		
		System.out.println("Has salido del programa");
	}

}
