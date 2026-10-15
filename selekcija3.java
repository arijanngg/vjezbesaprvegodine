package sortiranje;

public class selekcija3 {

	public static void main(String[] args) {
		 int[] niz = {5, 2, 9, 1, 7};

		  for ( int i = 0 ; i < niz.length - 1 ; i ++) {
			  int indexmax = i;
			  for ( int j = i +1 ; j <niz.length; j ++ ) {
				  if(niz[j]<niz[indexmax]) {
					  indexmax = j ; 
					  
				  }
			  }
			  int temp = niz[i];
			  niz[i]= niz[indexmax];
			  niz[indexmax]= temp;
			  for(int broj :niz) {
				  System.out.print(broj + " ");
			  }
			  System.out.println();
		  }
	

	}

}
