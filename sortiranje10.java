package zz;

public class sortiranje10 {

	public static void sort(int [] niz) {
		
		for(int i = 0 ; i <niz.length - 1 ; i ++) {
			int najveci = i;
			for(int j = 0 ; j <niz.length-1-i; j ++) {
			if(niz[j] < niz[j+1]) {
				int temp = niz[j];
				niz[j] = niz[j+1];
				niz[j+1] = temp;
				
			}	
				
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {

		int [] niz = {5,2,4,1,3,7,8,1,2,5,1};
		sort(niz);
		System.out.println("Sortirani niz je : ");
		for(int broj : niz) {
			System.out.print(broj + " ");
		}
		
	}

}
