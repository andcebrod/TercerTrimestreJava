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

public class ModFacList implements WindowListener, ActionListener, TextListener {
	
	Frame ventanaModFacList = new Frame ("Buscar factura para modificar");
	Label lblBuscarCli = new Label ("Buscar id de Factura:");
	TextField txtBuscarCli = new TextField(3);
	List ListaCli = new List(10, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");
	
	public ModFacList ()
	{
		ventanaModFacList.setLayout(new FlowLayout());
		ventanaModFacList.setLocationRelativeTo(null);
		ventanaModFacList.setSize(400,300);
		ventanaModFacList.add(lblBuscarCli);
		ventanaModFacList.add(txtBuscarCli);
		ventanaModFacList.add(btnBuscar);
		ventanaModFacList.add(ListaCli);
		ventanaModFacList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);
		
		ventanaModFacList.addWindowListener(this);
		ventanaModFacList.setVisible(true);
	}

	@Override
	public void textValueChanged(TextEvent te) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(btnSeleccionar.equals(ae.getSource())) {
			new ModFac();
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
		if(ventanaModFacList.isActive()) {
			ventanaModFacList.setVisible(false);
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
