package zz;

public class mnoziti {

	public static int[][] mnozenje(int[][]a,int[][] b){
		int reda = a.length;
		int kolb= b[0].length;
		int kola= a[0].length;
		
		int[][] nova = new int [reda][kolb];
		
		for(int i = 0 ; i < reda ; i++) {
			for(int j = 0 ; j < kolb ; j ++) {
				for(int k = 0 ; k <kola ; k ++) {
					nova[i][j]+= a[i][k] *b[k][j];
					
				}
			}
		}
		return nova;
		
	}
	
	
	
	public static void main(String[] args) {

		int[][] a = {
				{1,2},
				{1,2},
		};
		int[][] b  = {
				{1,2},
				{1,2},
		};
		int [][] matrica = mnozenje(a,b);
		System.out.println("Nova matrica je ");
		for( int i = 0 ; i <matrica.length; i ++) {
			for( int j = 0 ; j < matrica[0].length; j ++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

}
