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

public class ConFacList implements WindowListener, ActionListener, TextListener{
	
	Frame ventanaConFacList = new Frame ("Buscar factura");
	Label lblBuscarFac = new Label ("Buscar id de factura:");
	TextField txtBuscarFac = new TextField(10);
	List ListaFac = new List(10, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");

	public ConFacList() 
	{
		ventanaConFacList.setLayout(new FlowLayout());
		ventanaConFacList.setLocationRelativeTo(null);
		ventanaConFacList.setSize(400,300);
		ventanaConFacList.add(lblBuscarFac);
		ventanaConFacList.add(txtBuscarFac);
		ventanaConFacList.add(btnBuscar);
		ventanaConFacList.add(ListaFac);
		ventanaConFacList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		
		ventanaConFacList.addWindowListener(this);
		ventanaConFacList.setVisible(true);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(btnSeleccionar.equals(ae.getSource())) {
			new ConFac();
		}
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		if(ventanaConFacList.isActive()) {
			ventanaConFacList.setVisible(false);
		}else {
			//System.exit(0);
		}
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


