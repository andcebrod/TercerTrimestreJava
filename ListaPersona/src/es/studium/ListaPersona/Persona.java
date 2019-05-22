package es.studium.ListaPersona;

public class Persona {
	public String nombre;
	public String correo;
	public int telefono;
	
	public Persona(String nombre, String correo, int telefono) {
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String mostrarPersona(Persona p) {
		String resultado;
		resultado = p.getNombre()+", "+p.getCorreo()+", "+p.getTelefono();
		return resultado;
	}

}
