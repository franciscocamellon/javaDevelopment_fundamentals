package com.camelloncase.thirdtp.tests;

import com.camelloncase.thirdtp.domain.Person;
import com.camelloncase.thirdtp.exceptions.FullNameException;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.checkState();
		
		Person p2 = new Person();
		try {
			p2.setName("Joao");
			p2.checkState();
		} catch (FullNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Person p3 = new Person("Francisco");
		p3.checkState();
		
	}
}
