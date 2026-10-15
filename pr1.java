package zz;

public class pr1 {
	
	public static void maksimum ( int[][]matrica) {
		
		int maximum = 0;
		int indexkol = 0; 
		int indexred= 0 ;
		for(int i = 0 ; i < matrica.length ; i ++) {
				for(int j = 0; j < matrica[0].length; j ++) {
					if(matrica[i][j] > maximum) {
						maximum = matrica[i][j];
						indexkol = (j+1);
						indexred=(i+1);
					}
				}
		}
		System.out.println("Najveci broj u matrici je " + maximum + " u redu " + indexred + " i koloni " + indexkol);
	} 
	
	
	
	
	public static void main(String[] args) {
		int[][]matrica = {
				
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,90},
				{1,2,3,4,5},
				
		};
		maksimum(matrica);
	}

}
