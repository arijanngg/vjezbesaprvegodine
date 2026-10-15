package predavnjazavrsni;

public class zadataknacasu {
	public static void print (int [][] A) {
		int brkolona = A[0].length;
		int brvrsta = A.length;
		for (int i = 0 ; i < brvrsta; i ++) {
			for ( int j = 0 ; j < brkolona;j++) {
				
				System.out.printf("%8d", A[i][j] );
				
			}
			System.out.println();
		}
		
		
		
	}//napisati funkciju za transponovanje matrice
	
	public static int[][] transponuj(int [][] A){
		
		
			int brkolona = A[0].length;
			int brvrsta = A.length;
			int[][]	transponovana 	= new int [A[0].length][A.length];
			
			for (int i = 0 ; i < brvrsta; i ++) {
				for ( int j = 0 ; j < brkolona;j++) {
					transponovana[i][j] = A[j][i];
					}
				}
return transponovana;
			}

	
	//napisati funkciju za sabiranje dvije matrice
	public static int[][] saberi ( int[][] A, int[][]B){
		

		int brkolona = A[0].length;
		int brvrsta = A.length;
		int[][]	C= new int [A[0].length][A.length];
		
		for (int i = 0 ; i < brvrsta; i ++) {
			for ( int j = 0 ; j < brkolona;j++) {
		C[i][j] = A[i][j] + B[i][j];
			
			
			}
		}
		return C;
	}
	
	
	
	public static void main(String[] args) {
		
		int [][] A = {{1,2,2}, {4,3,1}, {7,2,1}, {2,3,3}};
		int [][] B = {{1,2,2}, {4,3,1}, {7,2,1}, {2,3,3}};
		
		print (A);
		print(saberi(A,B));
		
		
		
		
		
	}

}

