package zz;

public class drugimatrica {

	public static int zbir ( int[][] matrica) {
		int zbir = 0 ;
		for( int i = 0 ; i < matrica.length; i++) {
			for ( int j = 0 ; j < matrica[0].length; j ++) {
				zbir += matrica[i][j];
			}
		}
		return zbir;
		
		
	}
	
	public static void main(String[] args) {
		
		int[][] matrica = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
		};
		int sabirak = zbir (matrica);
		System.out.println("Zbir elemenata matrice je : " + sabirak);
		
	}

}
