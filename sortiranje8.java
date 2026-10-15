package zz;

public class sortiranje8 {

	public static void sort(int[] niz) {
		
		for(int i = 0 ; i < niz.length-1; i ++) {
			int minindex=i;
			for(int j =i+1; j<niz.length; j ++) {
				if(niz[j] > niz[minindex]) {
					minindex=j;
					
				}
				
			}
			int temp = niz[i];
			niz[i]= niz[minindex];
			niz[minindex]=temp;
		}
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		int [] niz= {7,5,42,8,3,4,9,2,5,9};

		sort(niz);
		System.out.println("Sortirani niz je: ");
		for(int broj : niz) {
			System.out.print(broj + " ");
		}
		
	}

}
