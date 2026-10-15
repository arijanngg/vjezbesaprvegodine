package zz;

public class pr7 {

	public static int [][] mnozenje ( int [][] a , int [][] b) {
		
		int redovi = a.length;
		int kolone = b[0].length;
		int kolb = b[0].length;
		int [][] matrica = new int[redovi][kolone];
		
		for( int i = 0 ; i < redovi ; i ++) {
			for( int j = 0 ; j < kolone; j ++) {
				for(int k = 0 ; k < kolb ; k ++) {
					matrica[i][j] += a[i][k] * b[k][j]; 
					
				}
			}
		}
		
		
		
		return matrica;
	}
	
	
	public static void main(String[] args) {
		int [][]a = {
				{1,2,3,4},
				{1,2,35,4},
				{1,2,3,4},
				{1,2,3,4},
		};

		int [][]b = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,5,4},
				{1,2,3,4},
		};

		int [][] matrica= mnozenje (a,b);
		
		System.out.println("Pomnozena matrica je : " );
		for( int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
