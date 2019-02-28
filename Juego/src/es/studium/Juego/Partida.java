package es.studium.Juego;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Partida extends JFrame implements WindowListener, ActionListener
{
	
	private static final long serialVersionUID = 1L;

	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	
	JPanel pnlVida1 = new JPanel();
	Border bordejpanel = new TitledBorder(new EtchedBorder());
	JPanel pnlPkm1 = new JPanel();
	
	JPanel pnlVida2 = new JPanel();
	JPanel pnlPkm2 = new JPanel();
	
	JPanel pnlMovimientos = new JPanel();
	JPanel pnlOpciones = new JPanel();
	
	JLabel lblVida1 = new JLabel("PS: ");
	JLabel lblVida2 = new JLabel("PS: ");
	JLabel lblPkm1 = new JLabel("Charizard");
	JLabel lblPkm2 = new JLabel("Blastoise");
	
	JProgressBar PBvida1 = new JProgressBar(0, 100);
	JProgressBar PBvida2 = new JProgressBar(0, 100);
	
	JButton btnAtacar = new JButton ("Atacar");
	JButton btnRendirse = new JButton ("Rendirse");
	
	JButton btnSi = new JButton ("Sí");
	JButton btnNo = new JButton ("No");
	
	JButton btnAtaque1 = new JButton ("Ataque1");
	JButton btnAtaque2 = new JButton ("Ataque2");
	JButton btnAtaque3 = new JButton ("Ataque3");
	JButton btnAtaque4 = new JButton ("Ataque4");
	
	JButton btnSiguiente = new JButton ("Siguiente");
	
	JLabel lblQueHacer = new JLabel("¿Qué quieres hacer?");
	
	JLabel lblAtaque = new JLabel("Blastoise usó Hidropulso. ");
	JLabel lblDanio = new JLabel("Charizard pierde 30 PS.");
	
	public Partida() 
	{
		
		this.setTitle("Batalla");
		this.setLayout(new GridLayout(3,1));
		this.setSize(500, 300);
		
		PBvida1.setValue(100);
		pnlVida1.setLayout(new FlowLayout());
		pnlVida1.setBorder(bordejpanel);
		pnlVida1.add(lblPkm1);
		pnlVida1.add(lblVida1);
		pnlVida1.add(PBvida1);
		pnluno.add(pnlVida1);
		pnluno.add(pnlPkm1);
		this.add(pnluno);
		
		PBvida1.setValue(100);
		pnlVida2.setLayout(new FlowLayout());
		pnlVida2.setBorder(bordejpanel);
		pnlVida2.add(lblPkm2);
		pnlVida2.add(lblVida2);
		pnlVida2.add(PBvida2);
		pnldos.add(pnlVida2);
		pnldos.add(pnlPkm2);
		this.add(pnldos);
		
		pnlMovimientos.setLayout(new GridLayout(2,2));
		pnlMovimientos.setBorder(bordejpanel);
		pnlMovimientos.add(btnAtaque1);
		pnlMovimientos.add(btnAtaque2);
		pnlMovimientos.add(btnAtaque3);
		pnlMovimientos.add(btnAtaque4);
		pnltres.add(pnlMovimientos);
		
		pnlOpciones.setLayout(new GridLayout(2,1));
		pnlOpciones.setBorder(bordejpanel);
		pnlOpciones.add(btnAtacar);
		pnlOpciones.add(btnRendirse);
		pnltres.add(pnlOpciones);
		this.add(pnltres);
		
		this.addWindowListener(this);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Partida();
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
		System.exit(0);
		
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
