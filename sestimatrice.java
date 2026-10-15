package zz;

public class sestimatrice {
	
	public static int[] niz(int[][]matrica) {
		
		int[] niz = new int [matrica.length];
		
		for(int i = 0 ; i < matrica.length; i ++) {
	   niz[i] = matrica[i][i];
		}
		return niz;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int [][] matrica = {
				{4,2,3,4},
				{1,4,3,4},
				{1,2,4,4},
				{1,2,3,4},
				
				
				
		};
		int[] dijagonala = niz(matrica);
		
		
		System.out.println("Dijagonala je ");
		for(int broj : dijagonala) {
			System.out.println(broj + " ");
		}
		
	}

}
