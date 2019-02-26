package es.studium.PracticaSegundoTrimestre;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ModRep implements WindowListener, ActionListener, TextListener{

	Frame ventanaModRep = new Frame ("Modificar reparación:");
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

	Button btnCrear = new Button("Modificar Reparación");
	Button btnLimpiar = new Button("Limpiar");

	Dialog dlgExitoModRep = new Dialog(ventanaModRep, "Reparación modificada");
	Label lblExito = new Label("Reparación modificada con éxito");

	public ModRep() 
	{
		ventanaModRep.setLayout(new FlowLayout());
		ventanaModRep.setLocationRelativeTo(null);
		ventanaModRep.setSize(600,300);


		ventanaModRep.add(lblAveriaRep);
		ventanaModRep.add(txtAveriaRep);

		ventanaModRep.add(lblFechaEntradaRep);
		ventanaModRep.add(txtFechaEntradaRep);

		ventanaModRep.add(lblFechaSalidaRep);
		ventanaModRep.add(txtFechaSalidaRep);

		ventanaModRep.add(lblReparadoRep);
		ventanaModRep.add(chkSiRep);
		ventanaModRep.add(chkNoRep);

		ventanaModRep.add(btnCrear);
		btnCrear.addActionListener(this);
		ventanaModRep.add(btnLimpiar);
		btnLimpiar.addActionListener(this);

		ventanaModRep.addWindowListener(this);
		ventanaModRep.setVisible(true);

		dlgExitoModRep.setLocationRelativeTo(null);
		dlgExitoModRep.setSize(190,90);
		dlgExitoModRep.add(lblExito);
		dlgExitoModRep.addWindowListener(this);
		dlgExitoModRep.setVisible(false);
		dlgExitoModRep.setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
	}
	@Override
	public void textValueChanged(TextEvent e) {}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if (btnCrear.equals(ae.getSource())) {
			dlgExitoModRep.setVisible(true);
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
		if(ventanaModRep.isActive()) {
			ventanaModRep.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(dlgExitoModRep.isActive()) {
			dlgExitoModRep.setVisible(false);
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
