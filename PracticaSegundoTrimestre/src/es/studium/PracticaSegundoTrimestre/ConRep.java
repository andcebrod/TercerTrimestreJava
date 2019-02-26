package es.studium.PracticaSegundoTrimestre;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConRep implements WindowListener{

	Frame ventanaConRep = new Frame ("Consulta de Reparación");
	Label lblAveriaRep = new Label ("Avería:");
	Label lblFechaEntradaRep = new Label ("Fecha de Entrada:");
	Label lblFechaSalidaRep = new Label ("Fecha de Salida:");
	Label lblReparadoRep = new Label ("Reparado:");


	TextField txtAveriaRep = new TextField(10);
	TextField txtFechaEntradaRep = new TextField(10);
	TextField txtFechaSalidaRep = new TextField(10);
	public ConRep() 
	{
		ventanaConRep.setLayout(new GridLayout(5,2));
		ventanaConRep.setLocationRelativeTo(null);
		ventanaConRep.setSize(600,300);
		ventanaConRep.add(lblAveriaRep);
		ventanaConRep.add(txtAveriaRep);

		ventanaConRep.add(lblFechaEntradaRep);
		ventanaConRep.add(txtFechaEntradaRep);

		ventanaConRep.add(lblFechaSalidaRep);
		ventanaConRep.add(txtFechaSalidaRep);
		ventanaConRep.addWindowListener(this);
		ventanaConRep.setVisible(true);
	}
	public static void main(String[] args) {}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		if(ventanaConRep.isActive()) {
			ventanaConRep.setVisible(false);
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
