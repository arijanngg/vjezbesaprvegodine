package zz;

public class sort4 {

	public static void sort(int [] niz) {
		
		for(int i = 0 ; i < niz.length-1; i ++) {
			int najmanji= i;
			for(int j = i+1; j <niz.length; j ++) {
				if(niz[j] <niz[najmanji]) {
					najmanji=j;
				}
				
			}
			int temp = niz[i];
			niz[i]=niz[najmanji];
			niz[najmanji]=temp;
		}
	}
	
	public static void sortiranjematrice(int[][]matrica) {
		
		for(int i = 0 ; i < matrica.length; i ++) {
			sort(matrica[i]);
		}
		
		
	}
	public static void main(String[] args) {
		
		 int[][] matrica = {

		            {5, 2, 9, 1},
		            {8, 3, 7, 4},
		            {6, 0, 2, 3}
		        };
		 
		 sortiranjematrice(matrica);
		 
		 System.out.println("Sortirana matrica je :");
		 for(int i = 0 ; i < matrica.length; i ++) {
			 for(int j = 0 ; j < matrica[0].length; j++) {
				 System.out.print(matrica[i][j] + " ");
			 }
			 System.out.println();
		 }
	}

}
