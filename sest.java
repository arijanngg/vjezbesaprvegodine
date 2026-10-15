package matrice;

public class sest {
	
	public static void ispisidijagonalu (int [][] matrica) {
		for (int i = 0 ; i < matrica.length; i ++) {
			System.out.print(matrica [i][i] + " ");
				
			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
	int [][] matrica = {
			{1,2,3,4,5,6},
			{2,2,2,2,2,2},
			{3,3,3,3,3,3},
			{4,4,4,4,4,4},
			{5,5,5,5,5,5},
			{6,6,6,6,6,6},
	};
		ispisidijagonalu (matrica);

	}

}
