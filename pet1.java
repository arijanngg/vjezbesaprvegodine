package matrice2;

public class pet1 {
	
	public static int suprotnadijagonala ( int [][] matrica) {
		
		int n = matrica.length;
		int suma = 0;
		
		for (int i = 0 ; i < n; i ++) {
			int element = matrica[i][n-1-i];
			suma += element *element;
			
		}
		return suma;
	}
	
	
	
	
	public static void main(String[] args) {

		int [][] A = {
			
				{1,2,34},
				{1,2,3},
				{1,1,1}
	
		};
		
		int suma = suprotnadijagonala (A);
		System.out.println("SUma suprotne dijagonale je " + suma);
		
		
	}

}
