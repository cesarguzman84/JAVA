package cesar.guzman.flujo;

import javax.swing.JOptionPane;

import javax.swing.*;

public class Email_correcto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean valido=false;
		
		do {
			
			String email=JOptionPane.showInputDialog("Introduce direccion de email");
			
			int arroba=0;
			
			boolean punto=false;
			
			for(int i=0; i<email.length();i++) {
				
				if(email.charAt(i)=='@') arroba++;
				
				if(email.charAt(i)=='.') punto=true;
				
			}
			
			if (arroba==1 && punto==true && email.length()>=4) valido=true;
			
			else JOptionPane.showMessageDialog(null, "Email no valido");
			
		} while (valido==false);
		
		
		System.out.println("El email es correcto");
	}

}
