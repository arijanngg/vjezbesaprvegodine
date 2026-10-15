package y;

public class sedmi {

	public static void obrada(int[][] matrica) {
		
		int max=0;
		int indexred=0;
		int indexkol=0;
		
		for(int i =0 ; i <matrica.length; i ++) {
			for(int j = 0 ; j <matrica[i].length; j ++) {
				if (matrica[i][j] > max) {
					max=matrica[i][j];
					indexred=i;
					indexkol=j;
				}
			}
		}
		System.out.println("Maximalni broj u matrici je " + max+ " pozicija vrste je " + (indexred+1) + " a pozicija kolone je " + (indexkol+1) );
		
	}
	
	
	
	public static void main(String[] args) {
		int[][] z = {
				
				{1,2,3,4,5},
				{4,5,6,7,7},
				{2,34,4,4,3},
				{1,23,4,5,5},
		};
		obrada(z);

	}

}
