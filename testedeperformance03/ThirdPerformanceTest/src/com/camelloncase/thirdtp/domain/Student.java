package com.camelloncase.thirdtp.domain;

import com.camelloncase.thirdtp.auxiliar.Constants;
import com.camelloncase.thirdtp.exceptions.GradeException;

public class Student extends Person {

	private float firstGrade;
	private float secondGrade;
	
	public Student() {
		super();
		this.firstGrade = Constants.DEFAULT_GRADE;
		this.secondGrade = Constants.DEFAULT_GRADE;
	}
	
	public Student(String name, float firstGrade, float secondGrade) throws GradeException {
		super(name);
		setFirstGrade(firstGrade);
		setSecondGrade(secondGrade);
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + firstGrade + " - " + secondGrade + " - " + calculateAverageGrade() + " - " + getStudentStatus();
	}
	
	public float calculateAverageGrade(){
		return (this.firstGrade + this.secondGrade) / 2;
	}
	
	public String getStudentStatus() {
		
		float averageGrade = calculateAverageGrade();
		
		if(averageGrade < Constants.LOWER_LIMIT_GRADE) {
			return Constants.FAILED_STUDENT;
			
		} else if(averageGrade > Constants.UPPER_LIMIT_GRADE) {
			return Constants.APPROVED_STUDENT;
			
		} else {
			return Constants.RETAKE_TEST;
		}	
	}
	
	public void checkState() {
		System.out.println(toString());
	}
	
	public void checkState(int id) {
		System.out.println("\n<" + id + "> " + toString() + "\n");
	}

	public void setFirstGrade(float grade) throws GradeException {
		if (grade > 10 || grade < 0) {
			throw new GradeException("A nota não pode ser menor que zero ou maior que 10!");
		} else {
			this.firstGrade = grade;
		}
	}
	
	public float getFirstGrade() {
		return firstGrade;
		
	}

	public void setSecondGrade(float grade) throws GradeException {
		if (grade > 10 || grade < 0) {
			throw new GradeException("A nota não pode ser menor que zero ou maior que 10!");
		} else {
			this.secondGrade = grade;
		}		
	}
	
	public float getSecondGrade() {
		return secondGrade;
		
	}
}
