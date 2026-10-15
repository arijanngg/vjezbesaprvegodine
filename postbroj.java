package zz;

public class postbroj {

	public static boolean prost(int n ) {
		if(n<2) {
			return false;
		}
		for(int i = 2; i <= n/2 ; i ++) {
			if(n%i==0 ) {
				return false;
			}
		}
		return true;
	}
	public static int zbir(int [][] matrica) {
		
		int zbir=  0 ;
		for( int i =0 ; i < matrica.length; i ++) {
			for( int j= 0 ; j <matrica[0].length;j++) {
				if(prost(matrica[i][j])) {
					zbir+= matrica[i][j];
				}
			}
		}
		return zbir;
		
	}
	
	public static void main(String[] args) {

		int [][] matrica = {
				
				{4,5,8,9,7},
				{4,5,8,9,7},
				{4,5,8,9,7},
				
		};
		int rez = zbir(matrica);
		System.out.println("zbir prostih brojeva  u matricci je " + rez);
	}

}
