package zz;

public class skripta2 {

	public static void najveci(int[][] matrica) {
		
		int najvecizbir = 0 ;
		int index= 0;
		for(int i = 0 ; i < matrica.length; i++) {
			int zbir = 0;
			for(int j = 0 ; j < matrica[0].length; j ++) {
				zbir+= matrica[i][j];
			}
			if(zbir>najvecizbir) {
				najvecizbir = zbir;
				index = i ;
			}
		}
		System.out.println("Index najvece vrste je " + index+ " sa zbirom elemenata " + najvecizbir);
		
	}
	
	
	
	public static void main(String[] args) {

		int[][] z = {
				
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,10}
				
				
				
		};	
		
		najveci(z);
	}

}
