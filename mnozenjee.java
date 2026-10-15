package zz;

public class mnozenjee {

	public static int[][] mnozenje(int[][]a,int[][]b){
		
		int redovia= a.length;
		int kolb= b[0].length;
		int kola = a[0].length;
		
		int[][]rezultat = new int[redovia][kolb];
		
		for(int i = 0 ; i < redovia; i ++) {
			for(int j = 0 ; j <kolb; j ++) {
				for(int k = 0 ; k <kola; k++) {
					
					rezultat [i][j]= a[i][k]*b[k][j];
				}
			}
		}
		return rezultat;
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[][] a = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] b = {
	            {7, 8},
	            {9, 10},
	            {11, 12}
	        };

	        int[][] c = mnozenje(a, b);

	        System.out.println("Rezultat:");

	        for (int i = 0; i < c.length; i++) {

	            for (int j = 0; j < c[0].length; j++) {

	                System.out.print(c[i][j] + " ");
	            }

	            System.out.println();
	        }

	}

}
