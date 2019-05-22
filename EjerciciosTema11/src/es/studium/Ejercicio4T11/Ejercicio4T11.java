package es.studium.Ejercicio4T11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio4T11 
{
	 
	public static void main(String[] args)
	{
		List<Float> lista = new ArrayList<Float>();
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		Float dato = null;
		Integer posicion = null;
		boolean fin = false;
		do {
			System.out.println("Introduce dato: ");
			try {
				dato = Float.parseFloat(lectura.readLine());
				System.out.println("Introduce posición: ");
				posicion = Integer.parseInt(lectura.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				fin = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(posicion<=lista.size()) {
				lista.add(posicion,dato);
			} else {
				System.out.println("Introduzca una posición válida.");
			}
			
		} while (!fin);
		Iterator<Float> iterador = lista.iterator();
		while (iterador.hasNext()) 
		{
			System.out.println(iterador.next());
		}
	}
}
