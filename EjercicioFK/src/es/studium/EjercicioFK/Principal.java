package es.studium.EjercicioFK;

public class Principal {

	public static void main(String[] args) 
	{
		VistaMenuPrincipal VistaMP = new VistaMenuPrincipal();
		VistaAltaFactura VistaAF = new VistaAltaFactura();
		Modelo mod = new Modelo();
		new Controlador(VistaMP, VistaAF, mod);

	}

}
