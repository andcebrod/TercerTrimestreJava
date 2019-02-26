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

public class ConRecList implements WindowListener, ActionListener, TextListener {
	
	Frame ventanaConRecList = new Frame ("Buscar recambio");
	Label lblBuscarRec = new Label ("Buscar descripción del recambio:");
	TextField txtBuscarRec = new TextField(10);
	List ListaRec = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	
	public ConRecList() 
	{
		ventanaConRecList.setLayout(new FlowLayout());
		ventanaConRecList.setLocationRelativeTo(null);
		ventanaConRecList.setSize(400,600);
		ventanaConRecList.add(lblBuscarRec);
		ventanaConRecList.add(txtBuscarRec);
		ventanaConRecList.add(btnBuscar);
		ventanaConRecList.add(ListaRec);
		ventanaConRecList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		
		ventanaConRecList.addWindowListener(this);
		ventanaConRecList.setVisible(true);
		
	}
	
public static void main(String[] args) {
		
		new ConRecList();
	}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(btnSeleccionar.equals(ae.getSource())) {
			new ConRec();
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		if(ventanaConRecList.isActive()) {
			ventanaConRecList.setVisible(false);
		}else {
			//System.exit(0);
		}
		
	}
		
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		
		
	}

}
