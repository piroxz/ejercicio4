package Ejercicio4;

public class Contacto extends Titular{

	protected String telefono;
	
	public Contacto(){
		super();
		telefono = "666666666";
	}
	
	public Contacto(String nombre,String telefono){
		this.nombre = nombre ;
		this.telefono = telefono;
	}
	
	
	
	public String gettelefono(){
		return telefono;
	}
 	
	public void settelefono(String telefono){
		
		this.telefono = telefono;
	}
	
	
	
	
	
	
	
	
	
}
