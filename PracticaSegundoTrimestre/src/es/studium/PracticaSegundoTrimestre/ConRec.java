package es.studium.PracticaSegundoTrimestre;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
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
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();

	public ConRec() {
		
		ventanaConRec.setLayout(new GridLayout(3,2));
		ventanaConRec.setLocationRelativeTo(null);
		ventanaConRec.setSize(600,300);
		
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		
		pnlPanel.add(lblDescripcionRec);
		pnlPanel.add(txtDescripcionRec);
		ventanaConRec.add(pnlPanel);

		pnlPanel2.add(lblUnidadesRec);
		pnlPanel2.add(txtUnidadesRec);
		ventanaConRec.add(pnlPanel2);

		pnlPanel3.add(lblPrecioRec);
		pnlPanel3.add(txtPrecioRec);
		ventanaConRec.add(pnlPanel3);
		
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
