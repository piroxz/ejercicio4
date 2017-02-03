package Ejercicio4;

public class Titular {

	
	protected String nombre;
	protected String correo;
	
	
	public Titular(){
		nombre = "Robert";
		correo = "robertgmail.com";
	}
	
	public Titular(String nombre,String correo){
		this.nombre = nombre;
		this.correo = correo;
	}
	
	
	
	public String getnombre(){
		return nombre;
	}
	
	public void setnombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getcorreo(){
		return correo;
	}
	
	public void setcorreo(String correo){
		this.correo = correo;
	}
	
	
	
	
	
	
	
	
	
}
