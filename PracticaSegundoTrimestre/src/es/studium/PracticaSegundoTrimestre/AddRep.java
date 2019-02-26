package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AddRep implements WindowListener, ActionListener, TextListener{
	Frame ventanaAddRep = new Frame ("Añadir Reparación");
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
	
	
	Button btnCrear = new Button("Crear Reparación");
	Button btnLimpiar = new Button("Limpiar");
	
	Dialog dlgExitoAddRep = new Dialog(ventanaAddRep, "Reparación creada");
	Label lblExito = new Label("Reparación creada con éxito");
	public AddRep() 
	{
		ventanaAddRep.setLayout(new FlowLayout());
		ventanaAddRep.setLocationRelativeTo(null);
		ventanaAddRep.setSize(600,300);
		
		ventanaAddRep.add(lblAveriaRep);
		ventanaAddRep.add(txtAveriaRep);
		
		ventanaAddRep.add(lblFechaEntradaRep);
		ventanaAddRep.add(txtFechaEntradaRep);
		
		ventanaAddRep.add(lblFechaSalidaRep);
		ventanaAddRep.add(txtFechaSalidaRep);
		
		ventanaAddRep.add(lblReparadoRep);
		ventanaAddRep.add(chkSiRep);
		ventanaAddRep.add(chkNoRep);
		
		ventanaAddRep.add(btnCrear);
		btnCrear.addActionListener(this);
		ventanaAddRep.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		ventanaAddRep.addWindowListener(this);
		ventanaAddRep.setVisible(true);
		
		dlgExitoAddRep.setLocationRelativeTo(null);
		dlgExitoAddRep.setSize(190,90);
		dlgExitoAddRep.add(lblExito);
		dlgExitoAddRep.addWindowListener(this);
		dlgExitoAddRep.setVisible(false);
		dlgExitoAddRep.setLayout(new FlowLayout());
		
	}

	public static void main(String[] args) {
	
		new AddRep();
	}
	@Override
	public void textValueChanged(TextEvent e) {}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if (btnCrear.equals(ae.getSource())) {
			dlgExitoAddRep.setVisible(true);
		} else if (btnLimpiar.equals(ae.getSource())) {
			txtAveriaRep.selectAll();
			txtAveriaRep.setText("");
			txtFechaEntradaRep.selectAll();
			txtFechaEntradaRep.setText("");
			txtFechaSalidaRep.selectAll();
			txtFechaSalidaRep.setText("");
			
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowClosing(WindowEvent arg0) {
		
		if(ventanaAddRep.isActive()) {
			ventanaAddRep.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoAddRep.isActive()) {
			dlgExitoAddRep.setVisible(false);
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
