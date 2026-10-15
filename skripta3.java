package zz;

public class skripta3 {

	public static int zbir ( int[][] matrica) {
		
//proizvod vrste

		int maxproizvod = Integer.MIN_VALUE ; 
		int index = 0 ;
		for(int i = 0 ; i < matrica.length; i ++) {
			int proizvod = 1;
			for(int j = 0 ;  j < matrica[0].length; j ++) {
				proizvod *=  matrica[i][j];
			}
			if(proizvod > maxproizvod) {
				maxproizvod = proizvod ;
				index = i;
			}
		}
		int minzbir = Integer.MAX_VALUE ; 
		int indexkol = 0;
		
		for(int j = 0 ; j <matrica[0].length; j ++) {
			int zbir = 0;
			for(int i = 0 ; i <matrica.length; i ++) {
				zbir += matrica[i][j];
				
			}
			if(zbir<minzbir) {
				minzbir = zbir;
				indexkol = j ;
			}
		}
		int zbirvrste=0;
		for (int j = 0 ; j < matrica[0].length; j ++) {
			zbirvrste += matrica[index][j];
		}
		return minzbir + zbirvrste - matrica[index][indexkol];
		
		
	
	
	
	
	}
	public static void main(String[] args) {

		int [][]matrica = {
				{1,1,1,5},
				{1,1,1,1},
				{1,1,3,1},
				{1,4,1,1},
				
				
				
		};
		int rezultat = zbir(matrica);
		System.out.println("Zbir vrste sa najvecim proizvodom i kolone sa najmanjim zbirom je " + rezultat);
	}

}
