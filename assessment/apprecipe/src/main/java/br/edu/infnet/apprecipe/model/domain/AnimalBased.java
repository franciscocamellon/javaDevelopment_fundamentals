package br.edu.infnet.apprecipe.model.domain;

import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class AnimalBased extends Ingredient {

	private String origin;
	private String meatForm;
	private boolean exoticMeat;
	
	public AnimalBased(String name, float weight, float cost, boolean exoticMeat) throws ZeroCostException, NullOrEmptyAttributeException {
		super(name, weight, cost);
		this.exoticMeat = exoticMeat;
	}

	@Override
	public float costCalculator() {
		if (exoticMeat) {
			return this.getCost() * this.getWeight() + 10;
		}
		return this.getCost() * this.getWeight();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(origin);
		sb.append(";");
		sb.append(meatForm);
		sb.append(";");
		sb.append(exoticMeat ? "Proteína exótica" : "Proteína normal");
		
		return sb.toString();
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getMeatForm() {
		return meatForm;
	}
	
	public void setMeatForm(String meatForm) {
		this.meatForm = meatForm;
	}

	public boolean isExoticMeat() {
		return exoticMeat;
	}

	public void setExoticMeat(boolean exoticMeat) {
		this.exoticMeat = exoticMeat;
	}
}
