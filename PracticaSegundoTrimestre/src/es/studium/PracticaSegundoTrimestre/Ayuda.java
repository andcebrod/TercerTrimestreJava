package es.studium.PracticaSegundoTrimestre;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ayuda extends Frame implements WindowListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Frame ventanaAyuda = new Frame ("Ayuda");
	Label lblAyuda = new Label("Ayuda");
	
	TextArea txtAyuda = new TextArea("", 10, 30);
	
	
	
	public Ayuda() 
	
	{
		ventanaAyuda.setLocationRelativeTo(null);
		ventanaAyuda.setSize(300,300);
		ventanaAyuda.setLayout(new FlowLayout());
		
		ventanaAyuda.add(lblAyuda);
		ventanaAyuda.add(txtAyuda);
		
		ventanaAyuda.setVisible(true);
		ventanaAyuda.addWindowListener(this);
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
		if(ventanaAyuda.isActive()) {
			ventanaAyuda.setVisible(false);
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
