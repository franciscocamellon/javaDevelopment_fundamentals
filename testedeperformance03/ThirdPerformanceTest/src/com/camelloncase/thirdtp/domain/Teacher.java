package com.camelloncase.thirdtp.domain;

import com.camelloncase.thirdtp.auxiliar.Constants;

public class Teacher extends Person {
	
	private String classroom;
	private String subject;
	private Boolean vacation;
	
	public Teacher() {
		super();
		this.setClassroom(Constants.DEFAULT_CLASSROOM);
		this.setSubject(Constants.DEFAULT_SUBJECT);
		this.setVacation(Constants.DEFAULT_VACATION);
	}
	
	public Teacher(String name) {
		super(name);
		this.setClassroom(Constants.DEFAULT_CLASSROOM);
		this.setSubject(Constants.DEFAULT_SUBJECT);
		this.setVacation(Constants.DEFAULT_VACATION);
	}
	
	public Teacher(String name, String classroom, String subject, Boolean vacation) {
		super(name);
		this.setClassroom(classroom);
		this.setSubject(subject);
		this.setVacation(vacation);
	}
	
	@Override
	public String toString() {
		return super.getName() + " - " + this.classroom + " - " + this.subject + " - " + getVacation();
	}
	
	public void checkState() {
		System.out.println(toString());
	}
	
	public void checkState(int id) {
		System.out.println("\n<" + id + "> " + toString() + "\n");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getVacation() {
		return this.vacation ? "De ferias" : "Lecionando";
	}

	public void setVacation(Boolean vacation) {
		this.vacation = vacation;
	}
	
}
