package zz;

public class simetrija {

	public static boolean simetricna(int[][] matrica) {
		
	
		int n = matrica[0].length;
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j <matrica[0].length; j ++) {
				if(matrica[i][j] != matrica[j][i]) {
					return false;
				}
			}
		}
		return true;	
	}
	
	public static void main(String[] args) {
int[][] matrica= {
		{1,2,2,1},
		{2,2,2,1},
		{2,2,2,1},
		{1,1,1,1},
		
};
	if(!simetricna(matrica)) {
		System.out.println("MAtrica nije simetricna");
		
	}else {
		System.out.println("Matrica simetricna");
	}

	}

}
