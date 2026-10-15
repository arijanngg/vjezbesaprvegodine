package zz;

public class sort3 {

	public static void bubble(int[] niz) {
		
		for(int i = 0 ; i < niz.length-1; i ++) {
			boolean swapped = false;
			for(int j = 0 ; j < niz.length-1-i; j ++) {
				if(niz[j] > niz[j+1]) {
					int temp = niz[j];
					niz[j]= niz[j+1];
					niz[j+1]=temp;
					swapped = true;
				}
			}
			if (!swapped) {
			break;
			}
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] niz = {1, 2, 3, 4, 5};
		bubble(niz);
		
		System.out.println("Rezultat :");
		for(int broj : niz) {
			System.out.println(broj + " ");
		}	
		

	}

}
