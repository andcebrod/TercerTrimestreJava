package es.studium.PracticaSegundoTrimestre;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuPrincipal implements WindowListener, ActionListener, TextListener{
	Frame ventana = new Frame ("Taller de Recambios");
	List Lista = new List(4, false);
	Panel pnlLista = new Panel();
	Panel pnlCard = new Panel();
	Panel pnlClientes = new Panel();
	Panel pnlRecambios = new Panel();
	Panel pnlReparaciones = new Panel();
	Panel pnlFacturas = new Panel();
	
	MenuBar barraMenu = new MenuBar();
	Menu menuArchivo = new Menu("Archivo");
	Menu menuOperaciones = new Menu("Operaciones");

	MenuItem mniArchivoAbrir = new MenuItem("Abrir");
	MenuItem mniArchivoGuardar = new MenuItem("Guardar");
	MenuItem mniArchivoSalir = new MenuItem("Salir");
	
	final static String Clientes = "Clientes";
	final static String Recambios = "Recambios";
	final static String Reparaciones = "Reparaciones";
	final static String Facturas = "Facturas";
	
	
	Button btnAddCli = new Button("Añadir Clientes");
	Button btnModCli = new Button("Modificar Clientes");
	Button btnElCli = new Button("Eliminar Clientes");
	Button btnConCli = new Button("Consultar Clientes");
	
	Button btnAddRec = new Button("Añadir Recambios");
	Button btnModRec = new Button("Modificar Recambios");
	Button btnElRec = new Button("Eliminar Recambios");
	Button btnConRec = new Button("Consultar Recambios");
	
	Button btnAddRep = new Button("Añadir Reparaciones");
	Button btnModRep = new Button("Modificar Reparaciones");
	Button btnElRep = new Button("Eliminar Reparaciones");
	Button btnConRep = new Button("Consultar Reparaciones");
	
	Button btnAddFac = new Button("Añadir Facturas");
	Button btnModFac = new Button("Modifcar Facturas");
	Button btnElFac = new Button("Eliminar Facturas");
	Button btnConFac = new Button("Consultar Facturas");
	

	
	public MenuPrincipal() {
		
		ventana.setLocationRelativeTo(null);
		ventana.setSize(800,300);
		ventana.setLayout(new BorderLayout());
		
		ventana.setMenuBar(barraMenu);
		menuArchivo.add(mniArchivoAbrir);
		mniArchivoAbrir.addActionListener(this);
		menuArchivo.add(mniArchivoGuardar);
		mniArchivoGuardar.addActionListener(this);
		// Añadimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(mniArchivoSalir);
		mniArchivoSalir.addActionListener(this);
		
		barraMenu.add(menuArchivo);
		barraMenu.add(menuOperaciones);
		
		Lista.add(Clientes);
		Lista.add(Recambios);
		Lista.add(Reparaciones);
		Lista.add(Facturas);
		pnlLista.add(Lista);
		ventana.add("West", pnlLista);
		pnlCard.setLayout(new CardLayout() );
		
		pnlClientes.add(btnAddCli);
		pnlClientes.add(btnModCli);
		pnlClientes.add(btnElCli);
		pnlClientes.add(btnConCli);
		
		btnAddCli.addActionListener(this);
		btnModCli.addActionListener(this);
		btnElCli.addActionListener(this);
		btnConCli.addActionListener(this);
		
		pnlRecambios.add(btnAddRec);
		pnlRecambios.add(btnModRec);
		pnlRecambios.add(btnElRec);
		pnlRecambios.add(btnConRec);
		
		btnAddRec.addActionListener(this);
		btnModRec.addActionListener(this);
		btnElRec.addActionListener(this);
		btnConRec.addActionListener(this);
		
		pnlReparaciones.add(btnAddRep);
		pnlReparaciones.add(btnModRep);
		pnlReparaciones.add(btnElRep);
		pnlReparaciones.add(btnConRep);
		
		btnAddRep.addActionListener(this);
		btnModRep.addActionListener(this);
		btnElRep.addActionListener(this);
		btnConRep.addActionListener(this);
		
		pnlFacturas.add(btnAddFac);
		pnlFacturas.add(btnModFac);
		pnlFacturas.add(btnElFac);
		pnlFacturas.add(btnConFac);
		
		btnAddFac.addActionListener(this);
		btnModFac.addActionListener(this);
		btnElFac.addActionListener(this);
		btnConFac.addActionListener(this);
		
		pnlCard.add(Clientes , pnlClientes);
		pnlCard.add(Recambios , pnlRecambios);
		pnlCard.add(Reparaciones , pnlReparaciones);
		pnlCard.add(Facturas , pnlFacturas);
		
		ventana.add("East",pnlCard);
		
		Lista.addActionListener(this);
		ventana.addWindowListener(this);
		ventana.setVisible(true);
	}
	public static void main(String[] args) {
		
	}
	@Override
	public void textValueChanged(TextEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//OPCIONES LISTA
		if(Clientes.equals(Lista.getSelectedItem())) 
		{
			pnlCard.add(Clientes , pnlClientes);
			pnlCard.add(Recambios , pnlRecambios);
			pnlCard.add(Reparaciones , pnlReparaciones);
			pnlCard.add(Facturas , pnlFacturas);
		} else if(Recambios.equals(Lista.getSelectedItem())) 
		{
			pnlCard.add(Recambios , pnlRecambios);
			pnlCard.add(Clientes , pnlClientes);
			pnlCard.add(Reparaciones , pnlReparaciones);
			pnlCard.add(Facturas , pnlFacturas);
		} else if(Reparaciones.equals(Lista.getSelectedItem())) 
		{
			pnlCard.add(Reparaciones , pnlReparaciones);
			pnlCard.add(Clientes , pnlClientes);
			pnlCard.add(Recambios , pnlRecambios);
			pnlCard.add(Facturas , pnlFacturas);
		} else if(Facturas.equals(Lista.getSelectedItem())) 
		{
			pnlCard.add(Facturas , pnlFacturas);
			pnlCard.add(Reparaciones , pnlReparaciones);
			pnlCard.add(Clientes , pnlClientes);
			pnlCard.add(Recambios , pnlRecambios);
		} 
		
		//BOTONES DE CLIENTES
		if(btnAddCli.equals(ae.getSource())) {
			new AddCli();
		}
		else if(btnModCli.equals(ae.getSource())) {
			new ModCliList();
		}
		else if(btnElCli.equals(ae.getSource())) {
			new ElCliList();
		}
		else if (btnConCli.equals(ae.getSource())) {
			new ConCliList();
		}
		//BOTONES DE RECAMBIOS
		if(btnAddRec.equals(ae.getSource())) {
			new AddRec();
		}  else if(btnModRec.equals(ae.getSource())) {
			new ModRecList();
		}
		else if(btnElRec.equals(ae.getSource())) {
			new ElRecList();
		}
		else if (btnConRec.equals(ae.getSource())) {
			new ConRecList();
		}
		//BOTONES DE REPARACIONES
		if(btnAddRep.equals(ae.getSource())) {
			new AddRep();
		} else if(btnModRep.equals(ae.getSource())) {
			new ModRepList();
		} else if(btnElRep.equals(ae.getSource())) {
			new ElRepList();
		}else if (btnConRep.equals(ae.getSource())) {
			new ConRepList();
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
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
