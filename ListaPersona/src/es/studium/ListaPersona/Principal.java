package es.studium.ListaPersona;

import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Principal extends JFrame implements WindowListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar barraMenu = new JMenuBar();
	JMenu menuAnadir = new JMenu("Añadir");
	JMenu menuVisualizar = new JMenu("Visualizar");
	JMenu menuSalir = new JMenu("Salir");
	JMenu menuEliminar = new JMenu("Eliminar");
	JMenuItem mniVisualizar = new JMenuItem("Visualizar");
	JMenuItem mniSalir = new JMenuItem("Salir");
	JMenuItem mniEliminarPrimero = new JMenuItem("Eliminar primero");
	JMenuItem mniEliminarUltimo = new JMenuItem("Eliminar ultimo");
	JMenuItem mniEliminarTodos = new JMenuItem("Eliminar todos");
	JMenuItem mniEliminarPos = new JMenuItem("Eliminar por posición");
	JMenuItem mniAnadirAlFinal = new JMenuItem("Añadir al final");
	JMenuItem mniAnadirAlPrincipio = new JMenuItem("Añadir al principio");
	JMenuItem mniAnadirOtra = new JMenuItem("Añadir en otra posición");

	JButton btnAceptarPrincipio = new JButton("Aceptar");
	JButton btnAceptarFinal = new JButton("Aceptar");
	JButton btnAceptarOtra = new JButton("Aceptar");
	JButton btnCancelarPrincipio = new JButton("Cancelar");
	JButton btnCancelarFinal = new JButton("Cancelar");
	JButton btnCancelarOtra = new JButton("Cancelar");
	JButton btnAceptarElPos = new JButton("Aceptar");
	JButton btnCancelarElPos = new JButton("Cancelar");

	JTextArea txtVisualizar = new JTextArea(30,10);

	JDialog Principio = new JDialog();
	JDialog Final = new JDialog();
	JDialog Otra = new JDialog();
	JDialog Visualizar = new JDialog();
	JDialog ElPos = new JDialog();

	JLabel lblNombreP = new JLabel("Nombre:");
	JLabel lblCorreoP = new JLabel("Correo:");
	JLabel lblTelefonoP = new JLabel("Teléfono:");

	JTextField txtNombreP = new JTextField(10);
	JTextField txtCorreoP = new JTextField(10);
	JTextField txtTelefonoP = new JTextField(10);

	JLabel lblNombreF = new JLabel("Nombre:");
	JLabel lblCorreoF = new JLabel("Correo:");
	JLabel lblTelefonoF = new JLabel("Teléfono:");

	JTextField txtNombreF = new JTextField(10);
	JTextField txtCorreoF = new JTextField(10);
	JTextField txtTelefonoF = new JTextField(10);

	JLabel lblDesplegable = new JLabel("Posición:");
	JLabel lblNombreO = new JLabel("Nombre:");
	JLabel lblCorreoO = new JLabel("Correo:");
	JLabel lblTelefonoO = new JLabel("Teléfono:");
	JLabel lblVacio = new JLabel("");

	JTextField txtNombreO = new JTextField(10);
	JTextField txtCorreoO = new JTextField(10);
	JTextField txtTelefonoO = new JTextField(10);

	Choice elegir = new Choice();
	Choice elegir2 = new Choice();
	List<Persona> lista = new ArrayList<Persona>();

	Persona persona;

	Principal()
	{
		this.setSize(400,200);
		this.setTitle("Ejercicio5");
		this.setJMenuBar(barraMenu);
		barraMenu.add(menuAnadir);
		barraMenu.add(menuVisualizar);
		barraMenu.add(menuSalir);
		barraMenu.add(menuEliminar);
		menuAnadir.add(mniAnadirAlPrincipio);
		menuAnadir.add(mniAnadirAlFinal);
		menuAnadir.add(mniAnadirOtra);
		menuVisualizar.add(mniVisualizar);
		menuSalir.add(mniSalir);
		menuEliminar.add(mniEliminarPrimero);
		menuEliminar.add(mniEliminarUltimo);
		menuEliminar.add(mniEliminarTodos);
		menuEliminar.add(mniEliminarPos);
		mniAnadirAlPrincipio.addActionListener(this);
		mniAnadirAlFinal.addActionListener(this);
		mniAnadirOtra.addActionListener(this);
		mniVisualizar.addActionListener(this);
		mniSalir.addActionListener(this);
		mniEliminarPrimero.addActionListener(this);
		mniEliminarUltimo.addActionListener(this);
		mniEliminarTodos.addActionListener(this);
		mniEliminarPos.addActionListener(this);


		Principio.setSize(400,200);
		Principio.setLayout(new GridLayout(4,2));
		Principio.add(lblNombreP);
		Principio.add(txtNombreP);
		Principio.add(lblCorreoP);
		Principio.add(txtCorreoP);
		Principio.add(lblTelefonoP);
		Principio.add(txtTelefonoP);
		Principio.add(btnAceptarPrincipio);
		Principio.add(btnCancelarPrincipio);

		btnAceptarPrincipio.addActionListener(this);
		btnCancelarPrincipio.addActionListener(this);

		Visualizar.setSize(400,200);
		Visualizar.add(txtVisualizar);

		Final.setLayout(new GridLayout(4,2));
		Final.setSize(400,200);
		Final.add(lblNombreF);
		Final.add(txtNombreF);
		Final.add(lblCorreoF);
		Final.add(txtCorreoF);
		Final.add(lblTelefonoF);
		Final.add(txtTelefonoF);
		Final.add(btnAceptarFinal);
		Final.add(btnCancelarFinal);

		btnAceptarFinal.addActionListener(this);
		btnCancelarFinal.addActionListener(this);

		Otra.setLayout(new GridLayout(5,2));
		Otra.setSize(400,200);
		Otra.add(lblDesplegable);
		Iterator<Persona>iterador = lista.iterator();
		int posiciones = 0;
		elegir.removeAll();
		while (iterador.hasNext()) {
			elegir.add(posiciones+"");
			iterador.next();
			posiciones++;
		}
		Otra.add(elegir);
		Otra.add(lblNombreO);
		Otra.add(txtNombreO);
		Otra.add(lblCorreoO);
		Otra.add(txtCorreoO);
		Otra.add(lblTelefonoO);
		Otra.add(txtTelefonoO);
		Otra.add(btnAceptarOtra);
		Otra.add(btnCancelarOtra);

		ElPos.setLayout(new GridLayout(2,2));
		ElPos.setSize(400,200);
		ElPos.add(elegir2);
		ElPos.add(btnAceptarElPos);
		ElPos.add(btnCancelarElPos);

		btnAceptarOtra.addActionListener(this);
		btnCancelarOtra.addActionListener(this);

		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(mniSalir.equals(ae.getSource())) {
			System.exit(0);
		} else if(mniAnadirAlPrincipio.equals(ae.getSource())) 
		{
			Principio.setVisible(true);
		} else if(mniAnadirAlFinal.equals(ae.getSource())) 
		{
			Final.setVisible(true);
		} else if(mniAnadirOtra.equals(ae.getSource())) 
		{
			Otra.setVisible(true);
		} else if(mniVisualizar.equals(ae.getSource())) 
		{
			Iterator<Persona> iterador = lista.iterator();
			while (iterador.hasNext()) 
			{
				txtVisualizar.append(persona.mostrarPersona(iterador.next()));
				txtVisualizar.append("\n");
			}
			Visualizar.setVisible(true);
		} 
		//Añadir al Principio
		else if(btnAceptarPrincipio.equals(ae.getSource())) 
		{
			persona = new Persona(txtNombreP.getText(), txtCorreoP.getText(), Integer.parseInt(txtTelefonoP.getText()));
			lista.add(0,persona);
			System.out.println(persona.mostrarPersona(persona));
		} else if(btnCancelarPrincipio.equals(ae.getSource())) {
			txtNombreP.selectAll();
			txtNombreP.setText("");
			txtCorreoP.selectAll();
			txtCorreoP.setText("");
			txtTelefonoP.selectAll();
			txtTelefonoP.setText("");
			Principio.setVisible(false);
		}
		//Añadir al Final
		else if(btnAceptarFinal.equals(ae.getSource())) 
		{
			persona = new Persona(txtNombreF.getText(), txtCorreoF.getText(), Integer.parseInt(txtTelefonoF.getText()));
			lista.add(lista.size(),persona);
			System.out.println(persona.mostrarPersona(persona));

		} else if(btnCancelarFinal.equals(ae.getSource())) {
			txtNombreF.selectAll();
			txtNombreF.setText("");
			txtCorreoF.selectAll();
			txtCorreoF.setText("");
			txtTelefonoF.selectAll();
			txtTelefonoF.setText("");
			Final.setVisible(false);

			//Eliminar personas
		} else if(mniEliminarPrimero.equals(ae.getSource())) {
			if(!lista.isEmpty()) {
				lista.remove(0);
			}

		} else if(mniEliminarUltimo.equals(ae.getSource())) {
			if(!lista.isEmpty()) {
				lista.remove(lista.size()-1);	
			}
		} else if(mniEliminarTodos.equals(ae.getSource())) {
			if(!lista.isEmpty()) {
				lista = null;
			}
		}
		//Eliminar Posicion aelegir 
		/* else if() {

		}
		 */
		//rellenar Choice y añadir en otra pos
		else if(mniAnadirOtra.equals(ae.getSource())) {
		
			
		}

	}
	public static void main(String[] args) {
		new Principal();
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
