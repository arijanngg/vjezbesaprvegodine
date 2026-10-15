package zz;

public class simetricnost {

	public static boolean simetrija ( int [][] matrica) {
		
		int n = matrica.length;
		
		for( int i = 0 ; i < n ; i ++) {
			if(matrica[i].length != n ) {
				return false;
			}
			
		}
		for(int i = 0 ; i < n; i ++) {
			for( int j = 0 ; j <matrica[0].length; j ++) {
				if(matrica[i][j] != matrica[j][i]) {
					return false;
				}
			}
		}
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int [][] matrica = {
				{1,2,3,4},
				{2,2,3,4},
				{3,3,3,4},
				{4,4,4,4},
		};
		
		if(!simetrija(matrica)) {
			System.out.println("Matrica nije simetricna");
		}else {
			System.out.println("Matrica je simetricna");
		}
		
	}

}
