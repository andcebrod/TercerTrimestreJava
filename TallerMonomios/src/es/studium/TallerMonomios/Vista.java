package es.studium.TallerMonomios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Vista extends JFrame implements WindowListener, ActionListener{


	JMenuBar barraMenu = new JMenuBar();
	JMenu menuArchivo = new JMenu("Archivo");
	JMenu menuOperar = new JMenu("Operar");
	JMenuItem mniArchivoSalir = new JMenuItem("Salir");
	JMenuItem mniOperarCambiarSigno = new JMenuItem("Cambiar signo");
	JMenuItem mniOperarSumar = new JMenuItem("Sumar");
	JMenuItem mniOperarRestar = new JMenuItem("Restar");
	JMenuItem mniOtrosMultiplicar = new JMenuItem("Multiplicar");
	JMenuItem mniOtrosDerivar = new JMenuItem("Derivar");

	//CAMBIAR SIGNO
	JDialog dlgCambiarSigno = new JDialog();
	JLabel lblCSMonomio = new JLabel("Monomio");
	JLabel lblCSX = new JLabel ("x");
	JTextField txtCSValor = new JTextField(3);
	JTextField txtCSOrden = new JTextField(3);
	JTextField txtCSResultado = new JTextField(10);
	JButton btnSigno = new JButton("Cambiar signo"); 

	//SUMAR
	JDialog dlgSumar = new JDialog();
	JLabel lblSMonomio1 = new JLabel("Primer Monomio");
	JLabel lblSMonomio2 = new JLabel("Segundo Monomio");
	JLabel lblSX1 = new JLabel ("x");
	JLabel lblSX2 = new JLabel ("x");
	JTextField txtSValor1 = new JTextField(3);
	JTextField txtSOrden1 = new JTextField(3);
	JTextField txtSValor2 = new JTextField(3);
	JTextField txtSOrden2 = new JTextField(3);
	JButton btnSuma = new JButton("Sumar"); 
	JTextField txtSResultado = new JTextField(10);

	//RESTAR
	JDialog dlgRestar = new JDialog();
	JLabel lblRMonomio1 = new JLabel("Primer Monomio");
	JLabel lblRMonomio2 = new JLabel("Segundo Monomio");
	JLabel lblRX1 = new JLabel ("x");
	JLabel lblRX2 = new JLabel ("x");
	JTextField txtRValor1 = new JTextField(3);
	JTextField txtROrden1 = new JTextField(3);
	JTextField txtRValor2 = new JTextField(3);
	JTextField txtROrden2 = new JTextField(3);
	JButton btnResta = new JButton("Restar"); 
	JTextField txtRResultado = new JTextField(10);

	//MULTIPLICAR
	JDialog dlgMultiplicar = new JDialog();
	JLabel lblMMonomio1 = new JLabel("Primer Monomio");
	JLabel lblMMonomio2 = new JLabel("Segundo Monomio");
	JLabel lblMX1 = new JLabel ("x");
	JLabel lblMX2 = new JLabel ("x");
	JTextField txtMValor1 = new JTextField(3);
	JTextField txtMOrden1 = new JTextField(3);
	JTextField txtMValor2 = new JTextField(3);
	JTextField txtMOrden2 = new JTextField(3);
	JButton btnMultiplicar = new JButton("Multiplicar"); 
	JTextField txtMResultado = new JTextField(10);


	public Vista() 
	{
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setJMenuBar(barraMenu);
		menuArchivo.add(mniArchivoSalir);
		menuOperar.add(mniOperarCambiarSigno);
		menuOperar.add(mniOperarSumar);
		menuOperar.add(mniOperarRestar);
		menuOperar.add(mniOtrosMultiplicar);
		menuOperar.add(mniOtrosDerivar);
		barraMenu.add(menuArchivo);
		barraMenu.add(menuOperar);


		//CAMBIAR SIGNO
		dlgCambiarSigno.setSize(270,120);
		dlgCambiarSigno.setLayout(new FlowLayout());
		dlgCambiarSigno.add(lblCSMonomio);
		dlgCambiarSigno.add(txtCSValor);
		dlgCambiarSigno.add(lblCSX);
		dlgCambiarSigno.add(txtCSOrden);
		dlgCambiarSigno.add(btnSigno);
		dlgCambiarSigno.add(txtCSResultado);
		dlgCambiarSigno.setVisible(true);

		//SUMAR
		dlgSumar.setSize(250,150);
		dlgSumar.setLayout(new FlowLayout());
		dlgSumar.add(lblSMonomio1);
		dlgSumar.add(txtSValor1);
		dlgSumar.add(lblSX1);
		dlgSumar.add(txtSOrden1);
		dlgSumar.add(lblSMonomio2);
		dlgSumar.add(txtSValor2);
		dlgSumar.add(lblSX2);
		dlgSumar.add(txtSOrden2);
		dlgSumar.add(btnSuma);
		dlgSumar.add(txtSResultado);

		dlgSumar.setVisible(true);

		//RESTAR
		dlgRestar.setSize(250,150);
		dlgRestar.setLayout(new FlowLayout());
		dlgRestar.add(lblRMonomio1);
		dlgRestar.add(txtRValor1);
		dlgRestar.add(lblRX1);
		dlgRestar.add(txtROrden1);
		dlgRestar.add(lblRMonomio2);
		dlgRestar.add(txtRValor2);
		dlgRestar.add(lblRX2);
		dlgRestar.add(txtROrden2);
		dlgRestar.add(btnResta);
		dlgRestar.add(txtRResultado);

		dlgRestar.setVisible(true);

		//MULTIPLICAR
		dlgMultiplicar.setSize(250,150);
		dlgMultiplicar.setLayout(new FlowLayout());
		dlgMultiplicar.add(lblMMonomio1);
		dlgMultiplicar.add(txtMValor1);
		dlgMultiplicar.add(lblMX1);
		dlgMultiplicar.add(txtMOrden1);
		dlgMultiplicar.add(lblMMonomio2);
		dlgMultiplicar.add(txtMValor2);
		dlgMultiplicar.add(lblMX2);
		dlgMultiplicar.add(txtMOrden2);
		dlgMultiplicar.add(btnMultiplicar);
		dlgMultiplicar.add(txtMResultado);

		dlgMultiplicar.setVisible(true);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Vista();
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
