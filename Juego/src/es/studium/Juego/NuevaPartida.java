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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NuevaPartida extends JFrame implements WindowListener, ActionListener, TextListener {

	private static final long serialVersionUID = 1L;
	JLabel lblJugadores = new JLabel("Introduce el nombre de los Jugadores: ");
	JLabel lblJugador1 = new JLabel("Jugador 1:");
	JLabel lblJugador2 = new JLabel("Jugador 2:");
	
	JTextField txtJugador1 = new JTextField (10);
	JTextField txtJugador2 = new JTextField (10);
	
	JButton btnSiguiente = new JButton ("Siguiente");
	
	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	JPanel pnlcuatro = new JPanel();
	
	public NuevaPartida() {
		
		this.setTitle("Nueva Partida");
		setLocationRelativeTo(null);
		this.setSize(300,250);
		setLayout(new GridLayout(4,1));
		
		pnluno.add(lblJugadores);
		this.add(pnluno);
		
		pnldos.add(lblJugador1);
		pnldos.add(txtJugador1);
		this.add(pnldos);
		
		pnltres.add(lblJugador2);
		pnltres.add(txtJugador2);
		this.add(pnltres);
		
		pnlcuatro.add(btnSiguiente);
		btnSiguiente.addActionListener(this);
		this.add(pnlcuatro);
		
		this.setVisible(true);
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(btnSiguiente.equals(ae.getSource())) 
		{
			new Seleccion1();
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

	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
