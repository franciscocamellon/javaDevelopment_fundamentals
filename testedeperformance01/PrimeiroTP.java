import java.util.Scanner;

public class PrimeiroTP {

	private static String[] studentNames;
	private static float[] firstGrade;
	private static float[] secondGrade;

	private static final int LIMIT = 100; 	

    private static void printReport() {		
		for (int i = 0; i < LIMIT; i++) {
			if(studentNames[i] != null) {
				printReport(i);
			}
		}
	}

	private static void printReport(int indice) {
		float averageGrade = calculateAverageGrade(indice);
		
		System.out.println("<"+indice+"> " + 
							studentNames[indice] + " -- " + 
							"AV1: " + firstGrade[indice] + " -- " + 
							"AV2: " + secondGrade[indice] + " -- " + 
							"Média: " + averageGrade + " -- " +
							"Situação: " + getStudentStatus(averageGrade)
							);
	}

    private static float calculateAverageGrade(int indice){
		return (firstGrade[indice] + secondGrade[indice]) / 2;
	}
	
	private static String getStudentStatus(float sl){	
		if(sl < 4) {
			return "Reprovado";
		} else if(sl >= 4 || sl < 7) {
			return "Prova Final";
		}			
		return "Aprovado";
	}	

	public static void main(String[] args) {
		studentNames = new String[LIMIT];
		firstGrade = new float[LIMIT];
		secondGrade = new float[LIMIT];

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
				if(indexPosition < LIMIT) {
					System.out.print("Informe o nome do aluno: ");	
					studentNames[indexPosition] = in.next();
	
					System.out.print("Informe a nota da AV1: ");	
					firstGrade[indexPosition] = in.nextFloat();
	
					System.out.print("Informe a nota da AV2: ");	
					secondGrade[indexPosition] = in.nextFloat();
					
					printReport(indexPosition);

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