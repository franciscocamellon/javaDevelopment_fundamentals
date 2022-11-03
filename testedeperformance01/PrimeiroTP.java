
public class PrimeiroTP {

	private static String[] studentNames;
	private static float[] firstGrade;
	private static float[] secondGrade;

	private static final int LIMIT = 100; 	

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
		
	}
}