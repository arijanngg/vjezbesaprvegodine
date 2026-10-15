package y;

public class devet {

	public static int obrada(int[][] matrica) {
		
		int proizvod = 1;
		int indexvr = 0;
		
		for(int i = 0 ; i < matrica.length; i ++) {
			int proizvo=1;
			for(int j = 0 ; j < matrica[i].length; j ++) {
				proizvod*= matrica[i][j];
			}
			if(proizvo>proizvod) {
				proizvod = proizvo;
				indexvr= i;
			}
		}
		int zbirvrs = 0;
		for(int j= 0 ; j < matrica[indexvr].length ; j ++ ) {
			zbirvrs += matrica[indexvr][j];
		}
		
		int minzbir = 0 ;
		int indexkol = 0;
		for(int j = 0 ; j <matrica[0].length; j ++) {
			int zbir = 0 ; 
			for(int i = 0 ; i < matrica.length; i ++) {
				zbir+= matrica[i][j];
			}
				if(zbir <minzbir ) {
					minzbir = zbir;
					indexkol = j;
				
			}
		}
		int zbirkol = 0 ; 
		for(int i = 0 ; i < matrica.length; i ++) {
			zbirkol += matrica[i][indexkol];
		}
		return zbirkol + zbirvrs;
	}
	
	public static void main(String[] args) {

	    int[][] matrica = {

	            {2, 3, 4},
	            {1, 5, 6},
	            {7, 8, 9}
	        };

	        int rjesenje = obrada(matrica);

	        System.out.println("Rezultat je: " + rjesenje);
		
	}

}
