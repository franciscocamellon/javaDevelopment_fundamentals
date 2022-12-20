package br.edu.infnet.apprecipe.model.domain;

public class Chef {
	
	public String name;
	public String restaurant;
	public String email;
	
	
	public Chef(String name, String restaurant, String email) {
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
