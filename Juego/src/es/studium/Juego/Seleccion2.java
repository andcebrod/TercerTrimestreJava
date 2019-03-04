package es.studium.Juego;

import java.awt.GridLayout;
import java.awt.List;
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

public class Seleccion2 extends JFrame implements WindowListener, ActionListener, TextListener{

	private static final long serialVersionUID = 1L;
	JLabel lblSeleccionar = new JLabel("Selecciona Pokemon: ");
	JLabel lblBUscar = new JLabel("Buscar:");
	
	JTextField txtBuscar = new JTextField (10);
	List listaPkm = new List (4,true);
	
	JButton btnAceptar = new JButton ("Aceptar");
	
	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	JPanel pnlcuatro = new JPanel();
	
	String Pkm1 = "Pepito";
	String Pkm2 = "Pepito";
	String Pkm3 = "Pepito";
	String Pkm4 = "Pepito";
	String Pkm5 = "Pepito";
	String Pkm6 = "Pepito";
	String Pkm7 = "Pepito";
	
	public Seleccion2() 
	{
		this.setTitle("Jugador 2");
		this.setLocationRelativeTo(null);
		this.setSize(300,250);
		this.setLayout(new GridLayout(4,1));
		
		listaPkm.add(Pkm1);
		listaPkm.add(Pkm2);
		listaPkm.add(Pkm3);
		listaPkm.add(Pkm4);
		listaPkm.add(Pkm5);
		listaPkm.add(Pkm6);
		listaPkm.add(Pkm7);
		
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
			new Partida();
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
