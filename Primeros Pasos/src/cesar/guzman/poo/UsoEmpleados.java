package cesar.guzman.poo;

import java.util.GregorianCalendar;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Empleados Antonio=new Empleados("Antonio", 2300.5, 2005, 7, 15);
		
		Jefes Ana=new Jefes ("Ana", 2900, 2008, 8, 9);
		
		Ana.setIncentivo(300.5);
		
		System.out.println(Ana.getSueldo());
		

	}
	
	
}

class Empleados {
	
	
	public Empleados(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		calendario=new GregorianCalendar(agno, mes, dia);
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
		
		
	}
	
	public static String getIdSiguiente() {
		
		return "El Id de los empleados sera: " + IdSiguiente;
		
	}
	
	public double getSueldo() {
		
		return sueldo;
	}
	
	public GregorianCalendar getFechaAlta () {
		
		return calendario;
	}
	
	public void setSubeSueldo (double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
	}
	
	public String getDatosEmpleado( ) {
		
		return "El empleado " + nombre + " tiene el Id " + Id;
	}
	
	private final String nombre;
	
	private double sueldo;
	
	GregorianCalendar calendario;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
	
}

class Jefes extends Empleados {

	public Jefes(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		// TODO Auto-generated constructor stub
		
	
	}
	
	public void setIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double getSueldo () {
		
		double sueldoJefe=super.getSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	private double incentivo;
}
