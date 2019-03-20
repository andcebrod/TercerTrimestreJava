package es.studium.Juego;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImg extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image fondo;
	public PanelImg() {
		preInit();
		initComponents();
	}
	private void initComponents() {
		// TODO Auto-generated method stub

	}
	private void preInit() {
		fondo = new ImageIcon("imagenes/blastoise.png").getImage();

	}
	public void paint(Graphics g) {
		g.drawImage(fondo, 0,0,getWidth(),getHeight(),this);
	}
}
