package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.PlantBased;

public class PlantBasedTest {

	public static void main(String[] args) {

		PlantBased pb1 = new PlantBased("Alho poró", 0.2f, 20, false);
		pb1.setForm("Cru");
		pb1.setUnit("Maço");
		System.out.println(pb1);
		
		PlantBased pb2 = new PlantBased("Brócolis", 1, 15, true);
		pb2.setForm("Cru");
		pb2.setUnit("Maço");
		System.out.println(pb2);
		
		PlantBased pb3 = new PlantBased("Batata", 1.5f, 10, false);
		pb3.setForm("Pré-cozido");
		pb3.setUnit("Kilo");
		System.out.println(pb3);

	}

}
