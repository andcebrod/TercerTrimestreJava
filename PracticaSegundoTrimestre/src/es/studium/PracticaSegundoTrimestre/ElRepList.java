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

public class ElRepList implements WindowListener, ActionListener, TextListener{
	Frame ventanaElRepList = new Frame ("Buscar reparación para eliminar");
	Label lblBuscarRep = new Label ("Buscar avería :");
	TextField txtBuscarRep = new TextField(10);
	List ListaRep = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	
	Dialog dlgElRep = new Dialog(ventanaElRepList, "Eliminar la reparación");
	Label lblEliminar = new Label("¿Está seguro de eliminar la reparación?");
	Button btnEliminar = new Button ("Eliminar");
	Button btnCancelar = new Button ("Cancelar");
	Dialog dlgEliminado = new Dialog(dlgElRep, "Reparación Eliminada");
	Label lblEliminado = new Label("Reparación Eliminada");
	
	public ElRepList() 
	{
		ventanaElRepList.setLayout(new FlowLayout());
		ventanaElRepList.setLocationRelativeTo(null);
		ventanaElRepList.setSize(400,600);
		ventanaElRepList.add(lblBuscarRep);
		ventanaElRepList.add(txtBuscarRep);
		ventanaElRepList.add(btnBuscar);
		ventanaElRepList.add(ListaRep);
		ventanaElRepList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);

		dlgElRep.setLocationRelativeTo(null);
		dlgElRep.setLayout(new FlowLayout());
		dlgElRep.setSize(250,120);
		dlgElRep.add(lblEliminar);
		dlgElRep.add(btnEliminar);
		btnEliminar.addActionListener(this);
		dlgElRep.add(btnCancelar);
		dlgElRep.addWindowListener(this);
		dlgElRep.setVisible(false);
		
		dlgEliminado.setLocationRelativeTo(null);
		dlgElRep.setLayout(new FlowLayout());
		dlgEliminado.setSize(250,120);
		dlgEliminado.add(lblEliminado);
		dlgEliminado.addWindowListener(this);
		dlgEliminado.setVisible(false);
		
		
		ventanaElRepList.addWindowListener(this);
		ventanaElRepList.setVisible(true);
	}
	public static void main(String[] args) {}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(btnSeleccionar.equals(ae.getSource())) 
		{
			dlgElRep.setVisible(true);
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
		if(ventanaElRepList.isActive()) {
			ventanaElRepList.setVisible(false);
		}else {
			//System.exit(0);
		} if(dlgElRep.isActive()) {
			dlgElRep.setVisible(false);
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
