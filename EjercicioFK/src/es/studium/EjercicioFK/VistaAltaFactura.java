package es.studium.EjercicioFK;

import java.awt.*;
import javax.swing.*;

public class VistaAltaFactura extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel lblFechaFactura = new JLabel ("Fecha Factura:");
	JTextField txtFechaFactura = new JTextField (6);
	JLabel lblCliente = new JLabel ("Cliente:");
	Choice clientes = new Choice();
	JButton btnSiguiente = new JButton("Siguiente");
	JButton btnCancelar = new JButton("Cancelar");
	
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	
	public VistaAltaFactura() 
	{
		this.setTitle("Alta Factura");
		this.setLayout(new GridLayout(3,1));
		this.setSize(500, 250);
		this.setLocationRelativeTo(null);
		pnl1.add(lblFechaFactura);
		pnl1.add(txtFechaFactura);
		pnl2.add(lblCliente);
		pnl2.add(clientes);
		pnl3.add(btnSiguiente);
		pnl3.add(btnCancelar);
		this.add(pnl1);
		this.add(pnl2);
		this.add(pnl3);
		this.setVisible(false);
	}

}
