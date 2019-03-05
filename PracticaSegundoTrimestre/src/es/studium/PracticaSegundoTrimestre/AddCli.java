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

	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	
	public AddCli() {
		ventanaAddCli.setLayout(new GridLayout(5,1));
		ventanaAddCli.setLocationRelativeTo(null);
		ventanaAddCli.setSize(600,300);

		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		pnlPanel5.setLayout(new FlowLayout());

		pnlPanel.add(lblNombreCli);
		pnlPanel.add(txtNombreCli);
		ventanaAddCli.add(pnlPanel);

		pnlPanel2.add(lblApellidosCli);
		pnlPanel2.add(txtApellidosCli);
		ventanaAddCli.add(pnlPanel2);

		pnlPanel3.add(lblDireccionCli);
		pnlPanel3.add(txtDireccionCli);
		ventanaAddCli.add(pnlPanel3);

		pnlPanel4.add(lblTelefonoCli);
		pnlPanel4.add(txtTelefonoCli);
		ventanaAddCli.add(pnlPanel4);

		pnlPanel5.add(btnCrear);
		btnCrear.addActionListener(this);
		pnlPanel5.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		ventanaAddCli.add(pnlPanel5);


		ventanaAddCli.addWindowListener(this);
		ventanaAddCli.setVisible(true);

		dlgExitoAddCli.setLocationRelativeTo(null);
		dlgExitoAddCli.setSize(190,90);
		dlgExitoAddCli.add(lblExito);
		dlgExitoAddCli.addWindowListener(this);
		dlgExitoAddCli.setVisible(false);
		dlgExitoAddCli.setLayout(new FlowLayout());
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
