package zz;

public class studenti {

	public static double prosjek(int[][] matrica,int red ) {
		
		double suma = 0;
	
		for(int j = 0 ; j<matrica[0].length; j ++ ) {
			suma+= matrica[red][j];
		}
		double prosjek = suma / matrica[0].length;
		return prosjek;
				
	}
	public static double prosjekkolone(int[][] matrica, int kolona ) {
		
		int suma = 0 ; 
		for(int i = 0; i < matrica.length; i ++) {
			suma+= matrica[i][kolona];
			
			
		}
		double prosjek = suma / matrica.length; 
		return prosjek;
	}
	
	public static int najbolji(int[][] matrica) {
		
		int maxindex = 0 ;
		double maxprosjek = 0 ;
		for(int i = 0 ; i < matrica.length; i ++) {
			int suma = 0 ;
			for(int j = 0 ; j <matrica[0].length; j ++) {
				suma+= matrica[i][j];
			}
			double prosjek = (double) suma / matrica[0].length;
			if(prosjek >maxprosjek) {
				maxprosjek = prosjek;
				maxindex = i;
				
			}
		}
		
		return maxindex;
		
	}
	public static void studentisa5(String[][] studenti, int[][]matrica) {
		
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j++) {
				if(matrica[i][j] == 5) {
					System.out.println( studenti[i][j]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
