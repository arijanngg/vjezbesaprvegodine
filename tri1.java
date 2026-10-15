package matrice2;

public class tri1 {

		public static void dijagonala (int[][] matrica) {
			
			int n = matrica.length;
			int [] niz = new int [n];
			
			for (int i = 0 ; i < n ; i ++) {
				niz[i] = matrica[i][i];
			}
			System.out.println("Niz dijagonale je " + niz);
			for(int i = 0 ; i < n; i ++) {
				System.out.print(niz[i] + " ");
				
			}
		}
	
	
	public static void main(String[] args) {
		int[][]A = {
				{1,2,3,4,5,},
				{2,2,2,2,2,2},
				{2,2,2,2,2,2},
				{8,8,8,8,8,8},
				{1,1,1,1,1,1,1},
				{1,1,11,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1}
		};
		dijagonala (A);
	}

}
