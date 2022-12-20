package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.Spice;

public class SpiceTest {

	public static void main(String[] args) {

		Spice sp1 = new Spice("Páprica", 0.1f, 1, "Avermelhado");
		sp1.setSpiceForm("Moído");
		sp1.setTaste("Agridoce");
		System.out.println(sp1);
		
		Spice sp2 = new Spice("Pimenta do reino", 0.15f, 0.5f, "Incolor");
		sp2.setSpiceForm("Moído");
		sp2.setTaste("Apimentado");
		System.out.println(sp2);
		
		Spice sp3 = new Spice("Aniz estrelado", 0.20f, 1, "Incolor");
		sp3.setSpiceForm("Fresco");
		sp3.setTaste("Azedo");
		System.out.println(sp3);

	}

}
