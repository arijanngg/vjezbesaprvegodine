package sortiranje;

public class izmatriceuniz {

	public static void main(String[] args) {
		
		 int[][] matrica = {
		            {5, 2, 9},
		            {1, 7, 3},
		            {8, 4, 6}
		        };
		 
		int n = matrica.length;
		
		int [] niz = new int [n*n];
		int index = 0;
		for (int i = 0 ; i < n ; i ++) {
			for( int j = 0 ; j < n ; j ++) {
				niz[index++]=matrica[i][j];
				
			}
		}
		
		for(int i = 0 ;i < niz.length - 1 ; i ++) {
			for (int j = 0 ; j < niz.length-1-i; j ++) {
				if(niz[j]>niz[j+1]) {
					int temp = niz[j];
					niz[j]=niz[j+1];
					niz[j+1] = temp;
				}
			}
		}
		index = 0;
		for (int i = 0 ; i < n ; i ++) {
			for ( int j = 0 ; j < n ; j ++) {
				matrica[i][j]= niz[index++];
				
			}
		}
		
		System.out.println("matrica je : ");
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
