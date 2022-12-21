package br.edu.infnet.apprecipe.model.domain;

import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;

public class Chef {
	
	public String name;
	public String restaurant;
	public String email;
	
	
	public Chef(String name, String restaurant, String email) throws NullOrEmptyAttributeException {
		
		if (name == null || name.isBlank()) {
			throw new NullOrEmptyAttributeException("O nome do chef deve ser preenchido!");
		}
		
		if (restaurant == null || restaurant.isBlank()) {
			throw new NullOrEmptyAttributeException("O nome do restaurante deve ser preenchido!");
		}
		
		if (email == null || email.isBlank()) {
			throw new NullOrEmptyAttributeException("O email do chef deve ser preenchido!");
		}
		
		this.name = name;
		this.restaurant = restaurant;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(";");
		sb.append(restaurant);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public String getName() {
		return name;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public String getEmail() {
		return email;
	}

}
