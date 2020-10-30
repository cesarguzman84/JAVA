package cesar.guzman.poo;

import java.util.*;

public class UsoCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente Cuenta1= new CuentaCorriente("Juan", 5600);
		
		CuentaCorriente Cuenta2= new CuentaCorriente("Cesar", 3000);
		
		CuentaCorriente.Transferencia(Cuenta2, Cuenta1, 200);
		
		System.out.println(Cuenta1.getDatosCuenta());
		
		System.out.println(Cuenta2.getDatosCuenta());
		
		

	}

}
