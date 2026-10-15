package zz;

public class sort2 {

	public static void sort(int[] niz) {
		
		for (int i = 0 ; i <niz.length-1; i ++) {
			
			int najmanjiindex=i;
			for (int j = i+1 ; j <niz.length; j++) {
				if(niz[j] < niz[najmanjiindex]) {
					najmanjiindex= j;
				}
				
			}
			int temp = niz[i];
			niz[i]=niz[najmanjiindex];
			niz[najmanjiindex]=temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int [] niz = {4,5,9,1,4,8};
		
		sort(niz);
		System.out.println("Sortirani niz je");
		for(int broj:niz) {
			System.out.print(broj + " ");
		}
		
	}

}
