package zz;

public class mnozenjeee {

	public static int[][] mnozenje (int[][]a,int[][]b) {
		
		int reda = a.length;
		int kola=a[0].length;
		int kolb=b[0].length;
		int [][] nova = new int [reda][kolb];
		
		for(int i = 0 ; i <a.length; i ++) {
			for(int j = 0 ; j < kolb; j ++) {
				for(int k = 0 ; k < kola ; k ++) {
					nova[i][j]+= a[i][k] *b[k][j];
					
				}
			}
		}
		return nova;
	}
	
	
	public static void main(String[] args) {
		int[][]a= {
				{1,2,3},
				{1,2,3},
		};
		int[][] b= {
				{1,2},
				{1,2,},
				{1,2,}
		};
		int [][] rez = mnozenje(a,b);
		
		System.out.println("Pomnozena matrica je " );
		for ( int i = 0 ; i <rez.length; i ++) {
			for(int j = 0 ; j < rez[0].length; j ++) {
				System.out.print(rez[i][j] + " ") ;
			}
			System.out.println();
		}
		
	}

}
