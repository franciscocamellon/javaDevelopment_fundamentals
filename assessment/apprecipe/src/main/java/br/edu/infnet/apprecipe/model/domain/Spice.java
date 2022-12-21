package br.edu.infnet.apprecipe.model.domain;

import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipe.model.exceptions.ZeroCostException;

public class Spice extends Ingredient {
	
	private String spiceForm;
	private String taste;
	private String color;

	public Spice(String name, float weight, float cost, String color) throws ZeroCostException, NullOrEmptyAttributeException {
		super(name, weight, cost);
		this.color = color;
	}

	@Override
	public float costCalculator() {
		return this.getWeight() * this.getCost();
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(spiceForm);
		sb.append(";");
		sb.append(taste);
		sb.append(";");
		sb.append(color);
		
		return sb.toString();
	}

	public String getSpiceForm() {
		return spiceForm;
	}

	public void setSpiceForm(String spiceForm) {
		this.spiceForm = spiceForm;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
