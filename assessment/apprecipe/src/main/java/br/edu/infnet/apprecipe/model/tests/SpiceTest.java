package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.Spice;
import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class SpiceTest {

	public static void main(String[] args) {

		try {
		Spice sp1 = new Spice("Páprica", 0.1f, 1, "Avermelhado");
		sp1.setSpiceForm("Moído");
		sp1.setTaste("Agridoce");
		System.out.println(sp1);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
		Spice sp2 = new Spice("Pimenta do reino", 0.15f, -0.5f, "Incolor");
		sp2.setSpiceForm("Moído");
		sp2.setTaste("Apimentado");
		System.out.println(sp2);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
		Spice sp3 = new Spice("Aniz estrelado", 0.20f, 0, "Incolor");
		sp3.setSpiceForm("Fresco");
		sp3.setTaste("Azedo");
		System.out.println(sp3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Spice sp3 = new Spice(" ", 0.20f, 1, "Incolor");
			sp3.setSpiceForm("Fresco");
			sp3.setTaste("Azedo");
			System.out.println(sp3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
