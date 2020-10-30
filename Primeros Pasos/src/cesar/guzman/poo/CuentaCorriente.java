package cesar.guzman.poo;

import java.util.*;

public class CuentaCorriente {
	
	public CuentaCorriente(String nombreTitular, double saldo) {
		
		this.nombreTitular=nombreTitular;
		
		this.saldo=saldo;
		
		Random rnd=new Random();
		
		numeroCuenta=Math.abs(rnd.nextLong());
		
	}
		
public void setIngreso (double Ingreso) {
	
	if (Ingreso<0) System.out.println("El ingreso no es valido");
	
	else saldo+=Ingreso;
}
		
public void setReintegro(double Reintegro) 	{
	
	saldo-=Reintegro;
	
}

public String getSaldo() {
	
	return "El saldo de la cuenta es " + saldo;
	
}

public String getDatosCuenta() {
	
	return "Titular :" + nombreTitular + "\n" + "# de cuenta: " + numeroCuenta + "\n" + "Saldo: " + saldo;
	
}

public static void Transferencia (CuentaCorriente titu1, CuentaCorriente titu2, double cantidad) {
	
	titu1.saldo-=cantidad;
	
	titu2.saldo-=cantidad;
}

private String nombreTitular;

private double saldo;

private long numeroCuenta;
	
}
