package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
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

public class ModRecList implements WindowListener, ActionListener, TextListener{
	
	Frame ventanaModRecList = new Frame ("Buscar recambio para modificar");
	Label lblBuscarRec = new Label ("Buscar descripción de recambio:");
	TextField txtBuscarRec = new TextField(10);
	List ListaCli = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	

	public ModRecList() {
		ventanaModRecList.setLayout(new FlowLayout());
		ventanaModRecList.setLocationRelativeTo(null);
		ventanaModRecList.setSize(400,600);
		ventanaModRecList.add(lblBuscarRec);
		ventanaModRecList.add(txtBuscarRec);
		ventanaModRecList.add(btnBuscar);
		ventanaModRecList.add(ListaCli);
		ventanaModRecList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		
		ventanaModRecList.addWindowListener(this);
		ventanaModRecList.setVisible(true);
	}
	public static void main(String[] args) {}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(btnSeleccionar.equals(ae.getSource())) {
			new ModRec();
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		if(ventanaModRecList.isActive()) {
			ventanaModRecList.setVisible(false);
		}else {
			//System.exit(0);
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
