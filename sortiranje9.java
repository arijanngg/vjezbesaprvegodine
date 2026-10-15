package zz;

public class sortiranje9 {

	public static void minimum(int[]niz) {
		for(int i = 0 ; i < niz.length-1; i ++) {
			for(int j =i+1 ; j  < niz.length; j ++) {
				if(niz[i]>niz[j]) {
					int temp= niz[i];
					niz[i] = niz[j];
					niz[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		
		int []niz= {8,6,2,7,84,8,31};
		minimum(niz);
		
		System.out.println("Sortirani niz je : ");
		for(int broj : niz) {
			System.out.print(broj + " ");
		}
		
	}

}
