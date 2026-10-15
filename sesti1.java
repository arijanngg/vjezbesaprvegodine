package matrice2;

public class sesti1 {

	public static int zbir( int [][] matrica) {
		
		int suma = 0;
		
		for (int i = 0 ; i < matrica.length; i ++) {
			for (int j = 0; j < i ; j ++) {
			suma += matrica[i][j];
		}
		}	
		return suma;
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		int [][] A = {
				{1,2,3,5,6,7},
				{1,2,3,5,6,7},
				{1,2,3,5,6,7},
				{1,2,3,5,6,7},
				{1,2,3,5,6,7},
				{1,2,3,5,6,7}
				
				
		};
		int zbir = zbir (A);
		System.out.println("Zbir elemenata ispod glavne dijagonale je " + zbir);
		
		
		
	}

}
