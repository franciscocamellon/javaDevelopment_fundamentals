package com.camelloncase.thirdtp.domain;

import com.camelloncase.thirdtp.auxiliar.Constants;

public class Person {
	
	private String name;
	
	public Person() {
		this.name = Constants.DEFAULT_NAME;
	}
	
	public Person(String name) {
		this();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public void checkState() {
		System.out.println(toString());
	}
	
	public void checkState(int id) {
		System.out.println("<" + id + "> " + toString());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
