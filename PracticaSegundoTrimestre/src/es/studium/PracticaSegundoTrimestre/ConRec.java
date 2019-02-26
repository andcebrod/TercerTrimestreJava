package es.studium.PracticaSegundoTrimestre;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConRec implements WindowListener{
	Frame ventanaConRec = new Frame ("Consulta de Cliente");
	Label lblDescripcionRec = new Label ("Descripción:");
	Label lblUnidadesRec = new Label ("Unidades:");
	Label lblPrecioRec = new Label ("Precio:");


	TextField txtDescripcionRec = new TextField(10);
	TextField txtUnidadesRec = new TextField(10);
	TextField txtPrecioRec = new TextField(10);

	public ConRec() {
		ventanaConRec.setLayout(new GridLayout(5,2));
		ventanaConRec.setLocationRelativeTo(null);
		ventanaConRec.setSize(600,300);

		ventanaConRec.add(lblDescripcionRec);
		ventanaConRec.add(txtDescripcionRec);

		ventanaConRec.add(lblUnidadesRec);
		ventanaConRec.add(txtUnidadesRec);

		ventanaConRec.add(lblPrecioRec);
		ventanaConRec.add(txtPrecioRec);



		ventanaConRec.addWindowListener(this);
		ventanaConRec.setVisible(true);

	}
	public static void main(String[] args) {}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		if(ventanaConRec.isActive()) {
			ventanaConRec.setVisible(false);
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
