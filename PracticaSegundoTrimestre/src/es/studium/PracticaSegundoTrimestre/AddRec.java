package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AddRec implements WindowListener, ActionListener, TextListener{

	Frame ventanaAddRec = new Frame ("Añadir Recambio");
	Label lblDescripcionRec = new Label ("Descripción:");
	Label lblUnidadesRec = new Label ("Unidades:");
	Label lblPrecioRec = new Label ("Precio:");
	
	TextField txtDescripcionRec = new TextField(10);
	TextField txtUnidadesRec = new TextField(10);
	TextField txtPrecioRec = new TextField(10);
	

	Button btnCrear = new Button("Crear Recambio");
	Button btnLimpiar = new Button("Limpiar");
	
	Dialog dlgExitoAddRec = new Dialog(ventanaAddRec, "Recambio creado");
	Label lblExito = new Label("Recambio creado con éxito");
	
	public AddRec() {
		ventanaAddRec.setLayout(new GridLayout(5,2));
		ventanaAddRec.setLocationRelativeTo(null);
		ventanaAddRec.setSize(600,300);
		
		ventanaAddRec.add(lblDescripcionRec);
		ventanaAddRec.add(txtDescripcionRec);
		
		ventanaAddRec.add(lblUnidadesRec);
		ventanaAddRec.add(txtUnidadesRec);
		
		ventanaAddRec.add(lblPrecioRec);
		ventanaAddRec.add(txtPrecioRec);
		
		ventanaAddRec.add(btnCrear);
		btnCrear.addActionListener(this);
		ventanaAddRec.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		ventanaAddRec.addWindowListener(this);
		ventanaAddRec.setVisible(true);
		
		dlgExitoAddRec.setLocationRelativeTo(null);
		dlgExitoAddRec.setSize(190,90);
		dlgExitoAddRec.add(lblExito);
		dlgExitoAddRec.addWindowListener(this);
		dlgExitoAddRec.setVisible(false);
		dlgExitoAddRec.setLayout(new FlowLayout());
	}
	
	

	public static void main(String[] args) {
		new AddRec();
	}

	@Override
	public void textValueChanged(TextEvent e) {}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if (btnCrear.equals(ae.getSource())) {
			dlgExitoAddRec.setVisible(true);
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
		
		if(ventanaAddRec.isActive()) {
			ventanaAddRec.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoAddRec.isActive()) {
			dlgExitoAddRec.setVisible(false);
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
