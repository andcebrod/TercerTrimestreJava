package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConCli implements WindowListener{

	Frame ventanaConCli = new Frame ("Consulta de Cliente");
	Label lblNombreCli = new Label ("Nombre:");
	Label lblApellidosCli = new Label ("Apellidos:");
	Label lblDireccionCli = new Label ("Dirección:");
	Label lblTelefonoCli = new Label ("Teléfono:");

	TextField txtNombreCli = new TextField(15);
	TextField txtApellidosCli = new TextField(15);
	TextField txtDireccionCli = new TextField(15);
	TextField txtTelefonoCli = new TextField(15);
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();

	public ConCli() {
		ventanaConCli.setLayout(new GridLayout(4,2));
		ventanaConCli.setLocationRelativeTo(null);
		ventanaConCli.setSize(300,180);
		
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());

		pnlPanel.add(lblNombreCli);
		pnlPanel.add(txtNombreCli);
		ventanaConCli.add(pnlPanel);

		pnlPanel2.add(lblApellidosCli);
		pnlPanel2.add(txtApellidosCli);
		ventanaConCli.add(pnlPanel2);

		pnlPanel3.add(lblDireccionCli);
		pnlPanel3.add(txtDireccionCli);
		ventanaConCli.add(pnlPanel3);

		pnlPanel4.add(lblTelefonoCli);
		pnlPanel4.add(txtTelefonoCli);
		ventanaConCli.add(pnlPanel4);


		ventanaConCli.addWindowListener(this);
		ventanaConCli.setVisible(true);

	}

	public static void main(String[] args) {
		new ConCli();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) {
		if(ventanaConCli.isActive()) {
			ventanaConCli.setVisible(false);
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
