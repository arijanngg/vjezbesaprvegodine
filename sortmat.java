package zz;

public class sortmat {

	public static void matrica ( int [][] matrica) {
		
		for( int j = 0 ; j < matrica[0].length; j ++) {
			for( int i = 0 ; i <matrica.length-1; i ++) {
				int najmanji = i;
				for(int k = i +1 ; k<matrica.length;  k ++) {
					if( matrica [k][j] <matrica[najmanji][j]) {
						najmanji = k ;
					}
					
				}
				int temp = matrica[i][j];
				matrica[i][j]= matrica[najmanji][j];
				matrica[najmanji][j] = temp;
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int [][] matrica = {
				
				{1,2,3,4},
				{5,3,36,1},
				{2,5,1,6},
				
		};
		matrica(matrica);
		System.out.println("Sortirana matrica je : ");

		for( int i = 0 ; i < matrica.length ; i ++) {
			for ( int j = 0 ; j < matrica[0].length; j++) {
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
