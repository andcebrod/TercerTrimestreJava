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

public class ElCliList implements WindowListener, ActionListener, TextListener{

	Frame ventanaElCliList = new Frame ("Buscar cliente para eliminar");
	Label lblBuscarCli = new Label ("Buscar apellidos de cliente:");
	TextField txtBuscarCli = new TextField(10);
	List ListaRec = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	Dialog dlgElCli = new Dialog(ventanaElCliList, "Eliminar Cliente");
	Label lblEliminar = new Label("¿Está seguro de eliminar al cliente?");
	Button btnEliminar = new Button ("Eliminar");
	Button btnCancelar = new Button ("Cancelar");
	Dialog dlgEliminado = new Dialog(dlgElCli, "Cliente Eliminado");
	Label lblEliminado = new Label("Cliente Eliminado");
	
	public ElCliList() {
		ventanaElCliList.setLayout(new FlowLayout());
		ventanaElCliList.setLocationRelativeTo(null);
		ventanaElCliList.setSize(400,600);
		ventanaElCliList.add(lblBuscarCli);
		ventanaElCliList.add(txtBuscarCli);
		ventanaElCliList.add(btnBuscar);
		ventanaElCliList.add(ListaRec);
		ventanaElCliList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		
		ventanaElCliList.addWindowListener(this);
		ventanaElCliList.setVisible(true);
		
		dlgElCli.setLocationRelativeTo(null);
		dlgElCli.setLayout(new FlowLayout());
		dlgElCli.setSize(200,100);
		dlgElCli.add(lblEliminar);
		dlgElCli.add(btnEliminar);
		btnEliminar.addActionListener(this);
		dlgElCli.add(btnCancelar);
		dlgElCli.addWindowListener(this);
		dlgElCli.setVisible(false);
		
		dlgEliminado.setLocationRelativeTo(null);
		dlgElCli.setLayout(new FlowLayout());
		dlgEliminado.setSize(200,100);
		dlgEliminado.add(lblEliminado);
		dlgEliminado.addWindowListener(this);
		dlgEliminado.setVisible(false);
		
	}
	public static void main(String[] args) {
		
		
	}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(btnSeleccionar.equals(ae.getSource())) 
		{
			dlgElCli.setVisible(true);
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
		if(ventanaElCliList.isActive()) {
			ventanaElCliList.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgElCli.isActive()) {
			dlgElCli.setVisible(false);
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
