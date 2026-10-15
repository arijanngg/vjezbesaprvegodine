package sortiranje;

public class selectionsort {

	public static void main(String[] args) {
		 int[] niz = {5, 2, 9, 1, 7};
		 
		 for ( int i = 0 ; i < niz.length-1; i ++) {
			 int najmanjiindex = i;
			 for(int j = i +1 ; j < niz.length; j ++) {
				 if (niz[j] < niz[najmanjiindex]) {
					 najmanjiindex = j;
				 }
			 }
			 int temp = niz[i];
			 niz[i]= niz[najmanjiindex];
			 niz[najmanjiindex] = temp;
		 }
		 for (int broj : niz) {
			 System.out.print(broj + " ");
		 }
	}

}
