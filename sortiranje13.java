package zz;

public class sortiranje13 {

	public static void sortiranje(int[][] matrica) {
		
		for(int j = 0 ; j <matrica[0].length; j ++) {
			for(int i = 0 ; i < matrica.length-1; i ++) {
				int najveci = i;
				for(int k = i+1 ; k < matrica.length ; k ++) {
					if(matrica[k][j]>matrica[najveci][j]) {
						najveci = k;
					}
				}
				int temp = matrica[i][j];
				matrica[i][j]=matrica[najveci][j];
				matrica[najveci][j]=temp;
			}
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int [][] matrica= {
				
				{1,2,3,4},
				{5,5,5,5},
				{1,2,3,4},
				{4,4,4,4}
				
		};
		sortiranje(matrica);
		System.out.println("Sortirana matrica je : " );
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j ++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
