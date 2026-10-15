package zz;

public class sortiranje6 {

	public static void sort(int[][]matrica) {
		
		int redovi = matrica.length;
		int kolone = matrica[0].length;
		
		for(int j = 0 ; j <kolone; j ++) {
			for(int i = 0 ; i <redovi-1 ; i ++) {
				int minindex =i;
				for(int k = i+1; k <redovi; k ++) {
					if(matrica[k][j] < matrica[minindex][j]) {
						minindex = k;
					}
				}
				int temp = matrica[i][j];
				matrica[i][j] = matrica[minindex][j];
				matrica[minindex][j]=temp;
				
				
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		  int[][] matrica = {

		            {5, 2, 9, 1},
		            {8, 3, 7, 4},
		            {6, 0, 2, 3}
		        };
		  
		  sort(matrica);
		  System.out.println("Sortirana matrica po kolonama je: ");

		  for(int i = 0 ; i < matrica.length; i ++) {
			  for(int j = 0 ; j <matrica[0].length; j ++) {
				  System.out.print(matrica[i][j] + " ");
			  }
			  System.out.println();
		  }
	}

}
