package zz;

public class sort {

	public static void sort(int[] niz) {
		
		for(int i = 0 ; i < niz.length-1; i ++) {
			int najveci = i;
			for(int j = i +1 ; j < niz.length ; j++) {
				if (niz[j]<niz[najveci]) {
					najveci = j;
				}
				int temp  = niz[i];
				niz[i] = niz[najveci];
				niz[najveci] = temp;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] niz = {23,5,1,2,6};
sort( niz);
	
	System.out.println("Sortirani niz : ");
		for(int broj : niz) {
			System.out.print(broj + " ");
		}
	}

}
