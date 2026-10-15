package y;

public class osam {

	public static void indexvr(int [][] matrica) {
		int najveci= 0 ;
		int index= 0;
		
		
		for(int i = 0 ;i <matrica.length; i ++) {
			int suma = 0;
			for(int j = 0 ; j <matrica[i].length; j ++) {
				suma += matrica[i][j];
			}
			if(suma >najveci) {
				najveci = suma;
				index = i;
			}
		}
		System.out.println("vrsta sa najvecom sumom iznosi " + najveci + " a index vrste je " + (index+1));
	}
	
	public static void main(String[] args) {
		int[][] z = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,10},
				{1,2,3,4,5},
				
		};
		indexvr(z);

	}

}
