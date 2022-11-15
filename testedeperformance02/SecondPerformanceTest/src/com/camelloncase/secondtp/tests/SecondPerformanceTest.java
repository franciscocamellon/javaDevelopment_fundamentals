package com.camelloncase.secondtp.tests;

import java.util.Scanner;

import com.camelloncase.secondtp.auxiliar.Constants;
import com.camelloncase.secondtp.domain.Student;

public class SecondPerformanceTest {

	private static Student[] students;

    private static void printReport() {		
		for (int i = 0; i < Constants.LIMIT; i++) {
			if(students[i] != null) {
				students[i].printReport(i);
			}
		}
	}
    
    private static void printReport(int id) {		
		students[id].printReport(id);
	}
	
	public static void main(String[] args) {
		
		students = new Student[Constants.LIMIT];

        Scanner in = new Scanner(System.in);

        String userOption;
		int indexPosition = 0;

        do {
			System.out.println("[1] Registrar as notas de um novo aluno.");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair.");
			
			System.out.print("Informe a opção desejada: ");						
			userOption = in.next();
			
			switch (userOption) {
			case "1":
				
				Student student = new Student();
				
				if(indexPosition < Constants.LIMIT) {
					System.out.print("Informe o nome do aluno: ");	
					student.setName(in.next());
	
					System.out.print("Informe a nota da AV1: ");	
					student.setFirstGrade(in.nextFloat());
	
					System.out.print("Informe a nota da AV2: ");	
					student.setSecondGrade(in.nextFloat());
					
					student.print();
					
					students[indexPosition] = student;

					indexPosition++;

				} else {
					System.out.println("Limite de alunos cadastrados atingido! Impossível cadastrar um novo aluno.");
				}
				break;

			case "2":
				System.out.print("Informe o código do aluno para exibição do boletim: ");						
				int id = in.nextInt();

				if(id >= 0 && id < indexPosition) {
					printReport(id);
				} else {
					System.out.println("O código ["+id+"] é inválido!!!");
				}
				break;

			case "3":
				printReport();
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