package sortiranje;

public class kolonaivrsta {

	public static void main(String[] args) {
		
		 int[][] matrica = {
		            {5, 2, 9},
		            {1, 7, 3},
		            {8, 4, 6}
		        };
		 
		 int n = matrica.length;
		 
		 for(int i = 0 ; i < n; i ++) {
			 for(int j = 0 ; j < n-1; j ++) {
				 int minindex=j;
				 for(int k = j+1 ; k <n; k++) {
					 if ( matrica[i][k] < matrica[i][minindex]) {
						 minindex = k;
					 }
				 }
				 int temp = matrica[i][j];
				 matrica[i][j] = matrica[i][minindex];
				 matrica[i][minindex]= temp;
				 
				 }
		 }
		for(int j = 0 ; j < n ; j++ ) {
			for(int i =0 ; i<n-1 ; i ++) {
				int minindex=i;
				for(int k = i+1 ; k < n ;  k++) {
					if ( matrica[k][j] < matrica[minindex][j]) {
						minindex=k;
					}
				}
				int temp = matrica[i][j];
				matrica[i][j] = matrica[minindex][j];
				matrica[minindex][j]=temp;
				
			}
		}
		System.out.println("matrica nakon sortiranja vrste i kolone je :");
		for(int i = 0 ; i < matrica.length;i ++) {
			for(int j =0 ; j < matrica[i].length; j ++) {
				System.out.print(matrica[i][j]+ " ");
			}
			System.out.println();
		}  
		
		

	}

}
