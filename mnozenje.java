package zz;

public class mnozenje {
	
	public static int[][] mnozi (int[][] a, int[][] b){
		
		int redovia= a.length;
		int kolonea = a[0].length;
		int koloneb = b[0].length;
		
		int [][] rezultat = new int [redovia][koloneb];
		
		for(int i =0 ; i < redovia ; i ++) {
			for (int j = 0 ; j <koloneb; j ++) {
				for(int k = 0 ; k <kolonea; k ++) {
					
					rezultat [i][j] += a[i][k]* b[k][j];
				}
			}
		}
		return rezultat ;
	}
	
	

	public static void main(String[] args) {
		
		int [][]a = {
				
				{1,2,3},
				{1,2,3},
				{1,2,3},
		};
int [][]b = {
				
				{1,2,3},
				{1,2,3},
				{1,2,3},
		};

int [][] matrica = mnozi(a,b);
System.out.println("Izmnozena matrica ");
	
	for(int i = 0 ; i < matrica.length; i ++) {
		for( int j = 0 ; j < matrica[0].length;  j++) {
			System.out.print(matrica[i][j] + " ");
		}
		System.out.println();
	}
	

	}

}
