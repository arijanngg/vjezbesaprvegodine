package y;

public class pet {
	
	public static void zbir ( int[][] a, int[][] b) {
		
		int [][]zbir = new int [a.length][a[0].length];
		
		for(int i =0; i < a.length; i ++) {
			for(int j = 0 ; j < a[0].length; j ++) {
				zbir[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("Novi niz je");
		for(int i = 0 ; i < zbir.length; i ++) {
			for(int j = 0 ; j < zbir[i].length; j ++) {
				System.out.print(zbir[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {

		 int[][] a = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        int[][] b = {
		            {7, 8, 9},
		            {1, 2, 3}
		        };
		        
		        zbir(a,b);
		

	}

}
