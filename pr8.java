package zz;

public class pr8 {

	public static boolean simetricna ( int [][] matrica) {
		
		int n = matrica.length; 
		for(int i = 0 ; i < n ; i ++) {
			if(matrica[i].length != n) {
				return false;
			}
		}
		for(int i = 0 ; i < n; i ++) {
			for (int j = i+1 ; j < n; j ++) {
				if(matrica[i][j] != matrica[j][i]) {
					return false;
				}
			}
		}
		
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		int[][] matrica = {
				{1,1,2,1},
				{1,2,2,2},
				{2,2,2,1},
				{1,2,1,1},
		};
		if (!simetricna(matrica)) {
			System.out.println("Matrica nije simetricna");
		}else {
			System.out.println("Matrica je simetricna");
		}
	}

}
