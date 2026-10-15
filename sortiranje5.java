package zz;

public class sortiranje5 {

	public static void sortiranje(int[]niz) {
		
		for(int i = 0 ; i <niz.length-1; i ++) {
			
			int najmanji= i;
			for(int j = i+1 ; j <niz.length; j ++) {
				if(niz[j] <niz[najmanji]) {
					najmanji=j;
				}
				
			}
			int temp  = niz[i];
			niz[i] = niz[najmanji];
			niz[najmanji]=temp;
		}
		
		
	}
	public static void sortiranjekolone(int[][] matrica) {
		
		int redovi = matrica.length;
		int kolone = matrica[0].length;
		
		for(int j = 0 ; j <kolone ; j ++) {
			
			int [] kolona = new int [redovi];
			for(int i =0; i <redovi;i++) {
				kolona[i]= matrica[i][j];
			}
			sortiranje(kolona);
			for(int i = 0 ; i < redovi; i ++) {
				matrica[i][j] = kolona[i];
			}
		}
	
		
		
	}
		
	public static void main(String[] args) {
	
		 int[][] matrica = {

		            {5, 2, 9, 1},
		            {8, 3, 7, 4},
		            {6, 0, 2, 3}
		        };
		 sortiranjekolone(matrica);
		 System.out.println("sortirana matrica je");
		 for(int i = 0 ; i < matrica.length; i ++) {
			 for(int j = 0 ; j <matrica[0].length; j++) {
				 System.out.print(matrica[i][j] + " ");
				 
			 }
			 System.out.println();
		 }
	}

}
