package com.camelloncase.secondtp.tests;

import com.camelloncase.secondtp.domain.Student;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Francisco");
		s1.setFirstGrade(41);
		s1.setSecondGrade(1000);
		s1.print();
		
		Student s2 = new Student("Francisco", 10, 10);
		s2.print();

	}

}
