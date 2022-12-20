package br.edu.infnet.apprecipe.model.domain;

public abstract class Ingredient {
	
	private String name;
	private double weight;
	private double cost;
	
	public Ingredient(String name, double weight, double cost) {
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}
	
	public abstract double costCalculator();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(";");
		sb.append(weight);
		sb.append(";");
		sb.append(cost);
		
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getWeight() {
		return weight;
	}
	
}
