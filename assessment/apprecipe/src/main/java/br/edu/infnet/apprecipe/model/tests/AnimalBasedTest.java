package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.AnimalBased;
import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class AnimalBasedTest {

	public static void main(String[] args) {
		
		try {
			AnimalBased ab1;
			ab1 = new AnimalBased("Salmão", 2, 20, false);
			ab1.setOrigin("Pesca");
			ab1.setMeatForm("Fresco");
			ab1.toString();
			System.out.println(ab1);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab2 = new AnimalBased("Javali", 2, -20, true);
			ab2.setOrigin("Caça");
			ab2.setMeatForm("Congelado");
			ab2.toString();
			System.out.println(ab2);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab3 = new AnimalBased("Wagyu", 1, 0, false);
			ab3.setOrigin("Manejo");
			ab3.setMeatForm("Refrigerado");
			ab3.toString();
			System.out.println(ab3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab3 = new AnimalBased("", 1, 0, false);
			ab3.setOrigin("Manejo");
			ab3.setMeatForm("Refrigerado");
			ab3.toString();
			System.out.println(ab3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
	}
}
