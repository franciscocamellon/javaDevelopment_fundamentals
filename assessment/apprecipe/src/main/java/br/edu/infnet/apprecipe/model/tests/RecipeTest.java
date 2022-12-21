package br.edu.infnet.apprecipe.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.apprecipe.model.domain.AnimalBased;
import br.edu.infnet.apprecipe.model.domain.Chef;
import br.edu.infnet.apprecipe.model.domain.Ingredient;
import br.edu.infnet.apprecipe.model.domain.PlantBased;
import br.edu.infnet.apprecipe.model.domain.Recipe;
import br.edu.infnet.apprecipe.model.domain.Spice;
import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.RecipeWithoutChefException;
import br.edu.infnet.apprecipe.model.exceptions.RecipeWithoutIngredientsException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class RecipeTest {

	public static void main(String[] args) {
		
		List<Ingredient> ingredients1 = new ArrayList<Ingredient>();
		List<Ingredient> ingredients2 = new ArrayList<Ingredient>();
		List<Ingredient> ingredients3 = new ArrayList<Ingredient>();
		List<Ingredient> ingredients4 = new ArrayList<Ingredient>();
		
		try {
			Spice sp1 = new Spice("Páprica", 0.1f, 1, "Avermelhado");
			sp1.setSpiceForm("Moído");
			sp1.setTaste("Agridoce");
			
			ingredients2.add(sp1);
			ingredients4.add(sp1);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
			
		try {
			Spice sp2 = new Spice("Pimenta do reino", 0.15f, 0.5f, "Incolor");
			sp2.setSpiceForm("Moído");
			sp2.setTaste("Apimentado");
			
			ingredients1.add(sp2);
			ingredients2.add(sp2);
			ingredients3.add(sp2);
			ingredients4.add(sp2);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
			
		try {
			Spice sp3 = new Spice("Aniz estrelado", 0.20f, 1, "Incolor");
			sp3.setSpiceForm("Fresco");
			sp3.setTaste("Azedo");
			
			ingredients1.add(sp3);
			ingredients3.add(sp3);
			ingredients4.add(sp3);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb1;
			pb1 = new PlantBased("Alho poró", 0.2f, 20, false);
			pb1.setForm("Cru");
			pb1.setUnit("Maço");
			
			ingredients4.add(pb1);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb2 = new PlantBased("Brócolis", 1, 15, true);
			pb2.setForm("Cru");
			pb2.setUnit("Maço");
			
			ingredients1.add(pb2);
			ingredients4.add(pb2);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			PlantBased pb3 = new PlantBased("Batata", 1.5f, 10, false);
			pb3.setForm("Pré-cozido");
			pb3.setUnit("Kilo");
			
			ingredients2.add(pb3);
			ingredients4.add(pb3);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab1;
			ab1 = new AnimalBased("Salmão", 2, 20, false);
			ab1.setOrigin("Pesca");
			ab1.setMeatForm("Fresco");
			
			ingredients4.add(ab1);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab2 = new AnimalBased("Javali", 2, 30, true);
			ab2.setOrigin("Caça");
			ab2.setMeatForm("Congelado");
			
			ingredients1.add(ab2);
			ingredients4.add(ab2);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			AnimalBased ab3 = new AnimalBased("Wagyu", 1, 200, false);
			ab3.setOrigin("Manejo");
			ab3.setMeatForm("Refrigerado");
			
			ingredients1.add(ab3);
			ingredients2.add(ab3);
			ingredients3.add(ab3);
			ingredients4.add(ab3);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Recipe r1 = new Recipe(new Chef("Joao", "Almeria", "joao.almeria@email.com"), ingredients1);
			r1.setName("Primeira receita");
			r1.setQuantity(3);
			r1.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Recipe r2 = new Recipe(new Chef("Maria", "Cantucci Osteria", "maria@email.com"), ingredients2);
			r2.setName("Segunda receita");
			r2.setQuantity(4);
			r2.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Recipe r3 = new Recipe(new Chef("Manel", "Quanto Café", "manel@email.com"), ingredients3);
			r3.setName("Terceira receita");
			r3.setQuantity(1);
			r3.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Recipe r4 = new Recipe(new Chef("Francisco", "Pizza Dominos", "chico.bala@email.com"),ingredients4);
			r4.setName("Quarta receita");
			r4.setQuantity(1);
			r4.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Recipe r5 = new Recipe(null,ingredients4);
			r5.setName("Quarta receita");
			r5.setQuantity(1);
			r5.printReport();
		} catch (RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Chef s6 = new Chef("Francisco", "Pizza Dominos", "chico.bala@email.com");
			
			Recipe r6 = new Recipe(s6, null);
			r6.setName("Quarta receita");
			r6.setQuantity(1);
			r6.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
