package zz;

public class prosti {

	public static boolean prosti ( int n) {
		if(n<2) {
			return false;
		}
		for (int i = 2 ;  i<= n/2 ; i ++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int suma (int[][]matrica) {
		int suma = 0 ;
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j <matrica[0].length; j++) {
				if(prosti(matrica[i][j])) {
					suma+= matrica[i][j];
				}
			}
	
		}
		return suma;
	}
	
	
	
	public static void main(String[] args) {
		int [][] matrica = {
				{5,6,8},
				{5,6,8},
				{5,6,8},
				
		};
		
		int rezultat = suma (matrica);
		System.out.println("Zbir prostih brojeva je "+rezultat );
 
	}

}
