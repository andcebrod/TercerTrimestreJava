package es.studium.EjemploLogin;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EjemploLogin extends JFrame implements WindowListener, ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lblIniciar = new JLabel("Iniciar Sesión");

	String driver = "com.mysql.jdbc.Driver";
	String url ="jdbc:mysql://localhost:3306/login?autoReconnect=true&useSSL=false";
	String login = "remoto";
	String password = "Studium2018";
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	
	
	
	JLabel lblUsuarios = new JLabel("Usuario:     ");
	JLabel lblPass = new JLabel("Contraseña:");

	JPasswordField txtPass = new JPasswordField(15);
	JTextField txtUsuarios = new JTextField(15);

	JButton btnIniciar = new JButton ("Iniciar Sesión");
	JButton btnLimpiar = new JButton ("Limpiar");

	JPanel pnlPanel = new JPanel();
	JPanel pnlPanel2 = new JPanel();
	JPanel pnlPanel3 = new JPanel();
	JPanel pnlPanel4 = new JPanel();

	public EjemploLogin() 
	{
		this.setLocationRelativeTo(null);
		this.setSize(400,200);
		this.setLayout(new GridLayout(4,1));

		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());

		pnlPanel.add(lblIniciar);
		this.add(pnlPanel);

		pnlPanel2.add(lblUsuarios);
		pnlPanel2.add(txtUsuarios);
		this.add(pnlPanel2);

		pnlPanel3.add(lblPass);
		pnlPanel3.add(txtPass);
		this.add(pnlPanel3);

		pnlPanel4.add(btnIniciar);
		btnIniciar.addActionListener(this);
		pnlPanel4.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		this.add(pnlPanel4);

		this.addWindowListener(this);
		this.setVisible(true);

	}
	public static void main(String[] args) {
		new EjemploLogin();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		if(btnIniciar.equals(ae.getSource())) 
		{
			try
			{
				Class.forName(driver);
				String sentencia = "SELECT * FROM usuarios where nombreUsuario ='"+txtUsuarios.getText()+"' AND claveUsuario = MD5('"+txtPass.getText()+"');";
				connection = DriverManager.getConnection(url, login,password);
				statement =connection.createStatement();
				rs=statement.executeQuery(sentencia);
				if(rs.next()) 
				{
					JOptionPane.showMessageDialog(null,"Login Correcto","Login correcto", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña erroneos","Error al iniciar sesión", JOptionPane.ERROR_MESSAGE);
				}
			}
			catch (ClassNotFoundException cnfe)
			{
				System.out.println("Error 1: "+cnfe.getMessage());
			}
			catch (SQLException sqle)
			{
				System.out.println("Error 2: "+sqle.getMessage());
			}
			finally
			{
				try
				{
					if(connection!=null)
					{
						connection.close();
					}
				}
				catch (SQLException e)
				{
					System.out.println("Error 3: "+e.getMessage());
				}
			}

		} else if (btnLimpiar.equals(ae.getSource())) 
		{
			txtUsuarios.selectAll();
			txtUsuarios.setText("");
			txtPass.selectAll();
			txtPass.setText("");
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
		// TODO Auto-generated method stub
		System.exit(0);
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
