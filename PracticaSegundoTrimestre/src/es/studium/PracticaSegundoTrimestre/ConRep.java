package es.studium.PracticaSegundoTrimestre;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConRep implements WindowListener{

	Frame ventanaConRep = new Frame ("Consulta de Reparación");
	Label lblAveriaRep = new Label ("Avería:");
	Label lblFechaEntradaRep = new Label ("Fecha de Entrada:");
	Label lblFechaSalidaRep = new Label ("Fecha de Salida:");
	Label lblReparadoRep = new Label ("Reparado:");


	TextField txtAveriaRep = new TextField(10);
	TextField txtFechaEntradaRep = new TextField(10);
	TextField txtFechaSalidaRep = new TextField(10);
	
	CheckboxGroup chkReparadoRep = new CheckboxGroup();
	Checkbox chkSiRep = new Checkbox("Sí", false, chkReparadoRep);
	Checkbox chkNoRep = new Checkbox("No", true, chkReparadoRep);
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	
	
	public ConRep() 
	{
		ventanaConRep.setLayout(new GridLayout(4,2));
		ventanaConRep.setLocationRelativeTo(null);
		ventanaConRep.setSize(600,300);
		
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		
		pnlPanel.add(lblAveriaRep);
		pnlPanel.add(txtAveriaRep);
		ventanaConRep.add(pnlPanel);

		pnlPanel2.add(lblFechaEntradaRep);
		pnlPanel2.add(txtFechaEntradaRep);
		ventanaConRep.add(pnlPanel2);

		pnlPanel3.add(lblFechaSalidaRep);
		pnlPanel3.add(txtFechaSalidaRep);
		ventanaConRep.add(pnlPanel3);
		
		pnlPanel4.add(lblReparadoRep);
		pnlPanel4.add(chkSiRep);
		pnlPanel4.add(chkNoRep);
		ventanaConRep.add(pnlPanel4);
		
		
		ventanaConRep.addWindowListener(this);
		ventanaConRep.setVisible(true);
	}
	public static void main(String[] args) {}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		if(ventanaConRep.isActive()) {
			ventanaConRep.setVisible(false);
		}else {
			//System.exit(0);
		}	
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}
	@Override
	public void windowIconified(WindowEvent arg0) {}
	@Override
	public void windowOpened(WindowEvent arg0) {}

}
