package cesar.guzman.poo;

import java.util.*;

public class Fiestas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fecha fecha1=new fecha ("30 de abril");
		
		System.out.println(fecha1.getFecha());
		
		direccion direccion1=new direccion ("Avenida Universidad número 300, edificio 7, departamento 401");
		
		System.out.println(direccion1.getDireccion());
		
		invitados invitados1= new invitados ("Cristina, Leydi, Mauricio y César");
		
		System.out.println(invitados1.getInvitadosFiesta());
		
		comida comida1=new comida("Bocadillos en charolas");
		
		System.out.println(comida1.getComida());
		
		bebida bebida1=new bebida ("Ron viejo de caldas y gaseosas");
		
		System.out.println(bebida1.getBebida());
		
		musica musica1=new musica ("Baladas, Rock, Cumbia entre otras");
		
		System.out.println(musica1.getTipoMusica());
		
		

	}

}

//***************************************************

class fecha {
	
	public fecha (String fecha_fiesta) {
		
		this.fecha_fiesta=fecha_fiesta;
	}
	
public String getFecha () {
	
	return "La fecha de la fiesta es: " + fecha_fiesta;
}
	

private String fecha_fiesta;

}


//*************************************************

class direccion {
	
	public direccion (String direccion_fiesta) {
		
		this.direccion_fiesta=direccion_fiesta;
	
}

public String getDireccion() {
	
	return "La direccion de la fiesta es: " + direccion_fiesta;
	
}

private String direccion_fiesta;


}

//***********************************************

class invitados {
	
	public invitados (String invitados_fiesta) {
		
		this.invitados_fiesta=invitados_fiesta;
		
	}
	
public String getInvitadosFiesta () {
	
	return "Los invitados a la fiesta son: " + invitados_fiesta;
}
	
private String invitados_fiesta;

}

//**********************************************

class comida {
	
	public comida (String nombre_comida) {
		
		this.nombre_comida=nombre_comida;
		
	}
	
	
	public String getComida () {
		
		return "La comida para la fiesta es: " + nombre_comida;
		
	}
	
	
	private String nombre_comida;
	
		
}


//*****************************************************



class bebida {
	
	public bebida (String nombre_bebida) {
			
		this.nombre_bebida=nombre_bebida;
			
	}	

	public String getBebida() {
		
		return "La bebida para la fiesta es: " + nombre_bebida;
	}
	
	private String nombre_bebida;

}



//*********************************************************

class musica {
	
	public musica (String Tipo_musica) {
		
		this.Tipo_musica=Tipo_musica;
		
	}
	
	public String getTipoMusica () {
		
		return "La musica para la fiesta es: " + Tipo_musica;
	}
	
	
	private String Tipo_musica;
	
	
}