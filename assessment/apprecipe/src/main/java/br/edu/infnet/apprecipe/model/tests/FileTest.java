package br.edu.infnet.apprecipe.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

public class FileTest {
	
	public static void main(String[] args) {
		
		try {
			
			String file = "recipes.txt";
			
			try {
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
				
				FileWriter fileWriter = new FileWriter("out_" + file);
				BufferedWriter writer = new BufferedWriter(fileWriter);
				
				String fileLine = reader.readLine();
				String[] fields = null;
				
				List<Ingredient> ingredients = new ArrayList<Ingredient>();
				Recipe recipe = null;
				AnimalBased animalBased = null;
				PlantBased plantBased = null;
				Spice spice = null;
				
				while (fileLine != null) {
					
					fields = fileLine.split(";");
					
					switch (fields[0]) {
					case "R":
						try {
							recipe = new Recipe(new Chef(fields[1], fields[2], fields[3]), ingredients);
							recipe.setName(fields[4]);
							recipe.setQuantity(Integer.valueOf(fields[5]));
						} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}
						break;
						
					case "A":
						try {
							animalBased = new AnimalBased(fields[1], Float.valueOf(fields[2]), Float.valueOf(fields[3]), Boolean.valueOf(fields[4]));
							animalBased.setOrigin(fields[5]);
							animalBased.setMeatForm(fields[6]);
							
							ingredients.add(animalBased);
							
						} catch (ZeroCostException | NullOrEmptyAttributeException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}
						break;
						
					case "P":
						try {
							plantBased = new PlantBased(fields[2], Float.valueOf(fields[2]), Float.valueOf(fields[3]), Boolean.valueOf(fields[4]));
							plantBased.setForm(fields[5]);
							plantBased.setUnit(fields[6]);
							
							ingredients.add(plantBased);
							
						} catch (ZeroCostException | NullOrEmptyAttributeException e) {
							System.out.println("[ERRO] " + e.getMessage());
						}
						break;
						
					case "S":
						try {
							spice = new Spice(fields[2], Float.valueOf(fields[2]), Float.valueOf(fields[3]), fields[4]);
							spice.setSpiceForm(fields[5]);
							spice.setTaste(fields[6]);
							
							ingredients.add(spice);
							
							} catch (ZeroCostException | NullOrEmptyAttributeException e) {
								System.out.println("[ERRO] " + e.getMessage());
							}
						break;

					default:
						System.out.println("Registro inválido!");
						break;
					}
					
					fileLine = reader.readLine();
					
				}
				
				writer.write(recipe.createFileLine());
				writer.close();
				
				reader.close();
				fileReader.close();
				
			} catch (IOException e) {
				System.out.println("[ERRO] " + e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado com sucesso!");
		}
	}
}
