package zz;

public class skripta4 {

	public static void stampaj (int[][] matrica ) {
		int n = matrica.length;
		
		
		double suma = 0;
		
		for(int i = 0 ; i < matrica.length; i ++) {
			suma += matrica[i][n-1-i];
		}
		double aritmeticka = suma /n;
		System.out.println("aritmeticka je " + aritmeticka) ;
		
		
		System.out.println("elementi veci od aritmeticke sredine : ");
		for(int i = 0 ; i <matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j ++) {
				if(matrica[i][j] % 2 == 0 && matrica[i][j] > aritmeticka) {
					System.out.println(matrica[i][j] + " ");
				}
			}
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		int [][] matrica = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		stampaj(matrica);
		
		
	}

}
