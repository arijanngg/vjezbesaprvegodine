package zz;

public class skripta10 {

	public static void vrsta (int [][] matrica) {
	
		int maxduzina = 0;
		int najboljired = 0;
		
		for(int i = 0 ; i <matrica.length; i ++) {
			int trenutna = 1;
			int lokalnimax = 1;
			for(int j = 1 ; j <matrica[0].length; j ++) {
				
				if(matrica[i][j] > matrica[i][j-1]) {
					trenutna ++;
				}else {
					trenutna = 1;
				}
				if(trenutna > lokalnimax) {
					lokalnimax = trenutna;
				}
				
			}
			if(lokalnimax >maxduzina) {
				maxduzina = lokalnimax;
				najboljired = i;
			}
		}
		System.out.println("Vrsta sa najduzom rastucom sekvencom : ");
		for(int j = 0 ; j < matrica[0].length ; j ++) {
			System.out.print(matrica[najboljired][j]+ " ");
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		 int[][] matrica = {

		            {1, 2, 3, 1},
		            {5, 6, 7, 8},
		            {1, 2, 1, 2},
		            {9, 1, 2, 3}
		        };
		 vrsta(matrica);
		
	}

}
