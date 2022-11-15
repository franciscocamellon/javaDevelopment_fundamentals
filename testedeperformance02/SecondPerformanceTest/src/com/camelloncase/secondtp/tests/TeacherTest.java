package com.camelloncase.secondtp.tests;

import com.camelloncase.secondtp.domain.Teacher;

public class TeacherTest {
	
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setName("Francisco");
		t1.setClassroom("Segundo ano");
		t1.setSubject("Matematica");
		t1.setVacation(false);
		t1.checkState();
		
		Teacher t2 = new Teacher("Joao");
		t2.setClassroom("Quinto ano");
		t2.setSubject("Fundamentos de Java");
		t2.setVacation(true);
		t2.checkState();
		
		Teacher t3 = new Teacher("Rubens", "Terceiro ano", "Filosofia", false);
		t3.checkState();
		
	}
}
