package matrice2;

public class drugi1 {

	public static void main(String[] args) {

		int [][] A = {
				{1,2,3,4,5},
				{2,2,2,2,2,2},
				{3,5,5,5,5,4},
				{5,5,555,1,23,3}
				
				
		};
		
		int maxzbir = 0;
		int index = 0;
		
		for (int i = 0 ; i < A.length; i ++) {
			int zbir = 0;
			for (int j = 0 ; j < A[i].length; j ++) {
				zbir += A[i][j];
				
				
			}
			if(i == 0 || zbir>maxzbir) {
				maxzbir = zbir;
				index = i;
			}
		}
		System.out.println("Vrsta sa najvecim zbirom je " + (index +1));
		System.out.println("Zbir je " + maxzbir);
	}

}
