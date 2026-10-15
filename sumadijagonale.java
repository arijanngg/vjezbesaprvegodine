package predavnjazavrsni;

public class sumadijagonale {
	public static int sumaelemenata (int [][] A) {
		int brkolona = A[0].length;
		int brvrsta = A.length;
		int suma = 0 ; 
		for (int i = 0 ; i < brvrsta; i ++) {
			for ( int j = 0 ; j < brkolona;j++) {
				if ( i== j) {
				suma += A[i][j];
				}
			}

		}
		return suma;
	}
	
	public static void main(String[] args) {
	
		int [][] A = new int [4][3];
		int [][] B = {{1,2,2}, {4,3,1}, {7,2,1}, {2,3,3}};
		
		
		int suma = sumaelemenata(B);
		System.out.println("Suma je " + suma);
		
	}

}

