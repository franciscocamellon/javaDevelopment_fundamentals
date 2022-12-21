package br.edu.infnet.apprecipe.model.domain;

import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class PlantBased extends Ingredient {
	
	private boolean organic;
	private String form;
	private String unit;

	public PlantBased(String name, float weight, float cost, boolean organic) throws ZeroCostException, NullOrEmptyAttributeException {
		super(name, weight, cost);
		this.organic = organic;
	}

	@Override
	public float costCalculator() {
		if (organic) {
			return this.getCost() * this.getWeight() + 20;
		}
		return this.getCost() * this.getWeight();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(organic ? "Vegetal orgânico" : "Vegetal normal");
		sb.append(";");
		sb.append(form);
		sb.append(";");
		sb.append(unit);
		
		return sb.toString();
	}

	public boolean isOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
