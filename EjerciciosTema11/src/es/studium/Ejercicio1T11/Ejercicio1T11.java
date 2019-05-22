package es.studium.Ejercicio1T11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio1T11 
{	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(22);
		lista.add(45);
		Iterator<Integer> iterador = lista.iterator();
		
		while (iterador.hasNext()) 
		{
			System.out.println(iterador.next());
		}
	}
}