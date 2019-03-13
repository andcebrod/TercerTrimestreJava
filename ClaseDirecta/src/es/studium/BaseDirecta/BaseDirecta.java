package es.studium.BaseDirecta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BaseDirecta
{
	public static void main(String[] args)
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/empresa?autoReconnect=true&useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		Connection connection = null;
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
			connection = DriverManager.getConnection(url, login, password);
		}
		catch(SQLException e)
		{
			System.out.println("Se produjo un error al conectar a la Base de Datos");
		}
		try
		{
			//Crear una sentencia version 2.0 actualizable
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// Crear un objeto ResultSet y realizar la sentencia SQL
			ResultSet rs = statement.executeQuery("SELECT * FROM empleados");
			// Colocar el cursor en una posición válida
			rs.next();
			// Ahora insertar un registro nuevo
			// Primero mover el cursor a un nuevo sitio
			rs.moveToInsertRow();
			// Asignar un valor al campo nombreEmpleado
			rs.updateString("nombreEmpleado","Zósimo");
			// Llamar al método insertRow, para insertar este nuevo registro simultáneamente en la BD y en el ResultSet.
			rs.insertRow();
			// Dar OK para informar al usuario de que el Alta se ha realizado correctamente
			System.out.println("Alta correcta!");
			//Cerrar los objetos creados
			rs.close();
			statement.close();
			connection.close();
		}
		catch(SQLException sqle)
		{
			System.out.println("Error:"+sqle.toString());
		}
	}
}