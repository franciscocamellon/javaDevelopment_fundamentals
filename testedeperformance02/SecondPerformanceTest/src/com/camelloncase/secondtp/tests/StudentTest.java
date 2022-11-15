package com.camelloncase.secondtp.tests;

import com.camelloncase.secondtp.domain.Student;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Maria");
		s1.setFirstGrade(8);
		s1.setSecondGrade(8);
		s1.checkState();
		
		Student s2 = new Student("Francisco", 6, 5);
		s2.checkState();
		
		Student s3 = new Student();
		s3.setFirstGrade(10);
		s3.checkState();

	}

}
