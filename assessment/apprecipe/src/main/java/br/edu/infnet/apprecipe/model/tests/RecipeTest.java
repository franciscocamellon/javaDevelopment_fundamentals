package br.edu.infnet.apprecipe.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.apprecipe.model.domain.AnimalBased;
import br.edu.infnet.apprecipe.model.domain.Chef;
import br.edu.infnet.apprecipe.model.domain.Ingredient;
import br.edu.infnet.apprecipe.model.domain.PlantBased;
import br.edu.infnet.apprecipe.model.domain.Recipe;
import br.edu.infnet.apprecipe.model.domain.Spice;

public class RecipeTest {

	public static void main(String[] args) {
		
		Spice sp1 = new Spice("Páprica", 0.1f, 1, "Avermelhado");
		sp1.setSpiceForm("Moído");
		sp1.setTaste("Agridoce");
		
		Spice sp2 = new Spice("Pimenta do reino", 0.15f, 0.5f, "Incolor");
		sp2.setSpiceForm("Moído");
		sp2.setTaste("Apimentado");
		
		Spice sp3 = new Spice("Aniz estrelado", 0.20f, 1, "Incolor");
		sp3.setSpiceForm("Fresco");
		sp3.setTaste("Azedo");
		
		PlantBased pb1 = new PlantBased("Alho poró", 0.2f, 20, false);
		pb1.setForm("Cru");
		pb1.setUnit("Maço");
		
		PlantBased pb2 = new PlantBased("Brócolis", 1, 15, true);
		pb2.setForm("Cru");
		pb2.setUnit("Maço");
		
		PlantBased pb3 = new PlantBased("Batata", 1.5f, 10, false);
		pb3.setForm("Pré-cozido");
		pb3.setUnit("Kilo");
		
		AnimalBased ab1 = new AnimalBased("Salmão", 2, 20, false);
		ab1.setOrigin("Pesca");
		ab1.setMeatForm("Fresco");
		
		AnimalBased ab2 = new AnimalBased("Javali", 2, 20, true);
		ab2.setOrigin("Caça");
		ab2.setMeatForm("Congelado");
		
		AnimalBased ab3 = new AnimalBased("Wagyu", 1, 200, false);
		ab3.setOrigin("Manejo");
		ab3.setMeatForm("Refrigerado");
		
		Chef c1 = new Chef("Joao", "Almeria", "joao.almeria@email.com" );
		Chef c2 = new Chef("Maria", "Cantucci Osteria", "maria@email.com" );
		Chef c3= new Chef("Manel", "Quanto Café", "manel@email.com" );
		
		List<Ingredient> ingredients1 = new ArrayList<Ingredient>();
		ingredients1.add(sp3);
		ingredients1.add(sp2);
		ingredients1.add(pb2);
		ingredients1.add(ab2);
		ingredients1.add(ab3);
		List<Ingredient> ingredients2 = new ArrayList<Ingredient>();
		ingredients2.add(sp1);
		ingredients2.add(sp2);
		ingredients2.add(pb3);
		ingredients2.add(ab3);
		List<Ingredient> ingredients3 = new ArrayList<Ingredient>();
		ingredients3.add(sp3);
		ingredients3.add(sp2);
		ingredients3.add(ab3);
		List<Ingredient> ingredients4 = new ArrayList<Ingredient>();
		ingredients4.add(sp1);
		ingredients4.add(sp2);
		ingredients4.add(sp3);
		ingredients4.add(ab1);
		ingredients4.add(ab2);
		ingredients4.add(ab3);
		ingredients4.add(pb1);
		ingredients4.add(pb2);
		ingredients4.add(pb3);
		
		Recipe r1 = new Recipe();
		r1.setName("Primeira receita");
		r1.setQuantity(3);
		r1.setChef(c1);
		r1.setIngredients(ingredients1);
		r1.printReport();
		
		Recipe r2 = new Recipe();
		r2.setName("Primeira receita");
		r2.setQuantity(4);
		r2.setChef(c2);
		r2.setIngredients(ingredients2);
		r2.printReport();
		
		Recipe r3 = new Recipe();
		r3.setName("Primeira receita");
		r3.setQuantity(1);
		r3.setChef(c3);
		r3.setIngredients(ingredients3);
		r3.printReport();
		
		Recipe r4 = new Recipe();
		r4.setName("Primeira receita");
		r4.setQuantity(1);
		r4.setChef(c3);
		r4.setIngredients(ingredients4);
		r4.printReport();
		
	}

}
