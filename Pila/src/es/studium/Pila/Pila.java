package es.studium.Pila;

import java.util.*;
public class Pila
{
	static String diasSemana[]={"Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes","S�bado", "Domingo"};
	public static void main(String args[])
	{
		int i;
		Stack pila=new Stack();
		for(i=0;i<diasSemana.length;i++)
		{
			pila.push(diasSemana[i]+"");
		}
		System.out.println("pila= "+pila);
		//Tratando la pila como una Vector
		pila.addElement("Esta es la �ltima l�nea");
		System.out.println("Elemento 5 -> " +pila.elementAt(5));
		System.out.println("Elementos introducidos:");
		while(!pila.isEmpty())
		{
			System.out.println(pila.pop());
		}
	}
}
