package es.studium.ListaAlumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ListaAlumnos
{
	public static void main( String args[] )
	{
		Scanner leer = new Scanner(System.in);
		int op;
		double media;
		// Creamos un objeto de tipo NodoLista
		NodoLista nodo = new NodoLista();
		//Creamos la lista donde guardaremos los nodos
		ArrayList<String> lista1 = new ArrayList<String>();

		do
		{
			// Vamos preguntando los datos...
			System.out.println( "Ingrese el nombre del alumno:" );
			// ...y metiéndolos en el objeto nodo
			nodo.nom = leer.next();
			System.out.println( "Ingrese la primera calificación:" );
			nodo.calif1 = leer.nextInt();
			System.out.println( "Ingrese la segunda calificación:" );
			nodo.calif2 = leer.nextInt();
			System.out.println( "Ingrese la tercera calificación:" );
			nodo.calif3 = leer.nextInt();
			//Metemos en la lista los valores del nodo
			lista1.add("Nombre del alumno:\n"+nodo.nom);
			lista1.add("Calificación 1:\n"+nodo.calif1);
			lista1.add("Calificación 2:\n"+nodo.calif2);
			lista1.add("Calificación 3\n"+nodo.calif3);
			//Calculamos la media
			media = calcularMedia(nodo.calif1, nodo.calif2, nodo.calif3);
			//Metemos la media en la lista
			lista1.add("Su media es:\n"+media);
			System.out.println( "¿Desea ingresar otro alumno?" );
			System.out.println( "1.-Si\t 2.-No" );
			op = leer.nextInt();
		}while(op != 2);
		// Creamos una segunda lista con los datos de la primera
		List <String>lista2 = new ArrayList<String>(lista1);
		// Creamos el iterador para recorrer la lista
		Iterator it = lista2.iterator();
		// Recorremos la lista con el iterador
		/*
		while (it.hasNext())
		{
			System.out.println(it.next()+"");
		} 
		*/
		for(String NodoLista:lista2) {
			System.out.println(NodoLista);
		}
		/*
		for(int i=0; i<lista2.size(); i++)
		{
		System.out.println(lista2.get(i));
		}
		*/
	}
	private static double calcularMedia(int calif1, int calif2, int calif3)
	{
		int suma;
		double media;
		suma = calif1 + calif2 + calif3;
		// Calcular la media
		media = (double)suma/3.0;
		// Redondear a 2 decimales
		media = Math.rint(media*100)/100;
		return media;
	}
}