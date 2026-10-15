package sortiranje;

public class sortiranje1 {

	public static void main(String[] args) {

		int[] niz = {5,2,3,5,1,2,6};
		
		for ( int i = 0 ; i < niz.length; i ++) {
			int maxindex = i;
			
			for ( int j = i+ 1; j < niz.length; j ++ ) {
				if (niz[j] > niz[maxindex]) {
					maxindex = j;
					
				}
			}
			
			int temp = niz[i];
			niz [i] =  niz [maxindex];
			niz[maxindex] = temp;
			
		}
		
		for ( int broj : niz) {
			System.out.println(broj + " ");
		}
	}

}
