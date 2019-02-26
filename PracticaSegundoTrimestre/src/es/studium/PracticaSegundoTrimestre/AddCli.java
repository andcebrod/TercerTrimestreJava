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

public class AddCli  implements WindowListener, ActionListener, TextListener{
	Frame ventanaAddCli = new Frame ("Añadir Cliente");
	Label lblNombreCli = new Label ("Nombre:");
	Label lblApellidosCli = new Label ("Apellidos:");
	Label lblDireccionCli = new Label ("Dirección:");
	Label lblTelefonoCli = new Label ("Teléfono:");
	
	TextField txtNombreCli = new TextField(10);
	TextField txtApellidosCli = new TextField(10);
	TextField txtDireccionCli = new TextField(10);
	TextField txtTelefonoCli = new TextField(10);

	Button btnCrear = new Button("Crear Cliente");
	Button btnLimpiar = new Button("Limpiar");
	
	Dialog dlgExitoAddCli = new Dialog(ventanaAddCli, "Cliente creado");
	Label lblExito = new Label("Cliente creado con éxito");
	
	public AddCli() {
		ventanaAddCli.setLayout(new GridLayout(5,2));
		ventanaAddCli.setLocationRelativeTo(null);
		ventanaAddCli.setSize(600,300);
		
		ventanaAddCli.add(lblNombreCli);
		ventanaAddCli.add(txtNombreCli);
		
		ventanaAddCli.add(lblApellidosCli);
		ventanaAddCli.add(txtApellidosCli);
		
		ventanaAddCli.add(lblDireccionCli);
		ventanaAddCli.add(txtDireccionCli);
		
		ventanaAddCli.add(lblTelefonoCli);
		ventanaAddCli.add(txtTelefonoCli);
		
		ventanaAddCli.add(btnCrear);
		btnCrear.addActionListener(this);
		ventanaAddCli.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		ventanaAddCli.addWindowListener(this);
		ventanaAddCli.setVisible(true);
		
		dlgExitoAddCli.setLocationRelativeTo(null);
		dlgExitoAddCli.setSize(190,90);
		dlgExitoAddCli.add(lblExito);
		dlgExitoAddCli.addWindowListener(this);
		dlgExitoAddCli.setVisible(false);
		dlgExitoAddCli.setLayout(new FlowLayout());
	}
	
	

	public static void main(String[] args) {
		
	}

	@Override
	public void textValueChanged(TextEvent e) {}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if (btnCrear.equals(ae.getSource())) {
			dlgExitoAddCli.setVisible(true);
		} else if (btnLimpiar.equals(ae.getSource())) {
			txtNombreCli.selectAll();
			txtNombreCli.setText("");
			txtApellidosCli.selectAll();
			txtApellidosCli.setText("");
			txtDireccionCli.selectAll();
			txtDireccionCli.setText("");
			txtTelefonoCli.selectAll();
			txtTelefonoCli.setText("");
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowClosing(WindowEvent arg0) {
		
		if(ventanaAddCli.isActive()) {
			ventanaAddCli.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoAddCli.isActive()) {
			dlgExitoAddCli.setVisible(false);
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
