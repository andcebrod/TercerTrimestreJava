package es.studium.TallerMonomios;

public class Monomio {

	int valor;
	int orden;
	
	public Monomio() {
		this.valor=0;
		this.orden=0;
	}
	public Monomio(int val, int ord) {
		this.valor=val;
		this.orden=ord;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	
	public String mostrarMonomio(Monomio m) {
		String cadena = null;
		cadena = m.valor+"x elevado a "+m.getOrden();
		return cadena;
	}
	public Monomio cambiaSignoMonomio() {
		this.valor=this.valor*-1;
		return(this);
	}
	public Monomio sumaMonomio (Monomio m) {
		if(this.orden==m.orden) {
			return (new Monomio(this.valor+m.valor, m.orden));
		}
		else {
			return null;
		}
	}
	public Monomio restaMonomio(Monomio m) {
		if(this.orden==m.orden) {
			return (new Monomio(this.valor-m.valor, m.orden));
		}
		else {
			return null;
		}
	}
	public Monomio multiplicacionMonomio(Monomio m) {
		
		return (new Monomio((this.valor*m.valor),this.orden+m.orden));
	}
	public Monomio derivarMonomio() {
		return (new Monomio (this.valor*this.orden, this.orden-1));
	}
	
}
