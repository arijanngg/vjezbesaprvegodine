package predavnjazavrsni;

public class zadatak2 {

	public static void najproduktivniji( int[][] A) {
		
		int brojzaposlenih = A.length;
		int brojdana = A[0].length;
		int maxukupno = 0 ; 
		int najindex= 0;
		int suma = 0;
		for(int i = 0 ; i < brojzaposlenih ; i ++) {
		suma = 0;
			for(int j = 0 ; j < brojdana; j ++) {
				suma += A[i][j];
			}
			if (suma > maxukupno) {
				maxukupno = suma;
				najindex=i;
			}
		}
		System.out.println(najindex);
		System.out.println(maxukupno);
	}
	
	
	
	
	public static void main(String[] args) {
//firma prati rad zasposlenijh tokom n dana. matrica zaposlenih I[j] cuva koliko je i-ti zaposlenih uradio
//zadataka j-tog dana. potrebno je naci zasposlenog koji u citavom tom periodu od n dana uradio najvise zadataka.

	
	}

}
