package y;

public class cetiri {

	public static int najvisezadatala(int[][] matrica) {
		int maxsuma = 0 ;
		int index = 0;
		
		for ( int i = 0 ; i < matrica.length; i ++) {
			int suma = 0;
			for(int j = 0 ; j < matrica[i].length; j ++) {
				suma += matrica[i][j];
				
				
			}
			if(suma>maxsuma) {
				maxsuma = suma;
				index=i;
			}
			
		}
		return index;
		
	}
	
	
	
	
	public static void main(String[] args) {
		int[][] zaposleni = {

	            {5, 4, 6},   // 15
	            {7, 3, 2},   // 12
	            {8, 5, 4}    // 17
	        };
		
		int rjesenje = najvisezadatala(zaposleni);
		System.out.println("Index najboljeg radnika je " + (1+rjesenje));
		
	}

}
