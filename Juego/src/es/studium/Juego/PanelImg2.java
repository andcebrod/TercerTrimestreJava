package es.studium.Juego;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImg2 extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image fondo;
	public PanelImg2() {
		preInit();
		initComponents();
	}
	private void initComponents() {
		// TODO Auto-generated method stub

	}
	private void preInit() {
		fondo = new ImageIcon("imagenes/charizard.png").getImage();

	}
	public void paint(Graphics g) {
		g.drawImage(fondo, 0,0,getWidth(),getHeight(),this);
	}
}