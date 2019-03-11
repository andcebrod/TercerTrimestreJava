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
	
	TextArea txtAyuda = new TextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
			+"\n"+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"
			+"\n"+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
			+"\n"+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
			+"\n"+ "Excepteur sint occaecat cupidatat non proident,"
			+"\n"+ "sunt in culpa qui officia deserunt mollit anim id est laborum", 10, 90);
	
	public Ayuda() 
	
	{
		ventanaAyuda.setLocationRelativeTo(null);
		ventanaAyuda.setSize(720,300);
		ventanaAyuda.setLayout(new FlowLayout());
		
		ventanaAyuda.add(lblAyuda);
		txtAyuda.setEditable(false);
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
