package matrice2;

public class cetiri1 {

	public static void main(String[] args) {

		int [][] A = {
				{1,2,3,4,5,6},
				{2,3,4,5,6,7},
				{1,1,1,1,1,1},
				{2,3,4,4,5,5}
		};
		 
		int redovi = A.length;
		int kolone = A[0].length;
		
		int maxproizvod = 0;
		int najboljavrsta = 0;
		
		for (int i = 0 ; i < redovi ; i ++) {
			int proizvod = 1; 
			
			for (int j = 0 ; j < kolone; j ++) {
				proizvod *= A[i][j];
				}
			if (i == 0 || proizvod > maxproizvod) {
				maxproizvod = proizvod;
				najboljavrsta = i;
			}
			
			}
		
		int minzbir = 0;
		int najboljakolona = 0;
		
		for (int j = 0 ; j < kolone; j ++) {
			int zbir = 0;
			for (int i = 0 ; i < redovi ; i ++) {
				zbir += A[i][j];
			}
			if ( zbir < minzbir ) {
				minzbir = zbir;
				najboljakolona = j;
				
			}
		}
		
		int suma = 0 ;
		for (int i = 0 ; i < redovi; i ++) {
		
				suma += A[najboljavrsta][i];
		}
			for (int i = 0 ; i < redovi ; i ++ ) {
			if (i != najboljavrsta ) {
				suma += A[i][najboljakolona];
			}
	
				
				
				
			}
			
			System.out.println("najbolja vrsta je  " + (najboljavrsta+1)); 
			System.out.println("Najbolja kolona je " + (najboljakolona+1));
			System.out.println("trazena suma je " + suma);
			
			
			
		}
		
		
		
		
		}
		
		
		
	


