package es.studium.TallerMonomios;

public class PruebaMonomioConsola {
	
	public static void main(String[] args) {
		Monomio m1 = new Monomio(3,4);
		Monomio m2 = new Monomio(2,4);
		//Calcular Suma
		System.out.println(m1.mostrarMonomio(m1.sumaMonomio(m2)));
		//Calcular Resta
		System.out.println(m1.mostrarMonomio(m1.restaMonomio(m2)));
		//Cambiar de signo
		System.out.println(m1.mostrarMonomio(m1.cambiaSignoMonomio()));
		//Calcular producto
		System.out.println(m1.mostrarMonomio(m1.multiplicacionMonomio(m2)));
		//Calcular derivada
		System.out.println(m1.mostrarMonomio(m1.derivarMonomio()));
	}

}
