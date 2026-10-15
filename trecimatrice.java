package zz;

public class trecimatrice {

	public static void transponovanje ( int [][] matrica) {
		
		int redovi = matrica.length; 
		int kolone = matrica[0].length;
		
		int [][] transponovana = new int [kolone][redovi];
		
		
		for ( int i = 0 ; i < redovi; i ++) {
			for (int j = 0 ; j < kolone; j ++) {
				transponovana[j][i] = matrica[i][j];
				
				
			}
		}

		System.out.println("transponovana matrica je ");
		for( int i = 0 ; i<transponovana.length; i ++) {
			for ( int j =0 ; j < transponovana[0].length; j ++) {
				System.out.print(transponovana[i][j] + " ");
				
			}
			System.out.println();
		}		
	}
	
	
	
	public static void main(String[] args) {
		
		int [][] matrica = {
	
		{1,2,3,4},
		{1,2,3,4},
		{1,2,3,4},
		
		};
		
		transponovanje (matrica);
		
	}

}
