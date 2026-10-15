package zz;

public class skripta6v2 {

	public static void niz(int[] visina, int[] tezina) {
		
		int n = visina.length;
		int m = tezina .length;
		int[][] matrica = new int [n][2];
		
		for (int i = 0 ; i < n; i ++) {
			matrica[i][0]= visina[i];
		}
		for (int i = 0 ; i < m; i ++) {
			matrica[i][1]= tezina[i];
		}
		int najveci = Integer.MIN_VALUE; 
		int indexnajveceg=0;
		for(int i = 0 ; i < matrica.length; i ++) {
			int zbir = matrica[i][0] + matrica[i][1];
			if (zbir >najveci ) {
				najveci = zbir;
				indexnajveceg= i;
			}
		}
		System.out.println("Nova matrica je ");
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
		}
		
		
		int najmanji = Integer.MAX_VALUE;
		int index = 0;
		for(int j = 0 ; j < matrica.length ; j ++) {
			int zbirnajmanjih = matrica[j][1]+matrica[j][0];
		if(zbirnajmanjih < najmanji) {
			najmanji = zbirnajmanjih;
			index = j ; 
		}
		}
		System.out.println("Najmanji odnos je na poziciji " + (index+1) + " iznosi : " + najmanji + " a najveci se nalazi na poziciji " + (indexnajveceg+1) + " i iznosi " + najveci);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] visina  = {1,2,3,4,5,6};
		int[] tezina = {1,2,3,4,5,6};
		
		niz(visina,tezina);

	}

}
