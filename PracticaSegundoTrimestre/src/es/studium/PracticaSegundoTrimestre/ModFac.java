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

public class ModFac implements WindowListener, ActionListener, TextListener{
	
	Frame ventanaModFac = new Frame ("Modificar Factura:");
	Label lblFecha = new Label ("Fecha Factura :");
	Label lblClientes = new Label ("Cliente:");
	Label lblReparaciones = new Label ("Reparación:");
	
	Choice ListaClientes = new Choice();
	Choice ListaReparaciones = new Choice();
	TextField txtFecha = new TextField(10);
	

	Button btnModificar = new Button("Modificar Factura");
	Button btnLimpiar = new Button("Limpiar");
	
	Dialog dlgExitoModFac = new Dialog(ventanaModFac, "Factura modificada");
	Label lblExito = new Label("Factura modificada con éxito");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	
	public ModFac() 
	{
		ventanaModFac.setLayout(new GridLayout(5,2));
		ventanaModFac.setLocationRelativeTo(null);
		ventanaModFac.setSize(600,300);
		
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		

		pnlPanel.add(lblFecha);
		pnlPanel.add(txtFecha);
		ventanaModFac.add(pnlPanel);
		
		pnlPanel2.add(lblClientes);
		pnlPanel2.add(ListaClientes);
		ventanaModFac.add(pnlPanel2);
		
		pnlPanel3.add(lblReparaciones);
		pnlPanel3.add(ListaReparaciones);
		ventanaModFac.add(pnlPanel3);
		
		pnlPanel4.add(btnModificar);
		btnModificar.addActionListener(this);
		pnlPanel4.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		ventanaModFac.add(pnlPanel4);
		
		ventanaModFac.addWindowListener(this);
		ventanaModFac.setVisible(true);
		
		dlgExitoModFac.setLocationRelativeTo(null);
		dlgExitoModFac.setSize(190,90);
		dlgExitoModFac.add(lblExito);
		dlgExitoModFac.addWindowListener(this);
		dlgExitoModFac.setVisible(false);
		dlgExitoModFac.setLayout(new FlowLayout());
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (btnModificar.equals(ae.getSource())) {
			dlgExitoModFac.setVisible(true);
		} else if (btnLimpiar.equals(ae.getSource())) {
			txtFecha.selectAll();
			txtFecha.setText("");
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
		if(ventanaModFac.isActive()) {
			ventanaModFac.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoModFac.isActive()) {
			dlgExitoModFac.setVisible(false);
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
