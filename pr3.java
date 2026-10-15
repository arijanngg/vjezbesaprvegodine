package zz;

public class pr3 {

	public static int[] niz ( int[][] matrica) {
		
		int red= matrica.length;
		
		
		int[] niz = new int [red];
		for(int i = 0 ; i < matrica.length; i ++) {
			niz[i] = matrica[i][i];
		}
		return niz;
		
	}
	
	public static void main(String[] args) {
		int [][] matrica = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
		};
		int[] niz = niz(matrica);
		
		System.out.println("Niz glavne dijagonale je : ");
		for(int broj : niz) {
			System.out.print(broj + " ");
		}
	}

}
