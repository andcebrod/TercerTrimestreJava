package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
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

public class ModRec implements  WindowListener, ActionListener, TextListener{
	Frame ventanaModRec = new Frame ("Modificar recambio:");
	Label lblDescripcionRec = new Label ("Descripci�n:");
	Label lblUnidadesRec = new Label ("Unidades:");
	Label lblPrecioRec = new Label ("Precio:");
	
	
	TextField txtDescripcionRec = new TextField(10);
	TextField txtUnidadesRec = new TextField(10);
	TextField txtPrecioRec = new TextField(10);
	

	Button btnCrear = new Button("Modificar Recambio");
	Button btnLimpiar = new Button("Limpiar");
	
	Dialog dlgExitoModRec = new Dialog(ventanaModRec, "Recambio modificado");
	Label lblExito = new Label("Recambio modificado con �xito");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	
	
	public ModRec() {
		ventanaModRec.setLayout(new GridLayout(4,2));
		ventanaModRec.setLocationRelativeTo(null);
		ventanaModRec.setSize(600,300);
		
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		
		pnlPanel.add(lblDescripcionRec);
		pnlPanel.add(txtDescripcionRec);
		ventanaModRec.add(pnlPanel);
		
		pnlPanel2.add(lblUnidadesRec);
		pnlPanel2.add(txtUnidadesRec);
		ventanaModRec.add(pnlPanel2);
		
		pnlPanel3.add(lblPrecioRec);
		pnlPanel3.add(txtPrecioRec);
		ventanaModRec.add(pnlPanel3);
		
		pnlPanel4.add(btnCrear);
		btnCrear.addActionListener(this);
		pnlPanel4.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		ventanaModRec.add(pnlPanel4);
		
		ventanaModRec.addWindowListener(this);
		ventanaModRec.setVisible(true);
		
		dlgExitoModRec.setLocationRelativeTo(null);
		dlgExitoModRec.setSize(190,90);
		dlgExitoModRec.add(lblExito);
		dlgExitoModRec.addWindowListener(this);
		dlgExitoModRec.setVisible(false);
		dlgExitoModRec.setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		
	}
	@Override
	public void textValueChanged(TextEvent e) {}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if (btnCrear.equals(ae.getSource())) {
			dlgExitoModRec.setVisible(true);
		} else if (btnLimpiar.equals(ae.getSource())) {
			txtDescripcionRec.selectAll();
			txtDescripcionRec.setText("");
			txtUnidadesRec.selectAll();
			txtUnidadesRec.setText("");
			txtPrecioRec.selectAll();
			txtPrecioRec.setText("");
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowClosing(WindowEvent arg0) {
		
		if(ventanaModRec.isActive()) {
			ventanaModRec.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoModRec.isActive()) {
			dlgExitoModRec.setVisible(false);
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
