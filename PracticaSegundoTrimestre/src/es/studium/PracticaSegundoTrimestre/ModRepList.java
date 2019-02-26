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

public class ModRepList implements WindowListener, ActionListener, TextListener{
	Frame ventanaModRepList = new Frame ("Buscar reparación para modificar");
	Label lblBuscarCli = new Label ("Buscar avería :");
	TextField txtBuscarRep = new TextField(10);
	List ListaRep = new List(4, false);
	Button btnBuscar = new Button("Buscar");
	Button btnSeleccionar = new Button("Seleccionar");

	public ModRepList() {
		ventanaModRepList.setLayout(new FlowLayout());
		ventanaModRepList.setLocationRelativeTo(null);
		ventanaModRepList.setSize(400,600);
		ventanaModRepList.add(lblBuscarCli);
		ventanaModRepList.add(txtBuscarRep);
		ventanaModRepList.add(btnBuscar);
		ventanaModRepList.add(ListaRep);
		ventanaModRepList.add(btnSeleccionar);
		btnSeleccionar.addActionListener(this);

		ventanaModRepList.addWindowListener(this);
		ventanaModRepList.setVisible(true);
	}
	public static void main(String[] args) {}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(btnSeleccionar.equals(ae.getSource())) 
		{
			new ModRep();
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		if(ventanaModRepList.isActive()) {
			ventanaModRepList.setVisible(false);
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
