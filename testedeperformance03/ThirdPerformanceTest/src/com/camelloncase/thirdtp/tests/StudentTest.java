package com.camelloncase.thirdtp.tests;

import com.camelloncase.thirdtp.domain.Student;
import com.camelloncase.thirdtp.exceptions.FullNameException;
import com.camelloncase.thirdtp.exceptions.GradeException;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		try {
			s1.setName("Maria silva pereira");
			s1.setFirstGrade(8);
			s1.setSecondGrade(8);
			s1.checkState();
		} catch (FullNameException | GradeException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		Student s2;
		try {
			s2 = new Student("Francisco", 2, 5);
			s2.checkState();
		} catch (GradeException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		Student s3 = new Student();
		try {
			s3.setFirstGrade(10);
			s3.checkState();
		} catch (GradeException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
	}
}
