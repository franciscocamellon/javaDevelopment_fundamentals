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
    		System.out.println("[3] Consultar situação de um docente/discente.");
    		System.out.println("[4] Sair.");
    		System.out.println("");
    		System.out.print("Informe a opção desejada: ");
        	
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
					
					System.out.print("Informe se está de férias: ");	
					teacher.setVacation(in.nextBoolean());
					
					people[indexPosition] = teacher;
					
					people[indexPosition].checkState(indexPosition);

					indexPosition++;

				} else {
					
					System.out.println("Limite de professores cadastrados atingido! Impossível cadastrar um novo aluno.");
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
					
					System.out.println("Limite de alunos cadastrados atingido! Impossível cadastrar um novo aluno.");
				}
				break;

			case "3":				
				
				System.out.print("Informe o código do docente/discente para exibição da situação: ");						
				int id = in.nextInt();

				if(id >= 0 && id < indexPosition) {
					
					printReport(id);
					
				} else {
					
					System.out.println("O código ["+id+"] é inválido!!!");
				}
				
				break;

			case "4":
				
				System.out.println("Saída");
				
				break;

			default:
				
				System.out.println("A opção ["+userOption+"] é inválida");
				
				break;
			}
			
		} while (!"4".equalsIgnoreCase(userOption));
				
		System.out.println("Processamento finalizado!!!");
		
		in.close();
		
	}
}