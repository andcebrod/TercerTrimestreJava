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
			
			String[] array= VistaAF.clientes.getSelectedItem().toString().split("-");
			ClienteSeleccionado = Integer.parseInt(array[0]);
			String Fecha = VistaAF.txtFechaFactura.getText();
			String[] arrayFecha = Fecha.split("/");
			Fecha = arrayFecha[2]+"-"+arrayFecha[1]+"-"+arrayFecha[0];
			Model.ejecutarIDA("INSERT INTO FACTURAS VALUES (null,'"+Fecha+"',"+ClienteSeleccionado+");", Model.conectar("ejemplofk","root" ,"Studium2018;"));
			ResultSet rs = Model.ejecutarSelect("SELECT MAX(idFactura) from facturas;",Model.conectar("ejemplofk","root" ,"Studium2018;"));
			try {
				rs.next();
				int idFac = Integer.parseInt(rs.getString("MAX(idFactura)"));
				VistaAltaLineaFactura VistaALF = new VistaAltaLineaFactura(idFac);
				VistaALF.addWindowListener(this);
				VistaALF.btnAgregar.addActionListener(this);
				VistaALF.bntAceptar.addActionListener(this);
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
				
				if(VistaALF.btnAgregar.equals(ae.getSource())) 
				{
					int Cantidad = Integer.parseInt(VistaALF.txtCantidad.getText());
					String[] arrayArt= VistaALF.articulos.getSelectedItem().toString().split("-");
					ResultSet ArtSelect = Model.ejecutarSelect("SELECT * from articulos where idArticulo ="+arrayArt[0]+";",Model.conectar("ejemplofk", "root", "Studium2018;"));
					ArtSelect.next();
					double Total = 0;
					Total = Total + ArtSelect.getDouble("precioArticulo")*Cantidad;
					String ArticuloSeleccionado =Integer.toString(ArtSelect.getInt("idArticulo"));
					ArticuloSeleccionado = ArticuloSeleccionado + "-"+ ArtSelect.getString("descripcionArticulo")+" "+ ArtSelect.getDouble("precioArticulo")+" "+ArtSelect.getDouble("precioArticulo")*Cantidad;
					VistaALF.txtArticulos.setText(ArticuloSeleccionado);
					VistaALF.txtTotal.setText(Double.toString(Total));
					Model.desconectar(Model.conectar("ejemplofk", "root", "Studium2018;"));
				}

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
			}
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
