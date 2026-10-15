package zz;

public class bubble {

	public static void bubble(int[]niz) {
		
		for ( int i = 0 ; i < niz.length-1; i ++) {
			for( int j = 0 ; j < niz.length-1 -i ; j ++) {
				if(niz[j] > niz[j+1] ) {
					int temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
					
				}
				
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		int [] niz = {1,4,61,2,6,3,4,7,2,48,1};
		bubble(niz);
		System.out.println("Sortirani niz je ");
		for( int broj : niz) {
			System.out.print(broj + " ");
		}
		

	}

}
