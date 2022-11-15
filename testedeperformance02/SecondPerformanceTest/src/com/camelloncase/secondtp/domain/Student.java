package com.camelloncase.secondtp.domain;

import com.camelloncase.secondtp.auxiliar.Constants;

public class Student {
	
	private String name;
	private float firstGrade;
	private float secondGrade;
	
	public Student() {
		this.name = Constants.DEFAULT_NAME;
		this.firstGrade = Constants.DEFAULT_GRADE;
		this.secondGrade = Constants.DEFAULT_GRADE;
	}
	
	public Student(String name, float firstGrade, float secondGrade) {
		this.name = name;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
	}
	
	@Override
	public String toString() {
		return name + " - " + firstGrade + " - " + secondGrade + " - " + calculateAverageGrade() + " - " + getStudentStatus();
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

	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
		
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
	
	public void print() {
		System.out.println(toString());
	}
	
	public void printReport(int indice) {
		System.out.println("<" + indice + "> " + toString());
	}

    


}
