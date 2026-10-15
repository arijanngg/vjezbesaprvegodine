package sortiranje;

public class zadatak1 {

	public static void main(String[] args) {

		 int[][] matrica = {
		            {5, 2, 9},
		            {1, 7, 3},
		            {8, 4, 6}
		        };
		
		 for (int i = 0 ; i < matrica.length  ; i ++) {
			 
			 for(int k = 0 ; k < matrica[i].length - 1 ; k ++) {
				 for(int j = 0 ; j < matrica[i].length - 1- k; j ++) {
					 if (matrica[i][j]> matrica [i][j+1]) {
						 int temp = matrica[i][j] ;
						 matrica[i][j] = matrica[i][j+1];
						 matrica[i][j+1] = temp;
						 
					 } 
				 } 
			 }	 
		 }
		
		 System.out.println("Sortirana matrica je : " );
		 for (int i = 0 ; i < matrica.length; i ++) {
			 for (int j = 0 ; j < matrica[i].length; j ++) {
				 System.out.print(matrica[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
		 
	}

}
