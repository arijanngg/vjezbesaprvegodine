package sortiranje;

public class zadatak5 {

	public static void main(String[] args) {
		  int[] niz = {1, 2, 3, 4, 5}; // već sortiran niz
		  
		  for(int i = 0 ; i < niz.length-1; i ++) {
			boolean swapped =false;
			  for ( int j = 0 ; j <niz.length - 1 - i; j ++) {
				  
				  if (niz[j] > niz[j+1]) {
					  int temp = niz [j];
					  niz[j] = niz[j+1];
					  niz[j+1] = temp;
					  swapped = true;
				  }
				  
			  }
		System.out.println("Zavrsen je prolaz nakon " + (i+1 ));
			  if(!swapped) {
				  System.out.println("niz je sortiran" );
				  break;
			  }
		  }
		  
		  for(int broj :niz) {
			  System.out.print(broj + " ");
		  }

	}

}
