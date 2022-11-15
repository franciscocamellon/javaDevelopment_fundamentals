package com.camelloncase.secondtp.domain;

import com.camelloncase.secondtp.auxiliar.Constants;

public class Student extends Person {

	private float firstGrade;
	private float secondGrade;
	
	public Student() {
		super();
		this.firstGrade = Constants.DEFAULT_GRADE;
		this.secondGrade = Constants.DEFAULT_GRADE;
	}
	
	public Student(String name, float firstGrade, float secondGrade) {
		super.setName(name);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
	}
	
	@Override
	public String toString() {
		return super.getName() + " - " + firstGrade + " - " + secondGrade + " - " + calculateAverageGrade() + " - " + getStudentStatus();
	}
	
	public float calculateAverageGrade(){
		return (this.firstGrade + this.secondGrade) / 2;
	}
	
	public String getStudentStatus(){
		
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

	public void setFirstGrade(float grade) {
		this.firstGrade = grade;
		
	}
	
	public float getFirstGrade() {
		return firstGrade;
		
	}

	public void setSecondGrade(float grade) {
		this.secondGrade = grade;
		
	}
	
	public float getSecondGrade() {
		return secondGrade;
		
	}
}
