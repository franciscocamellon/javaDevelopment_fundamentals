package com.camelloncase.thirdtp.tests;

import java.util.Scanner;

import com.camelloncase.thirdtp.auxiliar.Constants;
import com.camelloncase.thirdtp.domain.Person;
import com.camelloncase.thirdtp.domain.Student;
import com.camelloncase.thirdtp.domain.Teacher;

public class SecondPerformanceTest {

	private static Person[] people;
    
    private static void printReport(int id) {
    	System.out.println("");
    	people[id].checkState(id);
    }    
	
	public static void main(String[] args) {
		
		people = new Person[Constants.LIMIT];

        Scanner in = new Scanner(System.in);

        String userOption;
		int indexPosition = 0;

        do {
        	
        	System.out.println("[1] Cadastrar professor.");
    		System.out.println("[2] Cadastrar aluno.");
    		System.out.println("[3] Consultar situa��o de um docente/discente.");
    		System.out.println("[4] Sair.");
    		System.out.println("");
    		System.out.print("Informe a op��o desejada: ");
        	
			userOption = in.next();
			
			switch (userOption) {
			
			case "1":
				
				Teacher teacher = new Teacher();
				
				if(indexPosition < Constants.LIMIT) {
					
					System.out.print("Informe o nome do professor: ");	
					teacher.setName(in.next());
	
					System.out.print("Informe a serie: ");	
					teacher.setClassroom(in.next());
	
					System.out.print("Informe a materia lecionada: ");	
					teacher.setSubject(in.next());
					
					System.out.print("Informe se est� de f�rias: ");	
					teacher.setVacation(in.nextBoolean());
					
					people[indexPosition] = teacher;
					
					people[indexPosition].checkState(indexPosition);

					indexPosition++;

				} else {
					
					System.out.println("Limite de professores cadastrados atingido! Imposs�vel cadastrar um novo aluno.");
				}
				break;

			case "2":
				
				Student student = new Student();
				
				if(indexPosition < Constants.LIMIT) {
					
					System.out.print("Informe o nome do aluno: ");	
					student.setName(in.next());
	
					System.out.print("Informe a nota da AV1: ");	
					student.setFirstGrade(in.nextFloat());
	
					System.out.print("Informe a nota da AV2: ");	
					student.setSecondGrade(in.nextFloat());
					
					people[indexPosition] = student;
					
					people[indexPosition].checkState(indexPosition);

					indexPosition++;

				} else {
					
					System.out.println("Limite de alunos cadastrados atingido! Imposs�vel cadastrar um novo aluno.");
				}
				break;

			case "3":				
				
				System.out.print("Informe o c�digo do docente/discente para exibi��o da situa��o: ");						
				int id = in.nextInt();

				if(id >= 0 && id < indexPosition) {
					
					printReport(id);
					
				} else {
					
					System.out.println("O c�digo ["+id+"] � inv�lido!!!");
				}
				
				break;

			case "4":
				
				System.out.println("Sa�da");
				
				break;

			default:
				
				System.out.println("A op��o ["+userOption+"] � inv�lida");
				
				break;
			}
			
		} while (!"4".equalsIgnoreCase(userOption));
				
		System.out.println("Processamento finalizado!!!");
		
		in.close();
		
	}
}