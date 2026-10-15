package zz;

public class zadatak1 {

	public static int [] zbir( int[][] matrica) {
		
		int n = matrica.length;
		int[] dijagonala = new int[n];
		int [] poslednja=new int [n];
		int[] zbir = new int[n];
		
		
		for( int i = 0 ; i < matrica.length; i ++) {
			dijagonala[i] = matrica[i][n-1-i];
		}
		
			for(int j =0 ; j < matrica[0].length; j++) {
				poslednja[j]= matrica[n-1][j]; 
			
		}
			for(int i = 0 ; i < n ; i ++) {
				zbir[i] = dijagonala[i] + poslednja[i];
			}
			return zbir;
		
	}
	
	
	public static void main(String[] args) {
		
		int[][] matrica = {
				{1,2,3},
				{1,2,3},
				{1,2,3},
		};
		int [] niz = zbir(matrica);
		System.out.println("Novi niz zbira je : ");
		for( int broj : niz) {
			System.out.print(broj + " ");
		}
		
	}

}
