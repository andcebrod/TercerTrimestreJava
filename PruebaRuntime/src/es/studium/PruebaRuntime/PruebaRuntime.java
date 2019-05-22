package es.studium.PruebaRuntime;

import java.io.IOException;

public class PruebaRuntime 
{
	public static void main(String[] args) {

		try
		{
			Runtime.getRuntime().exec("");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
