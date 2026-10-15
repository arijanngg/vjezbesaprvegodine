import java.util.Scanner;

public class jedan {

	public static int sumaparnih ( int [][] matrica) {
		
		int sumaparnih = 0;
		
		for ( int i = 0 ; i < matrica.length; i ++) {
			for (int j = 0 ; j < matrica[i].length; j ++) {
				
				if(matrica[i][j] % 2 == 0) {
					sumaparnih += matrica[i][j];
				}
			}
		}
		return sumaparnih;
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi broj redova");
		int redovi = sc.nextInt();
		System.out.println("Unesi broj kolona");
		int kolone = sc.nextInt();
		
		System.out.println("Unesi elemente matrice");
		int [][] matrica = new int [redovi][kolone];
		
		for ( int i = 0 ; i < matrica.length; i ++) {
			for (int j = 0 ; j <matrica[i].length; j ++) {
				matrica[i][j] = sc.nextInt();
				
			}
		}
		int suma = sumaparnih(matrica);
		System.out.println("Suma parnih brojeva je  " + suma );
		
		
	}

}
