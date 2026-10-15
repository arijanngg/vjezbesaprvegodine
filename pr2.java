package zz;

public class pr2 {

	public static void najvecavrsta ( int [][]matrica) {
		
		int zbir = 0;
		int index =0;
		for(int i = 0 ; i < matrica.length; i ++) {
			int sabirak=0;
			for(int j = 0 ; j < matrica[0].length; j++) {
				sabirak += matrica[i][j];
			}
			if(sabirak >zbir ) {
				zbir = sabirak;
				index = i;
			}
		}
		System.out.println("Najveca vrsta(red) je : "  +(index+1) + " sa zbirom vrste od : " + zbir);
		
	}
	
	
	public static void main(String[] args) {

		int [][] matrica = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,55},
				
		};
		najvecavrsta(matrica);
	}

}
