package sortiranje;

public class zadatak3 {

	public static void sortiraj ( int[] niz) {
		
		for ( int i = 0 ; i < niz.length-1; i ++) {
			for ( int j = 0 ; j <niz.length-1-i; j ++) {
				if (Math.abs(niz[j] ) > Math.abs(niz[j+1])) {
					int temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
					
				}
			}
		}
		System.out.println("Novi niz je: "   );
		for ( int broj : niz) {
			System.out.print(broj + " ");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int [] niz = {1,9,7,-2,-1,-5,-10};
		
		sortiraj (niz);
		
		
		

	}

}
