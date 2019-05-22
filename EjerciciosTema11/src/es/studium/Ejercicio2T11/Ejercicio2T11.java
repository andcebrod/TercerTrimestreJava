package es.studium.Ejercicio2T11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2T11 
{
	public static void main(String[] args) {
		List<Float> lista = new ArrayList<Float>();
		lista.add(0, 1.1f);
		lista.add(0, 1.2f);
		lista.add(0, 1.3f);
		
		//Recorrer Lista
		Iterator<Float> iterador = lista.iterator();
		while (iterador.hasNext()) 
		{
			System.out.println(iterador.next());
			
		}
		
	}
}
