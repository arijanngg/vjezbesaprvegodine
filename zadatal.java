package zz;

public class zadatal {

	public static double prosjek(int[][] matrica, int red) {
		int suma = 0;
		
		for(int i=0; i <matrica[0].length; i++) {
			suma+=matrica[red][i]; 
		}
		double prosjek = (double)suma/matrica.length;
	return prosjek;
	}
	public static int index(int[][] matrica ) {
		double najveci=prosjek(matrica,0);
		int index= 0 ;
		for( int i = 0 ; i < matrica.length; i ++) {
			double odnos = prosjek(matrica,i);
			
				if(odnos > najveci) {
					najveci = odnos;
					index= i;
				
			}
		}
		return index;
	}
	public static void imena(int[][] matrica, String[] studenti) {
		
		for( int i = 0 ; i < matrica.length; i ++) {
			for( int j = 0 ; j < matrica[0].length; j ++) {
				if(matrica[i][j] == 5) {
					System.out.println(studenti[i]);
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
