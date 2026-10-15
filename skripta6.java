package zz;

public class skripta6 {

	public static void niz ( int[][] matrica) {
		
		int n = matrica.length;
		int[] dijagonala = new int [n];
		int[] vrsta = new int [n];
		int b = matrica[0].length;
		for(int i = 0 ; i < matrica.length; i ++) {
			dijagonala[i] = matrica[i][n-1-i];
		}
		for(int j = 0 ; j < n ; j++) {
		
			vrsta[j] = matrica[n-1] [j];
		
		}
		int [] nova = new int [n];
	for ( int i = 0 ; i <dijagonala.length; i++) {
		
			nova[i]= dijagonala[i]+vrsta[i];
		
	}
	
	System.out.println("Niz suprotne dijagonale je ");
	for(int i = 0 ; i < dijagonala.length; i ++) {
		System.out.print(dijagonala[i] + " ");
	}
	System.out.println("Zbir Poslednje vrste je "  );
	for( int i = 0 ; i < vrsta.length; i ++) {
		System.out.print(vrsta[i] + " ");
	}
	 System.out.println("zbir ova dva niza je ");
	for( int i = 0 ; i < nova.length; i ++) {
		System.out.print(nova[i] + " ");
	}
	}
	
	
	
	public static void main(String[] args) {
		
		int [][] matrica = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				
				
		};
		
		niz(matrica);
	}

}
