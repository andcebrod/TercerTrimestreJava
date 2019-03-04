package es.studium.Juego;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
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

	int turno = 1;

	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	JPanel pnlcuatro = new JPanel();

	Border bordejpanel = new TitledBorder(new EtchedBorder());

	JPanel pnlVida1 = new JPanel();
	JPanel pnlPkm1 = new JPanel();

	JPanel pnlVida2 = new JPanel();
	JPanel pnlPkm2 = new JPanel();

	JPanel pnlMovimientos = new JPanel();
	JPanel pnlMovimientosJ1 = new JPanel();
	JPanel pnlMovimientosJ2 = new JPanel();

	JPanel pnlOpciones = new JPanel();

	JPanel pnlTranscurso = new JPanel();

	JLabel lblQueHacer = new JLabel("¿Qué quieres hacer?");
	JLabel lblAtaque = new JLabel("Blastoise usó Hidropulso. ");
	JLabel lblDanio = new JLabel("Charizard pierde 30 PS.");

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

	JButton btnAtaque1J1 = new JButton ("Ataque1 J1");
	JButton btnAtaque2J1 = new JButton ("Ataque2 J1");
	JButton btnAtaque3J1 = new JButton ("Ataque3 J1");
	JButton btnAtaque4J1 = new JButton ("Ataque4 J1");

	JButton btnAtaque1J2 = new JButton ("Ataque1 J2");
	JButton btnAtaque2J2 = new JButton ("Ataque2 J2");
	JButton btnAtaque3J2 = new JButton ("Ataque3 J2");
	JButton btnAtaque4J2 = new JButton ("Ataque4 J2");

	JButton btnSiguiente = new JButton ("Siguiente");



	JDialog dlgRendirse = new JDialog();
	JDialog dlgFin = new JDialog();

	JLabel lblRendirse = new JLabel("¿Está seguro de rendirte?");
	JLabel lblFin = new JLabel("Fin de la Partida, jugador 1 gana");
	public Partida() 
	{

		this.setTitle("Batalla");
		this.setLayout(new GridLayout(4,1));
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);

		PBvida1.setValue(100);
		pnlVida1.setLayout(new FlowLayout());
		pnlVida1.setBorder(bordejpanel);
		pnlVida1.add(lblPkm1);
		pnlVida1.add(lblVida1);
		pnlVida1.add(PBvida1);
		pnluno.add(pnlVida1);
		pnluno.add(pnlPkm1);
		this.add(pnluno);

		PBvida2.setValue(100);
		pnlVida2.setLayout(new FlowLayout());
		pnlVida2.setBorder(bordejpanel);
		pnlVida2.add(lblPkm2);
		pnlVida2.add(lblVida2);
		pnlVida2.add(PBvida2);
		pnldos.add(pnlVida2);
		pnldos.add(pnlPkm2);
		this.add(pnldos);

		pnlMovimientos.setVisible(false);
		pnlMovimientos.setLayout(new FlowLayout());
		pnlMovimientos.setBorder(bordejpanel);
		pnlMovimientosJ1.setLayout(new GridLayout(2,2));
		pnlMovimientosJ1.add(btnAtaque1J1);
		btnAtaque1J1.addActionListener(this);
		pnlMovimientosJ1.add(btnAtaque2J1);
		btnAtaque2J1.addActionListener(this);
		pnlMovimientosJ1.add(btnAtaque3J1);
		btnAtaque3J1.addActionListener(this);
		pnlMovimientosJ1.add(btnAtaque4J1);
		btnAtaque4J1.addActionListener(this);

		pnlMovimientosJ2.setLayout(new GridLayout(2,2));
		pnlMovimientosJ2.add(btnAtaque1J2);
		btnAtaque1J2.addActionListener(this);
		pnlMovimientosJ2.add(btnAtaque2J2);
		btnAtaque2J2.addActionListener(this);
		pnlMovimientosJ2.add(btnAtaque3J2);
		btnAtaque3J2.addActionListener(this);
		pnlMovimientosJ2.add(btnAtaque4J2);
		btnAtaque4J2.addActionListener(this);


		pnltres.add(pnlMovimientos);

		pnlOpciones.setLayout(new GridLayout(2,1));
		pnlOpciones.setBorder(bordejpanel);
		pnlOpciones.add(btnAtacar);
		btnAtacar.addActionListener(this);
		pnlOpciones.add(btnRendirse);
		btnRendirse.addActionListener(this);
		pnltres.add(pnlOpciones);
		this.add(pnltres);

		pnlTranscurso.setLayout(new FlowLayout());
		pnlTranscurso.setBorder(bordejpanel);
		pnlTranscurso.add(lblQueHacer);
		pnlcuatro.add(pnlTranscurso);
		this.add(pnlcuatro);


		dlgRendirse.setSize(200,100);
		dlgRendirse.setTitle("Rendirse");
		dlgRendirse.setLayout(new FlowLayout());
		dlgRendirse.add(lblRendirse);
		dlgRendirse.add(btnSi);
		btnSi.addActionListener(this);
		dlgRendirse.add(btnNo);
		btnNo.addActionListener(this);
		dlgRendirse.setLocationRelativeTo(null);

		dlgFin.setSize(200,100);
		dlgFin.setTitle("Fin de Partida");
		dlgFin.setLayout(new FlowLayout());
		dlgFin.setLocationRelativeTo(null);
		dlgFin.add(lblFin);

		this.addWindowListener(this);
		this.setVisible(true);


	}
	public static void main(String[] args) {
		new Partida();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//RENDIRSE 
		if (btnRendirse.equals(ae.getSource())) 
		{
			dlgRendirse.setVisible(true);
		}

		if(btnSi.equals(ae.getSource())) {
			dlgRendirse.setVisible(false);
			dlgFin.setVisible(true);
			this.setVisible(false);
			new MenuPrincipal();


		} else if(btnNo.equals(ae.getSource())) {
			dlgRendirse.setVisible(false);
		}

		//PELEA
		if(btnAtacar.equals(ae.getSource())) {
			pnlMovimientos.setVisible(true);
		}
		//ATAQUES J1
		if(btnAtaque1J1.equals(ae.getSource())) 
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;

		} 
		else if (btnAtaque2J1.equals(ae.getSource()))
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;

		} 
		else if(btnAtaque3J1.equals(ae.getSource())) 
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;

		} 
		else if(btnAtaque4J1.equals(ae.getSource())) 
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;

		} 

		//ATAQUES J2
		if(btnAtaque1J2.equals(ae.getSource())) 
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;

		} 
		else if (btnAtaque2J2.equals(ae.getSource()))
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;
		} 
		else if(btnAtaque3J2.equals(ae.getSource())) 
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;
		} 
		else if(btnAtaque4J2.equals(ae.getSource())) 
		{
			pnlMovimientos.setVisible(false);
			pnlTranscurso.remove(lblQueHacer);
			pnlTranscurso.add(lblAtaque);
			pnlTranscurso.add(lblDanio);
			pnlTranscurso.add(lblQueHacer);
			turno=turno+1;
		}
		//MOSTRAR MOVIMIENTOS
		if(turno%2!=0) 
		{
			pnlMovimientos.remove(pnlMovimientosJ2);
			pnlMovimientos.add(pnlMovimientosJ1);

		} else {
			pnlMovimientos.remove(pnlMovimientosJ1);
			pnlMovimientos.add(pnlMovimientosJ2);

		}

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
