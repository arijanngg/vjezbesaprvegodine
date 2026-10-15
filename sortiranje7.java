	package zz;
	
	public class sortiranje7 {
	
		public static  void sortiranje(int [] niz ) {
			
			for(int i= 0 ; i < niz.length-1; i ++) {
				int minindex = i;
				for(int j = i +1; j<niz.length ; j ++) {
					if(Math.abs(niz[j])<Math.abs(niz[minindex])) {
						minindex=j;
					}
					
					
				}
				int temp = niz[i];
				niz[i] = niz[minindex];
				niz[minindex]= temp;
			}
			
			
		}
		
		
		
		
		public static void main(String[] args) {
			
			int[]niz = {5,-1,5,-3,2,6};
	
			sortiranje(niz);
			
			System.out.println("sortirani niz je: ");
			for(int broj : niz) {
				System.out.print(broj + " ");
			}
		}
	
	}
