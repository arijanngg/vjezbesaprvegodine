package matrice;

public class prviii {

	public static void nadjiMaks (int [][] matrica) {
		
		int max = matrica [0][0];
		int red = 0 ; 
		int kolona = 0;
		
		for (int i = 0 ; i <matrica.length; i ++) {
			for (int j = 0 ; j < matrica[0].length; j ++) {
				
				if (matrica[i][j] > max) {
					max = matrica[i][j];
					red = i ; 
					kolona = j ;
					
				}
			}
			 
		}
		System.out.println("Maksimalna vrijednost: " + max);
        System.out.println("Pozicija -> red: " + red + ", kolona: " + kolona);
		
	}
	public static void main(String[] args) {
		 int[][] matrica = {
		            {3, 5, 1},
		            {7, 2, 8},
		            {4, 6, 0}
		        };

		        nadjiMaks(matrica);

	}

}
