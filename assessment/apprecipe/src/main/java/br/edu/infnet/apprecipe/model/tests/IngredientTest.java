package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.AnimalBased;
import br.edu.infnet.apprecipe.model.domain.PlantBased;
import br.edu.infnet.apprecipe.model.domain.Spice;
import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class IngredientTest {

	public static void main(String[] args) {

		try {
			Spice sp1 = new Spice("Páprica", 0.1f, 1, "Avermelhado");
			sp1.setSpiceForm("Moído");
			sp1.setTaste("Agridoce");
			} catch (ZeroCostException | NullOrEmptyAttributeException e) {
				System.out.println("[ERRO] " + e.getMessage());
			}
			
			try {
			Spice sp2 = new Spice("Pimenta do reino", 0.15f, -0.5f, "Incolor");
			sp2.setSpiceForm("Moído");
			sp2.setTaste("Apimentado");
			} catch (ZeroCostException | NullOrEmptyAttributeException e) {
				System.out.println("[ERRO] " + e.getMessage());
			}
			
			try {
			Spice sp3 = new Spice("Aniz estrelado", 0.20f, 0, "Incolor");
			sp3.setSpiceForm("Fresco");
			sp3.setTaste("Azedo");
			} catch (ZeroCostException | NullOrEmptyAttributeException e) {
				System.out.println("[ERRO] " + e.getMessage());
			}
		
		try {
			PlantBased pb1;
			pb1 = new PlantBased("Alho poró", 0.2f, 20, false);
			pb1.setForm("Cru");
			pb1.setUnit("Maço");
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb2 = new PlantBased("Brócolis", 1, 15, true);
			pb2.setForm("Cru");
			pb2.setUnit("Maço");
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb3 = new PlantBased("Batata", 1.5f, 10, false);
			pb3.setForm("Pré-cozido");
			pb3.setUnit("Kilo");
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab1;
			ab1 = new AnimalBased("Salmão", 2, 20, false);
			ab1.setOrigin("Pesca");
			ab1.setMeatForm("Fresco");
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab2 = new AnimalBased("Javali", 2, 30, true);
			ab2.setOrigin("Caça");
			ab2.setMeatForm("Congelado");
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab3 = new AnimalBased("Wagyu", 1, 200, false);
			ab3.setOrigin("Manejo");
			ab3.setMeatForm("Refrigerado");
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

	}

}
