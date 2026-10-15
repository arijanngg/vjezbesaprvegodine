package zz;

public class pr {

	public static int[] niz ( int [][] matrica) {
		
		int n = matrica.length;
		int count = 0 ;
		for(int i =0 ; i < n ; i ++) {
			count += i;
			
		}
		int[] niz = new int [count];
		
		int k = 0;
		for (int i = 0 ; i < n ; i ++) {
			for (int j = 0; j < i ; j ++) {
				niz[k++] = matrica[i][j];
			}
		}
		return niz;
	}
	
	public static void main(String[] args) {
		int[][] matrica = {
				
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				
				
		};
		int[] niz = niz(matrica);
		
		System.out.println("Niz je : ");
		for ( int broj : niz) {
			System.out.print(broj + " ");
		}
		
	}

}
