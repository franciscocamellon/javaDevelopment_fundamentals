package com.camelloncase.thirdtp.domain;

import com.camelloncase.thirdtp.auxiliar.Constants;
import com.camelloncase.thirdtp.exceptions.FullNameException;

public class Person {
	
	private String name;
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Person() {
		this.name = Constants.DEFAULT_NAME;
	}
	
	public Person(String name) {
		this();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.middleName + " " + this.lastName;
	}
	
	public void checkState() {
		System.out.println(toString());
	}
	
	public void checkState(int id) {
		System.out.println("<" + id + "> " + toString());
	}
	
	public String getName() throws FullNameException {
		
		if (firstName == null || middleName == null || lastName == null) {
			throw new FullNameException("O preenchimento do campo nome esta incorreto!");
		}
		
		StringBuilder fullName = new StringBuilder();
		fullName.append(lastName.toUpperCase());
		fullName.append(", ");
		fullName.append(firstName.toUpperCase());
		fullName.append(" ");
		fullName.append(middleName.toLowerCase());
		fullName.append(".");
				
		return fullName.toString();
	}
	
	public void setName(String name) throws FullNameException {
		
		if (name == null) {
			throw new FullNameException("Um nome deve ser informado!");
		}
		
		int posInicial = name.indexOf(" ");
		int posFinal = name.lastIndexOf(" ");
		
		if (posInicial < 0 || posFinal < 0) {
			throw new FullNameException("O preenchimento do campo nome esta incorreto!");
		}
		
		this.firstName = name.substring(0, posInicial);
		this.middleName = name.substring(posInicial, posFinal).trim();
		this.lastName = name.substring(posFinal).trim();
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
