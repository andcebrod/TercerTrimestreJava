package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.temporal.TemporalField;

public class Login implements WindowListener, ActionListener, TextListener {
	Frame ventanaLogin = new Frame ("Iniciar Sesión");
	
	Label lblIniciar = new Label("Iniciar Sesión");

	Label lblCorreo = new Label("Correo Electrónico: ");
	Label lblPass = new Label("Contraseña:             ");
	
	TextField txtPass = new TextField(20);
	TextField txtCorreo = new TextField(20);
	
	Button btnIniciar = new Button ("Iniciar Sesión");
	Button btnLimpiar = new Button ("Limpiar"); 
	
	Label lblOlvidePass = new Label ("Olvidé la contraseña");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	
	public Login() 
	{
		ventanaLogin.setLocationRelativeTo(null);
		ventanaLogin.setSize(400,200);
		ventanaLogin.setLayout(new GridLayout(5,1));
		
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		pnlPanel5.setLayout(new FlowLayout());
		

		pnlPanel.add(lblIniciar);
		ventanaLogin.add(pnlPanel);
		
		pnlPanel2.add(lblCorreo);
		pnlPanel2.add(txtCorreo);
		ventanaLogin.add(pnlPanel2);
		
		pnlPanel3.add(lblPass);
		pnlPanel3.add(txtPass);
		ventanaLogin.add(pnlPanel3);
		
		pnlPanel4.add(btnIniciar);
		pnlPanel4.add(btnLimpiar);
		ventanaLogin.add(pnlPanel4);
		
		pnlPanel5.add(lblOlvidePass);
		ventanaLogin.add(pnlPanel5);

		btnIniciar.addActionListener(this);
		btnLimpiar.addActionListener(this);
	
		ventanaLogin.addWindowListener(this);
		ventanaLogin.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Login();
	}
	@Override
	public void textValueChanged(TextEvent te) {}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(btnIniciar.equals(ae.getSource())) {
			new MenuPrincipal();
			ventanaLogin.setVisible(false);
		}
	}
	@Override
	public void windowActivated(WindowEvent we) {}

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		System.exit(0);
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
