package zz;

public class pr5 {
	
	public static int zbir (int[][] matrica) {
		
		int zbir = 0;
		int n = matrica.length;
		
		
		for( int i = 0 ; i < matrica.length; i ++) {
			int cifra = matrica[i][n-1-i];
			zbir += (cifra*cifra);
		}
		
		return zbir;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[][]matrica = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				
		};
		int zbirkvadrata = zbir(matrica);
		System.out.println("Zbir kvadrata na dijagonali je : " + zbirkvadrata);
	}

}
