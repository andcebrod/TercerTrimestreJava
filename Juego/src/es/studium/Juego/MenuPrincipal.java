package es.studium.Juego;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MenuPrincipal extends JFrame implements WindowListener, ActionListener {
	
	private static final long serialVersionUID = 1L;
	JButton btnIniciar = new JButton("Iniciar");
	JButton btnTop10 = new JButton("Top 10");
	JButton btnAyuda = new JButton("Ayuda");
	
	JPanel pnlImagen = new JPanel();
	JPanel pnluno = new JPanel();
	JPanel pnldos = new JPanel();
	JPanel pnltres = new JPanel();
	
	
	public MenuPrincipal() 
	{
		this.setTitle("Combate Pokemon!");
		setLocationRelativeTo(null);
		this.setSize(300,250);
		setLayout(new GridLayout(4,1));
		this.add(pnlImagen);
		
		
		
		pnluno.add(btnIniciar);
		btnIniciar.addActionListener(this);
		this.add(pnluno);
		pnldos.add(btnTop10);
		btnTop10.addActionListener(this);
		this.add(pnldos);
		pnltres.add(btnAyuda);
		btnAyuda.addActionListener(this);
		
		this.add(pnltres);
		
		
		
		
		
		this.setVisible(true);
		addWindowListener(this);
		
	}
	
	public static void main(String[] args) {
		new MenuPrincipal();
	}
	

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if (btnIniciar.equals(ae.getSource())) 
		{
			new NuevaPartida();
			this.setVisible(false);
			
		} else if (btnTop10.equals(ae.getSource())) {
			
			new Top10();
			
		} else if (btnAyuda.equals(ae.getSource())) {
			
			
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
