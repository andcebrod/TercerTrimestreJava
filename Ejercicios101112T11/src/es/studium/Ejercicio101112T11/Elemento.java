package es.studium.Ejercicio101112T11;

public class Elemento {
	public String cod;
	public String nombre;
	public int edad;
	
	public Elemento(String cod, String nombre, int edad) {
		this.cod = cod;
		this.nombre = nombre;
		this.edad = edad;
	}
	public Elemento() {
		cod = "";
		nombre = "";
		edad = 0;
	}
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String mostrarElemento(Elemento e) {
		String resultado;
		resultado = e.getCod()+", "+e.getNombre()+", "+e.getEdad();
		return resultado;
	}
}
