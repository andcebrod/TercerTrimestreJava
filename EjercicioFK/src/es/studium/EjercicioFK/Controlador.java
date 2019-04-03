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
		String[] array = ie.getItem().toString().split("-");
		ClienteSeleccionado = Integer.parseInt(array[0]);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
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
					s = s + " - "+ rs.getString("nombreCliente")+" "+ rs.getString("apellidosCliente")+" - "+rs.getString("dniCliente");
					VistaAF.clientes.add(s);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,"Error",e.getMessage(), JOptionPane.ERROR_MESSAGE);
			}
			Model.desconectar(Model.conectar("ejemplofk","root" ,"Studium2018;"));
		}
		if(VistaAF.btnSiguiente.equals(ae.getSource())) 
		{
			new VistaAltaLineaFactura(ClienteSeleccionado);
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
