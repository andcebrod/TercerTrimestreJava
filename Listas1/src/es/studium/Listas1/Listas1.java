package es.studium.Listas1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Listas1
{
	List<String> lista = new ArrayList<String>();
	public static void main(String[] args)
	{
		new Listas1();
	}
	public Listas1()
	{
		lista.add("Andrea");
		lista.add("Amaya");
		lista.add("Julio");
		Iterator<String> iter = lista.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}