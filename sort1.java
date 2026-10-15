package zz;

public class sort1 {

	public static void sortt(int [] niz) {
	
		for(int i =  0 ; i < niz.length -1; i++) {
			int maxindex = i;
			for(int j = i+1; j <niz.length; j ++) {
				if (niz[j] >niz[maxindex]) {
				
					maxindex=j;
				}
			}
					int temp = niz[i];
					niz[i]=niz[maxindex];
					niz[maxindex]=temp;
					
							
				
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
			
		int[] niz = {4, 1, 7, 2, 9, 3};
		
		sortt(niz);
		
		System.out.println("Sortirani niz je :");
		for(int broj : niz) {
			System.out.print(broj + " ");
		}
	}

}
