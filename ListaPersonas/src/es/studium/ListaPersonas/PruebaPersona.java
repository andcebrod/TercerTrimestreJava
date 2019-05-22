package es.studium.ListaPersonas;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
public class PruebaPersona
{
	public static void pintaLista(List lista)
	{
		for(int i=0;i<lista.size();i++)
		{
			System.out.println(lista.get(i));
		}
	} 
	public static void main(String[] args)
	{
		List lista = new ArrayList();
		Calendar cal = Calendar.getInstance();
		cal.set(1976,3,21);
		Persona persona1 = new Persona("Francisco Javier","Mart�nez P�ez","11111111A",cal.getTime());
		cal.set(1973,8,12);
		Persona persona2 =
				new Persona("Roberto","Canales Mora","22222222B",cal.getTime());
		cal.set(1975,7,23);
		Persona persona3 =
				new Persona("Alejandro","P�rez Garc�a","33333333C",cal.getTime());
		cal.set(1980,6,14);
		Persona persona4 =
				new Persona("Germ�n","Jim�nez Centeno","44444444D",cal.getTime());
		cal.set(1981,5,8);
		Persona persona5 =
				new Persona("Alfonso","Blanco Criado","55555555E",cal.getTime());
		cal.set(1981,9,30);
		Persona persona6 =
				new Persona("Ra�l","Exp�sito D�az","66666666F",cal.getTime());
		lista.add(persona1);
		lista.add(persona2);
		lista.add(persona3);
		lista.add(persona4);
		lista.add(persona5);
		lista.add(persona6);
		System.out.println("---------- SIN ORDENAR ------------");
		pintaLista(lista);
		System.out.println(
				"---------- ORDEN NATURAL DEFINIDO en compareTo ------------");
		Collections.sort(lista);
		pintaLista(lista);
	}
}