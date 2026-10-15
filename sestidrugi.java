
public class sestidrugi {

	public static void main(String[] args) {

		int[] visina = {180, 170, 160, 190};
        int[] tezina = {90, 60, 80, 100};
		
		int n = visina.length;
		
		double[][] matrica = new double[n][2];
		
		for ( int i = 0 ; i < n; i ++) {
			matrica [i][0] = tezina[i];
			matrica[i][1] = visina[i];
			
		}
		
		double maxodnos = Double.MIN_NORMAL;
		double minodnos = Double.MAX_VALUE;
		
		int indexmax = 0;
		int indexmin = 0 ;
		
		
		for ( int i = 0 ; i < n ; i ++) {
			double odnos = matrica[i][1] / matrica[i][0];
			if ( odnos > maxodnos) {
				maxodnos = odnos;
				indexmax = i;
			}else if (odnos < minodnos) {
				minodnos = odnos;
				indexmin = i;
			}
			
		}
		
		 System.out.println("Osoba sa NAJVEĆIM odnosom (visina/tezina):");
		 System.out.println("Visina " + (int)matrica[indexmax][1] + " tezina " + (int)matrica[indexmax][0] + " odnos " + (int)maxodnos);
		
		 System.out.println("Osoba sa NAJMANJIM odnosom (visina/tezina):");
		 System.out.println("Visina " + (int)matrica[indexmin][1] + " tezina " + (int)matrica[indexmin][0] + " odnos " + (int)minodnos);
		
	}

}
