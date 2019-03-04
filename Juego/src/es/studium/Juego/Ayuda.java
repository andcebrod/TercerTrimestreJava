package es.studium.Juego;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;	
import javax.swing.JTextArea;

public class Ayuda extends JFrame implements WindowListener, ActionListener{
	JLabel lblPartidas = new JLabel("Ayuda");
	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JTextArea txtAyuda = new JTextArea();
	
	public Ayuda() {
		this.setTitle("Top 10");
		setLocationRelativeTo(null);
		this.setSize(300,300);
		setLayout(new GridLayout(2,1));
		

		this.addWindowListener(this);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
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
