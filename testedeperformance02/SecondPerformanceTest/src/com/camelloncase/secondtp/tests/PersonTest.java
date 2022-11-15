package com.camelloncase.secondtp.tests;

import com.camelloncase.secondtp.domain.Person;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.checkState();
		
		Person p2 = new Person();
		p2.setName("Joao");
		p2.checkState();
		
		Person p3 = new Person("Francisco");
		p3.checkState();
		
	}
}
