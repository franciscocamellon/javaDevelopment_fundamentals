package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.AnimalBased;
import br.edu.infnet.apprecipe.model.domain.PlantBased;
import br.edu.infnet.apprecipe.model.domain.Spice;

public class IngredientTest {

	public static void main(String[] args) {

		Spice sp1 = new Spice("Páprica", 0.1, 1, "Avermelhado");
		sp1.setSpiceForm("Moído");
		sp1.setTaste("Agridoce");
		System.out.println(sp1);
		
		Spice sp2 = new Spice("Pimenta do reino", 0.15, 0.5, "Incolor");
		sp2.setSpiceForm("Moído");
		sp2.setTaste("Apimentado");
		System.out.println(sp2);
		
		Spice sp3 = new Spice("Aniz estrelado", 0.20, 1, "Incolor");
		sp3.setSpiceForm("Fresco");
		sp3.setTaste("Azedo");
		System.out.println(sp3);
		
		PlantBased pb1 = new PlantBased("Alho poró", 0.2, 20, false);
		pb1.setForm("Cru");
		pb1.setUnit("Maço");
		System.out.println(pb1);
		
		PlantBased pb2 = new PlantBased("Brócolis", 1, 15, true);
		pb2.setForm("Cru");
		pb2.setUnit("Maço");
		System.out.println(pb2);
		
		PlantBased pb3 = new PlantBased("Batata", 1, 10, false);
		pb3.setForm("Pré-cozido");
		pb3.setUnit("Kilo");
		System.out.println(pb3);
		
		AnimalBased ab1 = new AnimalBased("Salmão", 2, 20, false);
		ab1.setOrigin("Pesca");
		ab1.setMeatForm("Fresco");
		ab1.toString();
		System.out.println(ab1);
		
		AnimalBased ab2 = new AnimalBased("Javali", 2, 20, true);
		ab2.setOrigin("Caça");
		ab2.setMeatForm("Congelado");
		ab2.toString();
		System.out.println(ab2);
		
		AnimalBased ab3 = new AnimalBased("Wagyu", 1, 200, false);
		ab3.setOrigin("Manejo");
		ab3.setMeatForm("Refrigerado");
		ab3.toString();
		System.out.println(ab3);

	}

}
