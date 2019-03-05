package es.studium.PracticaSegundoTrimestre;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConFac implements WindowListener{
	Frame ventanaConFac = new Frame ("Añadir Factura");
	Label lblFecha = new Label ("Fecha Factura :");
	Label lblClientes = new Label ("Cliente:");
	Label lblReparaciones = new Label ("Reparación:");
	
	TextField txtClientes = new TextField(10);
	TextField txtReparaciones = new TextField(10);
	TextField txtFecha = new TextField(10);
	
	Dialog dlgExitoAddFac = new Dialog(ventanaConFac, "Factura creada");
	Label lblExito = new Label("Factura creada con éxito");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	
	public ConFac() {
		ventanaConFac.setLayout(new GridLayout(3,1));
		ventanaConFac.setLocationRelativeTo(null);
		ventanaConFac.setSize(250,150);
		
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		
		pnlPanel.add(lblFecha);
		pnlPanel.add(txtFecha);
		ventanaConFac.add(pnlPanel);
		
		pnlPanel2.add(lblClientes);
		pnlPanel2.add(txtClientes);
		ventanaConFac.add(pnlPanel2);
		
		pnlPanel3.add(lblReparaciones);
		pnlPanel3.add(txtReparaciones);
		ventanaConFac.add(pnlPanel3);
		
		ventanaConFac.addWindowListener(this);
		ventanaConFac.setVisible(true);
		
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
		if(ventanaConFac.isActive()) {
			ventanaConFac.setVisible(false);
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


