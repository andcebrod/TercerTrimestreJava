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

public class ElRecList implements WindowListener, ActionListener,TextListener {
	
	Frame ventanaElRecList = new Frame ("Buscar recambio para eliminar");
	Label lblBuscarElRec = new Label ("Buscar descripción de recambio:");
	TextField txtBuscarRec = new TextField(10);
	List ListaRec = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	
	Dialog dlgElRec = new Dialog(ventanaElRecList, "Eliminar recambio");
	Label lblEliminar = new Label("¿Está seguro de eliminar el recambio?");
	Button btnEliminar = new Button ("Eliminar");
	Button btnCancelar = new Button ("Cancelar");
	Dialog dlgEliminado = new Dialog(dlgElRec, "Recambio Eliminado");
	Label lblEliminado = new Label("Recambio Eliminado");
	
	public ElRecList() 
	{
		ventanaElRecList.setLayout(new FlowLayout());
		ventanaElRecList.setLocationRelativeTo(null);
		ventanaElRecList.setSize(400,600);
		ventanaElRecList.add(lblBuscarElRec);
		ventanaElRecList.add(txtBuscarRec);
		ventanaElRecList.add(btnBuscar);
		ventanaElRecList.add(ListaRec);
		ventanaElRecList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		

		dlgElRec.setLocationRelativeTo(null);
		dlgElRec.setLayout(new FlowLayout());
		dlgElRec.setSize(200,100);
		dlgElRec.add(lblEliminar);
		dlgElRec.add(btnEliminar);
		btnEliminar.addActionListener(this);
		dlgElRec.add(btnCancelar);
		dlgElRec.addWindowListener(this);
		dlgElRec.setVisible(false);
		
		dlgEliminado.setLocationRelativeTo(null);
		dlgElRec.setLayout(new FlowLayout());
		dlgEliminado.setSize(200,100);
		dlgEliminado.add(lblEliminado);
		dlgEliminado.addWindowListener(this);
		dlgEliminado.setVisible(false);
		
		ventanaElRecList.addWindowListener(this);
		ventanaElRecList.setVisible(true);
	}
	
	public static void main(String[] args) {new ElRecList();}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(btnSeleccionar.equals(ae.getSource())) {
			dlgElRec.setVisible(true);
		} else if(btnEliminar.equals(ae.getSource())) 
		{
			dlgEliminado.setVisible(true);
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		if(ventanaElRecList.isActive()) {
			ventanaElRecList.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgElRec.isActive()) {
			dlgElRec.setVisible(false);
		}
		if(dlgEliminado.isActive()) {
			dlgEliminado.setVisible(false);
		}
		
	}
		
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}
	@Override
	public void windowIconified(WindowEvent arg0) {}
	@Override
	public void windowOpened(WindowEvent arg0) {}

}
