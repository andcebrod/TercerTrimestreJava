package es.studium.Juego;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Top10 extends JFrame implements WindowListener, ActionListener
{
	JLabel lblPartidas = new JLabel("Mejores Batallas");
	List lista = new List(5,true);
	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	JButton btnOk = new JButton("Ok");
	
	
	String Partida1 = "Pepito";
	String Partida2 = "Pepito";
	String Partida3 = "Pepito";
	String Partida4 = "Pepito";
	String Partida5 = "Pepito";
	String Partida6 = "Pepito";
	String Partida7 = "Pepito";
	String Partida8 = "Pepito";
	String Partida9 = "Pepito";
	String Partida10 = "Pepito";
	
	
	
	public Top10()
	{

		this.setTitle("Top 10");
		setLocationRelativeTo(null);
		this.setSize(300,300);
		setLayout(new GridLayout(3,1));
		pnluno.add(lblPartidas);
		this.add(pnluno);
		lista.add(Partida1);
		lista.add(Partida2);
		lista.add(Partida3);
		lista.add(Partida4);
		lista.add(Partida5);
		lista.add(Partida6);
		lista.add(Partida7);
		lista.add(Partida8);
		lista.add(Partida9);
		lista.add(Partida10);
		
		pnldos.add(lista);
		this.add(pnldos);
		pnltres.add(btnOk);
		this.add(pnltres);
		btnOk.addActionListener(this);
		
		
		
		this.addWindowListener(this);
		this.setVisible(true);
		
		
	}

	private static final long serialVersionUID = 1L;

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
		this.setVisible(false);
		new MenuPrincipal();

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
	public void actionPerformed(ActionEvent ae) {
		if(btnOk.equals(ae.getSource())) {
			this.setVisible(false);
			new MenuPrincipal();
		}
		
	}

}
