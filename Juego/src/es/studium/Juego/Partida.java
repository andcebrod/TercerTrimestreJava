package es.studium.Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Partida extends JFrame implements WindowListener, ActionListener
{
	
	private static final long serialVersionUID = 1L;

	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	
	JPanel pnlVida1 = new JPanel();
	JPanel pnlPkm1 = new JPanel();
	
	JPanel pnlVida2 = new JPanel();
	JPanel pnlPkm2 = new JPanel();
	
	JPanel pnlMovimientos = new JPanel();
	JPanel pnlOpciones = new JPanel();
	
	JButton btnAtacar = new JButton ("Atacar");
	JButton btnRendirse = new JButton ("Rendirse");
	
	JButton btnSi = new JButton ("Sí");
	JButton btnNo = new JButton ("No");
	
	JButton btnAtaque1 = new JButton ("Ataque1");
	JButton btnAtaque2 = new JButton ("Ataque2");
	JButton btnAtaque3 = new JButton ("Ataque3");
	JButton btnAtaque4 = new JButton ("Ataque4");
	
	JButton btnSiguiente = new JButton ("Siguiente");
	
	JLabel lblQueHacer = new JLabel("");
	
	public Partida() 
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
