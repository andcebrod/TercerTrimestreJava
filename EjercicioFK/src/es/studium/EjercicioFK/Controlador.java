package es.studium.EjercicioFK;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Controlador implements WindowListener, ActionListener, ItemListener
{
	int ClienteSeleccionado = 0;
	VistaMenuPrincipal VistaMP;
	VistaAltaFactura VistaAF;
	Modelo Model;
	double Total = 0;
	String ArticuloSeleccionado ="";
	double subTotal=0;
	double precio = 0;
	VistaAltaLineaFactura VistaALF;

	public Controlador(VistaMenuPrincipal VMP, VistaAltaFactura VAF, Modelo Mod) {
		this.VistaMP = VMP;
		this.VistaAF = VAF;
		this.Model = Mod;
		VMP.btnAltaFactura.addActionListener(this);
		VMP.addWindowListener(this);
		VAF.btnCancelar.addActionListener(this);
		VAF.btnSiguiente.addActionListener(this);
		VAF.addWindowListener(this);
		VAF.clientes.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub



	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(VistaMP.btnAltaFactura.equals(ae.getSource())) 
		{
			VistaMP.setVisible(false);
			VistaAF.setVisible(true);


			VistaAF.txtFechaFactura.setText(Model.Calendario());

			ResultSet rs = Model.ejecutarSelect(Model.SentenciaSelect("*", "clientes"),Model.conectar("ejemplofk","root" ,"Studium2018;"));

			try {
				while(rs.next())
				{
					String s=Integer.toString(rs.getInt("idCliente"));
					s = s + "-"+ rs.getString("nombreCliente")+" "+ rs.getString("apellidosCliente")+" - "+rs.getString("dniCliente");
					VistaAF.clientes.add(s);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
			}
			Model.desconectar(Model.conectar("ejemplofk","root" ,"Studium2018;"));
		}
		if(VistaAF.btnSiguiente.equals(ae.getSource())) 
		{
			try {

				String[] array= VistaAF.clientes.getSelectedItem().toString().split("-");
				ClienteSeleccionado = Integer.parseInt(array[0]);
				String Fecha = VistaAF.txtFechaFactura.getText();
				String[] arrayFecha = Fecha.split("/");
				try {
				Fecha = arrayFecha[2]+"-"+arrayFecha[1]+"-"+arrayFecha[0];
				} catch (ArrayIndexOutOfBoundsException ai) {
					
				}
				Model.ejecutarIDA("INSERT INTO FACTURAS VALUES (null,'"+Fecha+"',"+ClienteSeleccionado+");", Model.conectar("ejemplofk","root" ,"Studium2018;"));
				ResultSet rs = Model.ejecutarSelect("SELECT MAX(idFactura) from facturas;",Model.conectar("ejemplofk","root" ,"Studium2018;"));
				try {
					rs.next();
					int idFac = Integer.parseInt(rs.getString("MAX(idFactura)"));
					VistaALF = new VistaAltaLineaFactura(idFac);
					VistaALF.addWindowListener(this);
					VistaALF.btnAgregar.addActionListener(this);
					VistaALF.btnAceptar.addActionListener(this);
					VistaAF.setVisible(false);
					ResultSet rsArt = Model.ejecutarSelect("SELECT * FROM articulos;", Model.conectar("ejemplofk","root","Studium2018;")); 
					try {
						while(rsArt.next())
						{
							String art = Integer.toString(rsArt.getInt("idArticulo"));
							art = art + "-"+ rsArt.getString("descripcionArticulo");
							VistaALF.articulos.add(art);
						}
					} catch (SQLException e) {
						JOptionPane.showMessageDialog(null,e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
					}
					Model.desconectar(Model.conectar("ejemplofk","root" ,"Studium2018;"));

				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null,e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
				}
			} catch (NumberFormatException nf) {
				JOptionPane.showMessageDialog(null,"Introduzca cliente válido","Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		try {
			if(VistaALF.btnAgregar.equals(ae.getSource())) 
			{
				try {
					int Cantidad = Integer.parseInt(VistaALF.txtCantidad.getText());
					String[] arrayCod= VistaALF.articulos.getSelectedItem().toString().split("-");
					ResultSet ArtSelect = Model.ejecutarSelect("SELECT precioArticulo from articulos where idArticulo ="+arrayCod[0]+";",Model.conectar("ejemplofk", "root", "Studium2018;"));
					try {
						ArtSelect.next();
						precio =  ArtSelect.getDouble("precioArticulo");
						subTotal = precio*Cantidad;
						Total = Total + ArtSelect.getDouble("precioArticulo")*Cantidad;
						ArticuloSeleccionado = ArticuloSeleccionado+" "+VistaALF.articulos.getSelectedItem().toString()+" "+Double.toString(precio)+" "+Cantidad+" "+Double.toString(subTotal)+"\n";
						VistaALF.txtArticulos.setText(ArticuloSeleccionado);
						VistaALF.txtTotal.setText(Double.toString(Total));
						Model.desconectar(Model.conectar("ejemplofk", "root", "Studium2018;"));
						Model.ejecutarIDA("INSERT INTO lineasfactura values (null,"+VistaALF.lblFactura.getText()+","+arrayCod[0]+","+Cantidad+");", Model.conectar("ejemplofk", "root", "Studium2018;"));


					} catch (SQLException e){
						JOptionPane.showMessageDialog(null,e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
					}
					Model.desconectar(Model.conectar("ejemplofk","root" ,"Studium2018;"));
				} catch(NumberFormatException nf) {
					JOptionPane.showMessageDialog(null,"Introduzca cantidad o artículo válidos","Error", JOptionPane.ERROR_MESSAGE);
				}
			} 
		} catch(NullPointerException n) {

		}
		try {
			if(VistaALF.btnAceptar.equals(ae.getSource())) 
			{

				JOptionPane.showMessageDialog(null,"Factura creada correctamente con un total de "+VistaALF.txtTotal.getText(),"Factura creada", JOptionPane.INFORMATION_MESSAGE);

			}
		} catch(NullPointerException n) {

		}
		try {
			if(VistaALF.btnCancelar.equals(ae.getSource())) {
				VistaAF.setVisible(true);
				VistaALF.setVisible(false);
			} 
		}catch(NullPointerException n) {

		}

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}





}
