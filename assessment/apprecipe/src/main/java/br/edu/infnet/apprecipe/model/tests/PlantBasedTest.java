package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.PlantBased;
import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class PlantBasedTest {

	public static void main(String[] args) {

		try {
			PlantBased pb1;
			pb1 = new PlantBased("Alho poró", 0.2f, 20, false);
			pb1.setForm("Cru");
			pb1.setUnit("Maço");
			System.out.println(pb1);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb2 = new PlantBased("Brócolis", 1, -15, true);
			pb2.setForm("Cru");
			pb2.setUnit("Maço");
			System.out.println(pb2);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb3 = new PlantBased("Batata", 1.5f, 0, false);
			pb3.setForm("Pré-cozido");
			pb3.setUnit("Kilo");
			System.out.println(pb3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb3 = new PlantBased(null, 1.5f, 0, false);
			pb3.setForm("Pré-cozido");
			pb3.setUnit("Kilo");
			System.out.println(pb3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
