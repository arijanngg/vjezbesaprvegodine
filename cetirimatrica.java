package zz;

public class cetirimatrica {

	public static void najboljizaposleni (int [][]matrica) {
		
		int najbolji = 0;
		int index = 0;
		
		for(int i = 0 ; i < matrica.length; i ++) {
			int zbir = 0;
			for(int j = 0 ; j < matrica[0].length; j ++) {
				zbir += matrica[i][j];
			}
			if(zbir >najbolji ) {
				najbolji = zbir;
				index = (i+1);
			}
		}
		System.out.println("Najbolji zaposleni je : " + index + " sa brojem sati od : " + najbolji) ;
		
	}
	
	
	
	public static void main(String[] args) {
		int[][] matrica = {
				
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,5},
		};
		najboljizaposleni(matrica);
		
		
		
	}

}
