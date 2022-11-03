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
		
	}
}