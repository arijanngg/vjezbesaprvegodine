package matrice2;

public class prvi1 {
	
		public static void nadjimax (int [][] matrica) {
			
			int max = matrica[0][0];
			int red = 0; 
			int kolona = 0;
			
			for (int i = 0 ; i < matrica.length; i ++) {
				for (int j = 0 ; j < matrica[i].length; j ++) {
					if (matrica [i][j] > max) {
						 max=matrica[i][j] ;
						 red = i;
						 kolona = j;
						 
					}
					
				}
			}
			System.out.println("maximalna vrijednost je " + max);
			System.out.println("red je " + (red+1) + " a kolona " + (kolona+1));
		} 
	
	
	public static void main(String[] args) {

		int[][] A = {
			
				{1,2,3,4,5,6,7,7,7},
				{2,2,2,2,2,2,2,2},
				{4,4,4,4,4,4,44},
				{300,2,2,3,4,4,5}
				
		} ;
		nadjimax (A);
	}

}
