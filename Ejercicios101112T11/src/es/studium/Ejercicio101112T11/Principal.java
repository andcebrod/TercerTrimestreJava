package es.studium.Ejercicio101112T11;

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
	JMenu menuBorrar = new JMenu("Borrar");
	JMenu menuVisualizar = new JMenu("Visualizar");
	JMenu menuBuscar = new JMenu ("Buscar");
	
	JMenuItem mniAnadir = new JMenuItem("Añadir elemento...");
	JMenuItem mniVisualizar = new JMenuItem("Visualizar");
	JMenuItem mniBorrar = new JMenuItem("Borrar elemento...");
	JMenuItem mniBuscar = new JMenuItem("Buscar elemento...");
	
	JDialog dlgAnadir =  new JDialog();
	JDialog dlgVisualizar =  new JDialog();
	JDialog dlgBorrar =  new JDialog();
	JDialog dlgBuscar =  new JDialog();
	JDialog dlgEncontrado = new JDialog();
	
	//Elementos Añadir
	JLabel lblCodAn = new JLabel("Código:");
	JLabel lblNombreAn = new JLabel("Nombre:");
	JLabel lblEdadAn = new JLabel("Edad:");
	JTextField txtCodAn = new JTextField(10);
	JTextField txtNombreAn = new JTextField(10);
	JTextField txtEdadAn = new JTextField(10);
	JButton btnAnadir = new JButton("Añadir");
	JButton btnCancelarAnadir = new JButton("Cancelar");
	
	//Elementos Visualizar
	JTextArea txtVisualizar = new JTextArea();
	
	//Elementos Borrar
	Choice elegirBorrar = new Choice();	
	JLabel lblPosicion = new JLabel("Posición:");
	JButton btnBorrar = new JButton("Borrar");
	JButton btnCancelarBor = new JButton ("Cancelar");
	
	//Elementos Buscar
	JLabel lblCodBusc = new JLabel ("Código:");
	JLabel lblNombreBusc = new JLabel("Nombre:");
	JTextField txtCodBusc = new JTextField(10);
	JTextField txtNombreBusc = new JTextField(10);
	JButton btnBuscar = new JButton ("Buscar");
	JButton btnCancelarBus = new JButton("Cancelar");
	
	List<Elemento> lista = new ArrayList<Elemento>();
	Elemento elemento;
	
	public Principal() {
		this.setSize(400,200);
		this.setTitle("Ejercicios 10, 11 y 12");
		this.setJMenuBar(barraMenu);
		this.setLocationRelativeTo(null);
		barraMenu.add(menuAnadir);
		barraMenu.add(menuBuscar);
		barraMenu.add(menuVisualizar);
		barraMenu.add(menuBorrar);
		menuAnadir.add(mniAnadir);
		menuBuscar.add(mniBuscar);
		menuVisualizar.add(mniVisualizar);
		menuBorrar.add(mniBorrar);
		mniAnadir.addActionListener(this);
		mniBuscar.addActionListener(this);
		mniVisualizar.addActionListener(this);
		mniBorrar.addActionListener(this);
	
		
		//AÑADIR
		dlgAnadir.setLayout(new GridLayout(4,2));
		dlgAnadir.setSize(400,200);
		dlgAnadir.setLocationRelativeTo(null);
		dlgAnadir.getContentPane().add(lblCodAn);
		dlgAnadir.getContentPane().add(txtCodAn);
		dlgAnadir.getContentPane().add(lblNombreAn);
		dlgAnadir.getContentPane().add(txtNombreAn);
		dlgAnadir.getContentPane().add(lblEdadAn);
		dlgAnadir.getContentPane().add(txtEdadAn);
		dlgAnadir.getContentPane().add(btnAnadir);
		btnAnadir.addActionListener(this);
		dlgAnadir.getContentPane().add(btnCancelarAnadir);
		btnCancelarAnadir.addActionListener(this);
		
		//VISUALIZAR
		dlgVisualizar.setSize(400,200);
		dlgVisualizar.setLocationRelativeTo(null);
		dlgVisualizar.add(txtVisualizar);
		
		//BORRAR
		dlgBorrar.setLayout(new GridLayout(2,2));
		dlgBorrar.setSize(400,200);
		dlgBorrar.setLocationRelativeTo(null);
		dlgBorrar.getContentPane().add(lblPosicion);
		dlgBorrar.getContentPane().add(elegirBorrar);
		dlgBorrar.getContentPane().add(btnBorrar);
		dlgBorrar.getContentPane().add(btnCancelarBor);
		btnBorrar.addActionListener(this);
		btnCancelarBor.addActionListener(this);
		
		//Buscar
		dlgBuscar.setLayout(new GridLayout(3,2));
		dlgBuscar.setSize(400,200);
		dlgBuscar.getContentPane().add(lblCodBusc);
		dlgBuscar.getContentPane().add(txtCodBusc);
		dlgBuscar.getContentPane().add(lblNombreBusc);
		dlgBuscar.getContentPane().add(txtNombreBusc);
		dlgBuscar.getContentPane().add(btnBuscar);
		dlgBuscar.getContentPane().add(btnCancelarBus);
		btnBuscar.addActionListener(this);
		btnCancelarBus.addActionListener(this);		
		
		this.addWindowListener(this);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Principal();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(mniAnadir.equals(ae.getSource())) {
			dlgAnadir.setVisible(true);
		}else if(mniBuscar.equals(ae.getSource())) {
			dlgBuscar.setVisible(true);
		} else if(mniVisualizar.equals(ae.getSource())) {
			Iterator<Elemento> iterador = lista.iterator();
			while (iterador.hasNext()) 
			{
				txtVisualizar.append(elemento.mostrarElemento(iterador.next()));
				txtVisualizar.append("\n");
			}
			
			dlgVisualizar.setVisible(true);
		}else if(mniBorrar.equals(ae.getSource())) {
			dlgBorrar.setVisible(true);
		}
		else if(btnAnadir.equals(ae.getSource())) {
			
			String cod = txtCodAn.getText();
			String nombre = txtNombreAn.getText();
			int edad = Integer.parseInt(txtEdadAn.getText());
			
			//Comprobar que el código es único
			Iterator<Elemento> iterador = lista.iterator();
			boolean esta = false;
			while(iterador.hasNext()) {
				if(cod.equals(iterador.next().getCod())) {
					esta = true;
				}
				iterador.next();
				
			}
			
			
			elemento = new Elemento(cod, nombre, edad);
			lista.add(elemento);
			
		} else if(btnCancelarAnadir.equals(ae.getSource())) {
			txtCodAn.selectAll();
			txtCodAn.setText("");
			txtNombreAn.selectAll();
			txtNombreAn.setText("");
			txtEdadAn.selectAll();
			txtEdadAn.setText("");
			dlgAnadir.setVisible(false);
		} else if(mniVisualizar.equals(ae.getSource())) {
			
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
