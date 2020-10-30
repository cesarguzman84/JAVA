package cesar.guzman.poo;
import java.util.*;

public class Fiesta {
	
	
	private String invitados;
    private String comidas;
    private String bebidas;
    private String musica;
    private Date fecha;
    private String direccion;
    
    
    public String getInvitados() {
        return invitados;
    }
    
    
    public void setInvitados(String invitados) {
        this.invitados = invitados;
    }
    
    public String getComidas() {
        return comidas;
    }
    
    public void setComidas(String comidas) {
        this.comidas = comidas;
    }
    
    public String getBebidas() {
        return bebidas;
    }
    
    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getMusica() {
        return musica;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
	// public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	// }

	
public class Comida {
	
	private String nombre;
	
	private Integer stock;
	
	
	public String getNombre() {
        return nombre;
    }
	
	
	public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	public Integer getStock() {
        return stock;
    }
	
	public void setStock(Integer stock) {
        this.stock = stock;
    }
	
	
}


public class Bebida {
    private String nombre;
    private boolean isAlcoholica;
    private Integer stock;
    private String tipoVaso;
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean isIsAlcoholica() {
        return isAlcoholica;
    }
    
    public void setIsAlcoholica(boolean isAlcoholica) {
        this.isAlcoholica = isAlcoholica;
    }
    
    public Integer getStock() {
        return stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    public String getTipoVaso() {
        return tipoVaso;
    }
    
    public void setTipoVaso(String tipoVaso) {
        this.tipoVaso = tipoVaso;
    }
    
	}



public class Musica {
    private String nombre;
    private String artista;
    private String tipo;
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}


}

