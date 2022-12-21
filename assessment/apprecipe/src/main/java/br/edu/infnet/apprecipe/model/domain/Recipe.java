package br.edu.infnet.apprecipe.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.apprecipe.model.exceptions.RecipeWithoutChefException;
import br.edu.infnet.apprecipe.model.exceptions.RecipeWithoutIngredientsException;

public class Recipe {
	
	private String name;
	private int quantity;
	private LocalDateTime requestDate;
	private Chef chef;
	private List<Ingredient> ingredients;
	
	public Recipe(Chef chef, List<Ingredient> ingredients) throws RecipeWithoutChefException, RecipeWithoutIngredientsException {
		
		if (chef == null) {
			throw new RecipeWithoutChefException("Não existe Chef associado a esta receita!");
		}
		
		if (ingredients == null) {
			throw new RecipeWithoutIngredientsException("Não existem ingredientes associados a esta receita!");
		}
		requestDate = LocalDateTime.now();
		this.chef = chef;
		this.ingredients = ingredients;
	}
	
	public void printReport() {
		System.out.println("Receita: " + this);
		System.out.println("Chef: " + chef);
		System.out.println("Qtde Ingredientes: " + ingredients.size());
		System.out.println("Ingredientes: ");
		for (Ingredient ingredient : ingredients) {
			System.out.println("- " + ingredient.getName());
		}
	}
	
	private float recipeTotalCostCalculator(List<Ingredient> ingredients) {
		
		float cost = 0;
		
		for (Ingredient ingredient : ingredients) {
			
			cost = cost + ingredient.costCalculator();
		}
		return cost;
	}
	
	public String createFileLine() {
		
		return "Receita: " + this.getName() + ";" + 
				"Restaurante: " + this.getChef().getRestaurant() + ";" + 
				"Chef requisitante: " + this.getChef().getName() + ";" + 
				"Qtde de ingredientes: " + this.getIngredients().size() + ";" + 
				"Custo da receita: R$" + this.recipeTotalCostCalculator(ingredients) + "\r\n";
	}
	
	@Override
	public String toString() {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s;%s;%s;%s", name, chef.getRestaurant(), "Qtde:" + quantity, requestDate.format(format));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Chef getChef() {
		return chef;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public LocalDateTime getRequestDate() {
		return requestDate;
	}

}
