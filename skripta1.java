package zz;

public class skripta1 {

	public static int[] sumaparnih (int[][] matrica) {
		
		int suma= 0;
		int broj= 0 ;
		int niz[] = new int[broj];
		
		for( int i =0 ; i < matrica.length; i ++) {
			
			for(int j = 0 ; j < matrica[0].length; j ++) {
			for(int k = 0 ; k <niz.length; k++)
				if(matrica[i][j] > 2) {
					broj++;
					niz[k] = matrica[i][j];
					
				}
			}
			
		}
	return niz;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[][] matrica= {
				
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				
				
		};	
		int[] niz = sumaparnih(matrica);
		
		System.out.println("suma parnih brojeva u matrici je " );
		for(int broj : niz) {
			System.out.print(broj + " ");
		}
		
	}

}
