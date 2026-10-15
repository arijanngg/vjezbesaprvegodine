package zz;

public class stringzadatak {

public static void string(String[][] matrica, int n ) {
		
		System.out.println("Stringovi veci od broja : " + n + " su : " );
		for(int i = 0 ; i <matrica.length ; i++) {
			for(int j = 0 ; j < matrica[i].length ; j ++) {
				if(matrica[i][j].length() >= n) {
					System.out.println(matrica[i][j] + " ");
				}
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
	String[][] matrica = {
			{"arijan","ema","jana"},
			{"bekir","nikola", "ina"}
			
			
	};
	string(matrica,4);
	

	}

}
