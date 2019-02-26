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

public class ModCli implements WindowListener, ActionListener, TextListener{
	Frame ventanaModCli = new Frame ("Modificar cliente:");
	Label lblNombreCli = new Label ("Nombre:");
	Label lblApellidosCli = new Label ("Apellidos:");
	Label lblDireccionCli = new Label ("Dirección:");
	Label lblTelefonoCli = new Label ("Teléfono:");
	
	TextField txtNombreCli = new TextField(10);
	TextField txtApellidosCli = new TextField(10);
	TextField txtDireccionCli = new TextField(10);
	TextField txtTelefonoCli = new TextField(10);

	Button btnCrear = new Button("Modificar Cliente");
	Button btnLimpiar = new Button("Limpiar");
	
	Dialog dlgExitoModCli = new Dialog(ventanaModCli, "Cliente modificado");
	Label lblExito = new Label("Cliente modificado con éxito");
	
	
	public ModCli() 
	{
		ventanaModCli.setLayout(new GridLayout(5,2));
		ventanaModCli.setLocationRelativeTo(null);
		ventanaModCli.setSize(600,300);
		
		ventanaModCli.add(lblNombreCli);
		ventanaModCli.add(txtNombreCli);
		
		ventanaModCli.add(lblApellidosCli);
		ventanaModCli.add(txtApellidosCli);
		
		ventanaModCli.add(lblDireccionCli);
		ventanaModCli.add(txtDireccionCli);
		
		ventanaModCli.add(lblTelefonoCli);
		ventanaModCli.add(txtTelefonoCli);
		
		ventanaModCli.add(btnCrear);
		btnCrear.addActionListener(this);
		ventanaModCli.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		ventanaModCli.addWindowListener(this);
		ventanaModCli.setVisible(true);
		
		dlgExitoModCli.setLocationRelativeTo(null);
		dlgExitoModCli.setSize(190,90);
		dlgExitoModCli.add(lblExito);
		dlgExitoModCli.addWindowListener(this);
		dlgExitoModCli.setVisible(false);
		dlgExitoModCli.setLayout(new FlowLayout());
	}
	public static void main(String[] args) {
		
	}
	@Override
	public void textValueChanged(TextEvent e) {}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if (btnCrear.equals(ae.getSource())) {
			dlgExitoModCli.setVisible(true);
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
		
		if(ventanaModCli.isActive()) {
			ventanaModCli.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoModCli.isActive()) {
			dlgExitoModCli.setVisible(false);
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


