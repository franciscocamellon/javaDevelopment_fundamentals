package br.edu.infnet.apprecipe.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Recipe {
	
	private String name;
	private int quantity;
	private LocalDateTime requestDate;
	private Chef chef;
	private List<Ingredient> ingredients;
	
	public Recipe() {
		requestDate = LocalDateTime.now();
	}
	
	@Override
	public String toString() {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s,%s,%d,%s", name, chef, quantity, requestDate.format(format));
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

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public LocalDateTime getRequestDate() {
		return requestDate;
	}

}
