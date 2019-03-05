package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AddFac implements WindowListener, ActionListener, TextListener	{
	
	Frame ventanaAddFac = new Frame ("Añadir Factura");
	Label lblFecha = new Label ("Fecha Factura :");
	Label lblClientes = new Label ("Cliente:");
	Label lblReparaciones = new Label ("Reparación:");
	
	Choice ListaClientes = new Choice();
	Choice ListaReparaciones = new Choice();
	TextField txtFecha = new TextField(10);
	
	Button btnCrear = new Button("Crear Factura");
	Button btnLimpiar = new Button("Limpiar");
	
	Dialog dlgExitoAddFac = new Dialog(ventanaAddFac, "Factura creada");
	Label lblExito = new Label("Factura creada con éxito");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	
	public AddFac() 
	{
		ventanaAddFac.setLayout(new GridLayout(5,2));
		ventanaAddFac.setLocationRelativeTo(null);
		ventanaAddFac.setSize(600,300);
		

		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		
		pnlPanel.add(lblFecha);
		pnlPanel.add(txtFecha);
		ventanaAddFac.add(pnlPanel);
		
		pnlPanel2.add(lblClientes);
		pnlPanel2.add(ListaClientes);
		ventanaAddFac.add(pnlPanel2);
		
		pnlPanel3.add(lblReparaciones);
		pnlPanel3.add(ListaReparaciones);
		ventanaAddFac.add(pnlPanel3);
		
		pnlPanel4.add(btnCrear);
		btnCrear.addActionListener(this);
		pnlPanel4.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		ventanaAddFac.add(pnlPanel4);
		
		ventanaAddFac.addWindowListener(this);
		ventanaAddFac.setVisible(true);
		
		dlgExitoAddFac.setLocationRelativeTo(null);
		dlgExitoAddFac.setSize(190,90);
		dlgExitoAddFac.add(lblExito);
		dlgExitoAddFac.addWindowListener(this);
		dlgExitoAddFac.setVisible(false);
		dlgExitoAddFac.setLayout(new FlowLayout());
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (btnCrear.equals(ae.getSource())) {
			dlgExitoAddFac.setVisible(true);
		} else if (btnLimpiar.equals(ae.getSource())) {
			txtFecha.selectAll();
			txtFecha.setText("");
		}
		
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
		if(ventanaAddFac.isActive()) {
			ventanaAddFac.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoAddFac.isActive()) {
			dlgExitoAddFac.setVisible(false);
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


