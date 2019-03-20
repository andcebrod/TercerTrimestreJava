package es.studium.basededatos;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BaseDeDatos extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	TextField idEmpleado = new TextField(20);
	TextField nombreEmpleado = new TextField(20);
	Button next = new Button("Próximo");
	Button previous = new Button("Anterior");
	String driver = "com.mysql.jdbc.Driver";
	String url ="jdbc:mysql://localhost:3306/empresa?autoReconnect=true&useSSL=false";
	String login = "andres";
	String password = "Studium2018;";
	String sentencia = "SELECT * FROM empleados";
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	public BaseDeDatos()
	{
		setLayout(new FlowLayout());
		setSize(200,200);
		setResizable(false);
		add(idEmpleado);
		add(nombreEmpleado);
		add(previous);
		add(next);
		previous.addActionListener(this);
		next.addActionListener(this);
		addWindowListener(this);
		//Cargar el Driver
		try
		{
			Class.forName(driver);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Se ha producido un error al cargar el Driver");
		}
		//Establecer la conexión con la base de datos
		try
		{
			connection = DriverManager.getConnection(url, login,password);
		}
		catch(SQLException e)
		{
			System.out.println("Se produjo un error al conectar a la Base de Datos");
		}
		//Preparar el statement
		try
		{
			statement =connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			connection = DriverManager.getConnection(url, login,password);
			rs=statement.executeQuery(sentencia);
			rs.next();
			//Poner en los TextField los valores obtenidos del 1º
			idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
			nombreEmpleado.setText(rs.getString("nombreEmpleado"));
		}
		catch(SQLException e)
		{
			System.out.println("Error en la sentencia SQL");
		}
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new BaseDeDatos();
	}
	public void windowActivated(WindowEvent windowEvent){}
	public void windowClosed(WindowEvent windowEvent) {}
	public void windowClosing(WindowEvent windowEvent)
	{
		//cerrar los elementos de la base de datos
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
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent windowEvent) {}
	public void windowDeiconified(WindowEvent windowEvent) {}
	public void windowIconified(WindowEvent windowEvent) {}
	public void windowOpened(WindowEvent windowEvent) {}
	public void actionPerformed(ActionEvent actionEvent)
	{
		// Hemos pulsado Próximo
		if(next.equals(actionEvent.getSource()))
		{
			try
			{
				//Si no hemos llegado al final
				if(rs.next())
				{
					//Poner en los TextField los valores obtenidos
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				}
				//Al hacer rs.next, nos hemos salido de la lista de resultados
				else
				{
					// Volvemos al anterior, o sea al último y lo mostramos
					rs.previous();
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")))
					;
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				}
			}
			catch(SQLException e)
			{
				System.out.println("Error en la sentencia SQL"+e.getMessage());
			}
		}
		else
		{
			try
			{
				//Si no hemos llegado al principio
				if(rs.previous())
				{
					//Poner en los TextField los valores obtenidos
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				}
				//Al hacer rs.previous, nos hemos salido de la lista de resultados
				else
				{
					// Volvemos al siguiente, o sea al primero y lo mostramos
					rs.next();
					idEmpleado.setText(Integer.toString(rs.getInt("idEmpleado")));
					nombreEmpleado.setText(rs.getString("nombreEmpleado"));
				}
			}
			catch(SQLException e)
			{
				System.out.println("Error en la sentencia SQL"+e.getMessage());
			}
		}
	}
}