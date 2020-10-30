package cesar.guzman.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		if (edad>=18) {
			
			String carnet=JOptionPane.showInputDialog("¿Tienes carnet?: ");
			
			if(carnet.equals("si")) {
				
				JOptionPane.showMessageDialog(null, "Puedes comprar el carro ");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Sin carnet no hay carro ");
				
			}
			
		}else {
			
			JOptionPane.showMessageDialog(null, "No tienes la edad ni carnet");
			
		}

	}

}
