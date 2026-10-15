package sortiranje;

public class sortiranje2 {

	public static void main(String[] args) {
		
		int[] niz = {1,2,3,4,5};
		
		for ( int i = 0 ; i < niz.length; i ++) {
			boolean hasswapped = false;
			
			for ( int j = 0 ; j < niz.length - 1 - i; j ++) {
				
				if ( niz[j] > niz [j+1]) {
					
					int temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
					
					hasswapped = true;
					
				}
				
			}
			if (!hasswapped) {
				System.out.println("prekid nakon prolaza " + (i + 1));
				break;
			}
			
			
		}
		for (int broj : niz) {
			System.out.println(broj + " ");
			
		}
		
		
		
	}

}
