package projetao;

public class ExercicioAula19 {

	public static void main(String[] args) {
		int[] A = new int [5];
		int[] B = new int [5];
		
		A[0] = 6;
		A[1] = 7;
		A[2] = 8;
		A[3] = 9;
		A[4] = 10;
		
		B[0] = A[0];
		B[1] = A[1];
		B[2] = A[2];
		B[3] = A[3];
		B[4] = A[4];
		
		for(int cont = 0; cont < 5; cont++) {
			System.out.println(B[cont]);
		}
		
		

	}

}
