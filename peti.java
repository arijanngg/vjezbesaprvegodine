package zz;

public class peti {

	public static  void zbirmatrica(int[][] a, int[][] b) {
		
		int redovi = a.length;
		int kolone = a[0].length;
		
		int[][] nova= new int [redovi][kolone];
		
		
		
		for(int i = 0 ; i < a.length; i ++) {
			for(int j = 0 ; j < a[0].length; j ++) {
			nova[i][j] = a[i][j] +b[i][j];	
			}
		}
		
		System.out.println("Zbir matrica je ");
		for(int i = 0 ; i <nova.length; i ++) {
			for( int j = 0 ; j < nova[0].length; j ++) {
				System.out.print(nova[i][j] + " ");
			}
			System.out.println();
			
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		int[][] b = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
		};
		zbirmatrica(a,b);
	}

}
