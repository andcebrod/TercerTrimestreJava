package es.studium.EjercicioFK;

import java.awt.*;
import javax.swing.*;

public class VistaAltaLineaFactura extends JFrame 

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lblTituloFactura = new JLabel("Factura nº ");
	JLabel lblFactura = new JLabel("");
	JLabel lblArticulo = new JLabel("Artículo:");
	JLabel lblCantidad = new JLabel("Cantidad: ");
	JLabel lblIdArticulo = new JLabel("idArticulo");
	JLabel lblDescripcion = new JLabel("Descripción");
	JLabel lblCantidad2 = new JLabel("Cantidad");
	JLabel lblPrecio = new JLabel("Precio");
	JLabel Subtotal = new JLabel("Subtotal");
	JLabel lblTotal = new JLabel("Total");
	
	JTextArea txtArticulos = new JTextArea();
	
	Choice articulos = new Choice();
	JTextField txtCantidad = new JTextField(3);
	JTextField txtTotal = new JTextField(3);
	JButton btnAgregar = new JButton("Agregar");
	JButton btnCancelar = new JButton("Cancelar");
	JButton bntAceptar = new JButton("Aceptar");
	List listaLineaFac = new List();
	
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	JPanel pnl4 = new JPanel();
	JPanel pnl5 = new JPanel();
	
	public VistaAltaLineaFactura(int FacturaSeleccionada) 
	{
		String idFacturaFK = Integer.toString(FacturaSeleccionada);
		lblFactura.setText(idFacturaFK);
		this.setLayout(new GridLayout(5,1));
		this.setSize(330, 400);
		pnl1.add(lblTituloFactura);
		pnl1.add(lblFactura);
		this.add(pnl1);
		pnl2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Detalles"));
		pnl2.add(lblArticulo);
		pnl2.add(articulos);
		pnl2.add(lblCantidad);
		pnl2.add(txtCantidad);
		pnl2.add(btnAgregar);
		pnl3.add(txtArticulos);
		pnl4.add(lblTotal);
		pnl4.add(txtTotal);
		pnl5.add(bntAceptar);
		pnl5.add(btnCancelar);
		this.add(pnl2);
		this.add(pnl3);
		this.add(pnl4);
		this.add(pnl5);
		this.setVisible(true);
		
	}
	
}
