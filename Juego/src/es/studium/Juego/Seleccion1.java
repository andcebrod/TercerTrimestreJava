package es.studium.Juego;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Seleccion1 extends JFrame implements WindowListener, ActionListener, TextListener
{
	
	private static final long serialVersionUID = 1L;
	JLabel lblSeleccionar = new JLabel("Selecciona Pokemon: ");
	JLabel lblBUscar = new JLabel("Buscar:");
	
	JTextField txtBuscar = new JTextField (10);
	JList listaPkm = new JList ();
	
	JButton btnAceptar = new JButton ("Aceptar");
	
	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	JPanel pnlcuatro = new JPanel();
	
	
	public Seleccion1() 
	{
		this.setTitle("Jugador 1");
		this.setLocationRelativeTo(null);
		this.setSize(300,250);
		this.setLayout(new GridLayout(4,1));
		
		pnluno.add(lblSeleccionar);
		this.add(pnluno);
		
		pnldos.add(lblBUscar);
		pnldos.add(txtBuscar);
		this.add(pnldos);
		
		pnltres.add(listaPkm);
		this.add(pnltres);
		
		pnlcuatro.add(btnAceptar);
		btnAceptar.addActionListener(this);
		this.add(pnlcuatro);
		
		
		this.setVisible(true);
		addWindowListener(this);
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(btnAceptar.equals(ae.getSource())) {
			new Seleccion2();
			this.setVisible(false);
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
