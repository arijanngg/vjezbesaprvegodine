package zz;

public class skripta5v2 {

	public static int brojsamoglasnika ( String[][] matrica) {
		
		int brojsamoglasnika= 0;
		for( int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j <matrica[0].length; j ++) {
				for(int k = 0; k <matrica[i][j].length(); k++) {
					char c = matrica[i][j].charAt(k);
					if(c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u') {
						brojsamoglasnika ++;
					}
				}
				
			}
		}
		
		return brojsamoglasnika;
		
	}	
	
	
	
	public static void main(String[] args) {
		
		String [][] matrica= {
				
				{"arijan","arijan","arijan"},
				{"arijan","arijan","arijan"},
				{"arijan","arijan","arijan"},
				{"arijan","arijan","arijan"},
				
				
				
		};
		
		int rezultat = brojsamoglasnika(matrica);
		System.out.println("Broj samoglasnika u matrici je : " + rezultat);

	}

}
