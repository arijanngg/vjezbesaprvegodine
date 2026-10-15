package sortiranje;

public class sortiranje4 {

	public static void main(String[] args) {

		 int[][] matrica = {
		            {5, 2, 9},
		            {1, 7, 3},
		            {8, 4, 6}
		        };
		 
		 for (int j = 0 ; j < matrica[0].length; j ++) {
			 for (int k = 0 ; k < matrica.length - 1 ; k ++) {
				 for (int i = 0 ; i < matrica.length - 1 - k; i++) {
					 if (matrica[i][j] > matrica[i+1][j]) {
						 int temp = matrica[i][j];
						 matrica[i][j]= matrica[i+1][j];
						 matrica[i+1][j]= temp;
						 
					 }
				 }
			 }
		 }
		for (int i = 0 ; i <matrica.length; i ++) {
			for (int j = 0 ; j < matrica[0].length; j ++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
