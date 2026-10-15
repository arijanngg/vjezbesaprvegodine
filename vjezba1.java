package predavnjazavrsni;

public class vjezba1 {
	
	public static void print (int [][] A) {
		int brkolona = A[0].length;
		int brvrsta = A.length;
		for (int i = 0 ; i < brvrsta; i ++) {
			for ( int j = 0 ; j < brkolona;j++) {
				
				System.out.print(A[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
	
		int [][] A = new int [4][3];
		int [][] B = {{1,2,2}, {4,3,1}, {7,2,1}, {2,3,3}};
		
		print (B);
		
	}

}
