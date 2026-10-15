package sortiranje;

public class sortiranjeAI4 {

	public static void main(String[] args) {
		
		 int[] niz = {4, 9, 8, 4, 5}; // već sortiran niz
		 
		 for ( int i = 0 ; i< niz.length-1; i ++) {
			 boolean swapped = false;
			 for (int j = 0 ; j < niz.length - 1 - i ; j ++) {
				 if (niz[j] > niz[j+1]) {
					 int temp = niz[j];
					 niz[j] = niz[j+1];
					 niz[j+1] = temp;
					 swapped = true;
				 }
			 }
			 
			if(!swapped ) {
				System.out.println("Prekid nakon prolaza " + (i+1));
				break;
			} 
			
		 }
		for ( int broj : niz) {
			System.out.print(broj + " ");
		}

	}

}
