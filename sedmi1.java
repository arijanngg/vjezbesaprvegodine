package matrice2;

public class sedmi1 {

	public static int [][] mnozi ( int[][] A, int [][] B){
		
		int redA= A.length;
		int kolA = A[0].length;
		int kolB = B[0].length;
		
		
		int [][] C = new int [redA][kolB];
		
		for (int i = 0 ; i < redA ; i ++) {
			for (int j = 0 ; j < kolB; j ++) {
				int suma = 0;
				
				for (int k = 0; k <kolA; k ++) {
					suma += A[i][k] * B[k][j];
				}
				C[i][j] = suma ;
				
			}
		}
		return C;
	}
	
	
	
	public static void main(String[] args) {

		int [][] A = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
		};
		
		int [][] B = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
		};
		
		int [][] C = mnozi (A,B);
		
		System.out.println("Rezultat mnozenja je ");
		 for (int i = 0 ; i < C.length; i ++) {
			 for (int j = 0 ; j < C[0].length; j ++) {
				 System.out.print(C[i][j] + " ");
				 
			 }
			 System.out.println();
		 }
		
	}

}
