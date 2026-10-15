package zz;

public class zbirelemenata {

	public static int zbir (int[][] matrica) {
		int zbir = 0;
		int n = matrica.length;
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j++) {
			
			if(matrica[i][j] < matrica[i][n-1-i]) {
				zbir+= matrica[i][j];
			}
		}
		
		}
		return zbir;
	}
	
	public static void main(String[] args) {
		int [][]matrica = {
				
				{1,2,3},
				{1,2,3},
				{1,2,3},
				
		};
		int rezultat = zbir(matrica);
		System.out.println("Zbir brojeva ispod glavne dijagonale je " + rezultat);
	} 

}
