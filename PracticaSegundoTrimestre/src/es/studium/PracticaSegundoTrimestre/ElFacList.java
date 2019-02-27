package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ElFacList implements WindowListener, ActionListener, TextListener{
	
	Frame ventanaElFacList = new Frame ("Buscar factura para eliminar");
	Label lblBuscarFac = new Label ("Buscar id de factura:");
	TextField txtBuscarFac = new TextField(10);
	List ListaRec = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	Dialog dlgElFac = new Dialog(ventanaElFacList, "Eliminar Factura");
	Label lblEliminar = new Label("¿Está seguro de eliminar la factura?");
	Button btnEliminar = new Button ("Eliminar");
	Button btnCancelar = new Button ("Cancelar");
	Dialog dlgEliminado = new Dialog(dlgElFac, "Factura Eliminada");
	Label lblEliminado = new Label("Factura Eliminada");
	
	public ElFacList () 
	{
		ventanaElFacList.setLayout(new FlowLayout());
		ventanaElFacList.setLocationRelativeTo(null);
		ventanaElFacList.setSize(400,600);
		ventanaElFacList.add(lblBuscarFac);
		ventanaElFacList.add(txtBuscarFac);
		ventanaElFacList.add(btnBuscar);
		ventanaElFacList.add(ListaRec);
		ventanaElFacList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		
		ventanaElFacList.addWindowListener(this);
		ventanaElFacList.setVisible(true);
		
		dlgElFac.setLocationRelativeTo(null);
		dlgElFac.setLayout(new FlowLayout());
		dlgElFac.setSize(220,100);
		dlgElFac.add(lblEliminar);
		dlgElFac.add(btnEliminar);
		btnEliminar.addActionListener(this);
		dlgElFac.add(btnCancelar);
		dlgElFac.addWindowListener(this);
		dlgElFac.setVisible(false);
		
		dlgEliminado.setLocationRelativeTo(null);
		dlgElFac.setLayout(new FlowLayout());
		dlgEliminado.setSize(220,100);
		dlgEliminado.add(lblEliminado);
		dlgEliminado.addWindowListener(this);
		dlgEliminado.setVisible(false);
		
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		if(btnSeleccionar.equals(ae.getSource())) 
		{
			dlgElFac.setVisible(true);
		} else if(btnEliminar.equals(ae.getSource())) 
		{
			dlgEliminado.setVisible(true);
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
		if(ventanaElFacList.isActive()) {
			ventanaElFacList.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgElFac.isActive()) {
			dlgElFac.setVisible(false);
		}
		if(dlgEliminado.isActive()) {
			dlgEliminado.setVisible(false);
		}
		
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
