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

public class ConCliList implements WindowListener, ActionListener, TextListener{
	Frame ventanaConCliList = new Frame ("Buscar cliente");
	Label lblBuscarCli = new Label ("Buscar apellidos de cliente:");
	TextField txtBuscarCli = new TextField(10);
	List ListaCli = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	

	public ConCliList() {
		ventanaConCliList.setLayout(new FlowLayout());
		ventanaConCliList.setLocationRelativeTo(null);
		ventanaConCliList.setSize(400,600);
		ventanaConCliList.add(lblBuscarCli);
		ventanaConCliList.add(txtBuscarCli);
		ventanaConCliList.add(btnBuscar);
		ventanaConCliList.add(ListaCli);
		ventanaConCliList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		
		ventanaConCliList.addWindowListener(this);
		ventanaConCliList.setVisible(true);
	}
	public static void main(String[] args) {
		
	}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(btnSeleccionar.equals(ae.getSource())) {
			new ConCli();
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		if(ventanaConCliList.isActive()) {
			ventanaConCliList.setVisible(false);
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
