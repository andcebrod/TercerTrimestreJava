package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConRepList implements WindowListener, ActionListener, TextListener{
	Frame ventanaConRepList = new Frame ("Buscar reparación para consulta");
	Label lblBuscarRep = new Label ("Buscar avería :");
	TextField txtBuscarRep = new TextField(10);
	List ListaRep = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");

	public ConRepList() 
	{
		ventanaConRepList.setLayout(new FlowLayout());
		ventanaConRepList.setLocationRelativeTo(null);
		ventanaConRepList.setSize(400,600);
		ventanaConRepList.add(lblBuscarRep);
		ventanaConRepList.add(txtBuscarRep);
		ventanaConRepList.add(btnBuscar);
		ventanaConRepList.add(ListaRep);
		ventanaConRepList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);

		ventanaConRepList.addWindowListener(this);
		ventanaConRepList.setVisible(true);
	}
	public static void main(String[] args) {}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(btnSeleccionar.equals(ae.getSource())) 
		{
			new ConRep();
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		if(ventanaConRepList.isActive()) {
			ventanaConRepList.setVisible(false);
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
