package es.studium.FormularioInsert;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioInsert extends JFrame implements WindowListener, ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String driver = "com.mysql.jdbc.Driver";
	String url ="jdbc:mysql://localhost:3306/empresa?autoReconnect=true&useSSL=false";
	String login = "root";
	String password = "Studium2018;";
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	
	
	JLabel txtNombre = new JLabel("Nombre:");
	JLabel txtId = new JLabel("Id:");
	JLabel txtIdDepartamento = new JLabel("idDepartamento:");
	JLabel txtExtension = new JLabel("Extensión:");
	JLabel txtFechaNacimiento = new JLabel("Fecha de nacimiento:");
	JLabel txtSalario = new JLabel("Salario:");
	JLabel txtComision = new JLabel("Comisión:");
	JLabel txtHijos = new JLabel("Hijos:");
	
	JTextField tfNombre = new JTextField(25);
	JTextField tfid = new JTextField(25);
	JTextField tfidDepartamento = new JTextField(25);
	JTextField tfExtension = new JTextField(25);
	JTextField tfFechaNacimiento = new JTextField(25);
	JTextField tfSalario = new JTextField(25);
	JTextField tfComision = new JTextField(25);
	JTextField tfHijos = new JTextField(25);
	
	JPanel pnl = new JPanel();
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	JPanel pnl4 = new JPanel();
	JPanel pnl5 = new JPanel();
	JPanel pnl6 = new JPanel();
	JPanel pnl7 = new JPanel();
	JPanel pnl8 = new JPanel();	
	
	JButton btnAceptar = new JButton("Aceptar");
	
	public FormularioInsert() {
		
		
		this.setLocationRelativeTo(null);
		this.setSize(600,350);
		this.setLayout(new GridLayout(9,1));
		
		pnl.add(txtNombre);
		pnl.add(tfNombre);
		
		pnl1.add(txtId);
		pnl1.add(tfid);
		
		pnl2.add(txtIdDepartamento);
		pnl2.add(tfidDepartamento);
		
		pnl3.add(txtExtension);
		pnl3.add(tfExtension);
		
		pnl4.add(txtFechaNacimiento);
		pnl4.add(tfFechaNacimiento);
		
		pnl5.add(txtSalario);
		pnl5.add(tfSalario);
		
		pnl6.add(txtComision);
		pnl6.add(tfComision);
		
		pnl7.add(txtHijos);
		pnl7.add(tfHijos);
		
		pnl8.add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		pnl.setLayout(new FlowLayout());
		pnl1.setLayout(new FlowLayout());
		pnl2.setLayout(new FlowLayout());
		pnl3.setLayout(new FlowLayout());
		pnl4.setLayout(new FlowLayout());
		pnl5.setLayout(new FlowLayout());
		pnl6.setLayout(new FlowLayout());
		pnl7.setLayout(new FlowLayout());
		pnl8.setLayout(new FlowLayout());
		
		this.add(pnl);
		this.add(pnl1);
		this.add(pnl2);
		this.add(pnl3);
		this.add(pnl4);
		this.add(pnl5);
		this.add(pnl6);
		this.add(pnl7);
		this.add(pnl8);
		
		this.addWindowListener(this);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FormularioInsert();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(btnAceptar.equals(ae.getSource())) 
		{
			tfNombre.selectAll();
			String Nombre = tfNombre.getText();
			tfid.selectAll();
			String id = tfid.getText();
			
			tfidDepartamento.selectAll();
			String idDepartamento = tfidDepartamento.getText();
			tfExtension.selectAll();
			String Extension = tfExtension.getText();
			
			tfFechaNacimiento.selectAll();
			String FechaNacimiento = tfFechaNacimiento.getText();
			
			tfSalario.selectAll();
			String Salario = tfSalario.getText();
			
			tfComision.selectAll();
			String Comision = tfComision.getText();
			
			tfHijos.selectAll();
			String Hijos = tfHijos.getText();
			Calendar horaFecha = Calendar.getInstance();
			int dia,mes,anyo;
			dia = horaFecha.get(Calendar.DAY_OF_MONTH);
			mes = horaFecha.get(Calendar.MONTH)+1;
			anyo = horaFecha.get(Calendar.YEAR);
			
			
			
			String FechaIngreso=anyo+"-"+mes+"-"+dia;
			
			try
			{
				Class.forName(driver);
				String sentencia = "INSERT INTO empleados values("+id+
						","+idDepartamento+
						","+Extension+
						",'"+FechaNacimiento+
						"','"+FechaIngreso+
						"',"+Salario+
						","+Comision+
						","+Hijos+
						",'"+Nombre+"')";
				
				System.out.println(sentencia);
				connection = DriverManager.getConnection(url, login,password);
				statement =connection.createStatement();
				statement.executeUpdate(sentencia);
				JOptionPane.showMessageDialog(null,"Empleado creado","Empleado Creado", JOptionPane.INFORMATION_MESSAGE);
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
		try
		{
			rs.close();
			statement.close();
			connection.close();
		}
		catch(SQLException e)
		{
			System.out.println("error al cerrar "+e.toString());
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
