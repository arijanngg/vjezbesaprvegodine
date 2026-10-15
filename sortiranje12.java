package zz;

public class sortiranje12 {
	
	public static void sortiranjematrice(int[][]matrica) {
		
		for(int i = 0 ; i <matrica.length; i++) {
			for(int j = 0 ; j <matrica[i].length-1; j++) {
				int minindex= j;
				for(int k = j +1; k <matrica[i].length; k++) {
					if(matrica[i][k] > matrica[i][minindex]) {
						minindex = k;
					}
				}
				int temp = matrica[i][j];
				matrica[i][j]= matrica[i][minindex];
				matrica[i][minindex]=temp;
			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
		int [][]matrica = {
				{4,2,55,4},
				{3,2,4,55},
				{2,3,3,4},
				{1,4,1,4},
		};
		
		sortiranjematrice(matrica);
		System.out.println("Sortirana matrica po redovima je : ");
		for(int i = 0 ; i <matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j ++) {
				System.out.print(matrica[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
