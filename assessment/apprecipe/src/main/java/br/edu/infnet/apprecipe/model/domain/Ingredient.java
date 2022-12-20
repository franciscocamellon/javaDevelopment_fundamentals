package br.edu.infnet.apprecipe.model.domain;

public abstract class Ingredient {
	
	private String name;
	private float weight;
	private float cost;
	
	public Ingredient(String name, float weight, float cost) {
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}
	
	public abstract float costCalculator();
	
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

	public float getCost() {
		return cost;
	}

	public float getWeight() {
		return weight;
	}
	
}
