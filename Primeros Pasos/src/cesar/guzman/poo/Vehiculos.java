package cesar.guzman.poo;

public class Vehiculos {

	public Vehiculos (int ruedas) { // Constructor de la clase. Debe llevar el mismo nombre que la clase 
		
		this.ruedas=ruedas;
		
		largo=2;
		
		ancho=1;
		
		peso=2;
		
		color="Sin color";
		
	}
	
	public Vehiculos (int ruedas, int largo, double ancho, int peso) { 
		
		
		this.ruedas=ruedas;
		
		this.largo=2;
		
		this.ancho=1;
		
		this.peso=2;
		
		color="Sin color";
		
	}
	
	public void setExtra (boolean climatizador) {
		
		this.climatizador=climatizador;
	}
	
	public void setExtra(boolean gps, boolean climatizador, boolean tapiceria_cuero) {
		
		this.climatizador=climatizador;
		
		this.gps=gps;
		
		this.tapiceria_cuero=tapiceria_cuero;
		
	}
	
	public String getExtra() {
		
		if(climatizador==true && gps==false && tapiceria_cuero==false) return "Tu coche tiene pack 1 de extras";
		else if (climatizador==true && gps==true && tapiceria_cuero==true) return "Tu coche tiene el pack 2 de extras";
		else return "La combinacion de extras no es adminida";
	}
	
	public void setColor(String color) { //metodo setter que establece valor de propiedad
		
		this.color=color;
	}
	
	public String getColor(){ //metodo getter que devuelve valor de propiedad
		
		return color;
		
	}
	
	public String getDatosVehiculo () {
		
		return "Tu vehiculo tiene " + ruedas + " ruedas. Ademas tiene " + largo + " m de largo";
		
	}
	
	private int ruedas;
	
	private String color;
	
	private int largo;
	
	private double ancho;
	
	private int peso;
	
	private boolean climatizador;
	
	private boolean tapiceria_cuero;
	
	private boolean gps;
	
	
	
}
