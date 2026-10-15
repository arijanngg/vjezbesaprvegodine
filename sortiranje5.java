package sortiranje;

public class sortiranje5 {

	public static void sortirajpoapsolutnoj (int[] niz) {
		
		for (int i = 0 ; i < niz.length-1; i ++) {
			for ( int j = 0 ; j < niz.length -1-i; j ++) {
				
				
				if (Math.abs(niz[j])> Math.abs(niz[j+1])) {
					int temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
				}
				
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {


        int[] niz = {-3, 1, -2, 4};
        
        sortirajpoapsolutnoj(niz);
        for (int broj : niz) {
        	System.out.println(broj + " ");
        }
		
		
		
	}

}
