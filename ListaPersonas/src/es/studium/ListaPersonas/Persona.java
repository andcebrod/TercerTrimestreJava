package es.studium.ListaPersonas;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Persona implements Comparable{


	private String nombre;
	private String apellidos;
	private String dni;
	private Date fechaNacimiento;

	public String toString()
	{
		return this.apellidos + " " + this.nombre + " " + this.dni + " "
				+ DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.getDefault()).format(this.fechaNacimiento);
	} 
	public Persona(String nombre, String apellidos, String dni, Date
			fechaNacimiento)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getApellidos()
	{
		return apellidos;
	}
	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}
	public String getDni()
	{
		return dni;
	}
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	public Date getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{ 
		this.nombre = nombre;
	}

	public int compareTo(Object o)
	{
		Persona persona = (Persona)o;
		if(this.apellidos.compareToIgnoreCase(persona.apellidos) == 0)
		{
			if(this.nombre.compareToIgnoreCase(persona.nombre) == 0)
			{
				return this.dni.compareTo(persona.dni);
			}
			else
			{
				return this.nombre.compareToIgnoreCase(persona.nombre);
			}
		}
		else
		{
			return this.apellidos.compareToIgnoreCase(persona.apellidos);
		}
	}
}
