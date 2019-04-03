package es.studium.EjercicioFK;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VistaMenuPrincipal extends JFrame
{
	/**
	 * 
	 */
	
	JButton btnAltaFactura = new JButton("Alta Factura");	
	
	private static final long serialVersionUID = 1L;

	public VistaMenuPrincipal() 
	{
		this.setLayout(new FlowLayout());
		this.setSize(300,100);
		this.setLocationRelativeTo(null);
		this.add(btnAltaFactura);
		this.setTitle("Menu Principal");
		this.setVisible(true);
		
	}

	

}
