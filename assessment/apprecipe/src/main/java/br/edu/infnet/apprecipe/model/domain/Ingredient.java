package br.edu.infnet.apprecipe.model.domain;

import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public abstract class Ingredient {
	
	private String name;
	private float weight;
	private float cost;
	
	public Ingredient(String name, float weight, float cost) throws ZeroCostException {
		
		if (cost == 0) {
			throw new ZeroCostException("O custo do produto está zerado!");
		}
		
		if (cost < 0) {
			throw new ZeroCostException("O custo do produto está negativo!");
		}
		
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
