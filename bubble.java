package sortiranje;

public class bubble {

	public static void main(String[] args) {
		 int[] niz = {5, 2, 9, 1, 7};
		 
		 for(int i = 0 ; i < niz.length-1 ; i ++) {
			 for ( int j = 0 ; j < niz.length -1 - i ; j ++) {
				 if ( niz[j]>niz[j+1]) {
					 int temp = niz[j];
					 niz[j]= niz[j+1];
					 niz[j+1] = temp;
				 }
			 }
		 }
		 
		 for(int broj : niz) {
			 System.out.print(broj + " ");
		 }
	}

}
