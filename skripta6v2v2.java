package zz;

public class skripta6v2v2 {
	public static void odnos(int[] visina , int [] tezina) {
		
		int n= visina.length;
		
		int[][]matrica = new int [n][2];
		
		for(int i = 0 ; i < visina.length; i ++) {
			matrica[i][0] = tezina[i];
			matrica[i][1] = visina[i];
		}
		System.out.println("Nova matrica je ");
		for(int i = 0 ; i < matrica.length; i ++) {
			for(int j = 0 ; j < matrica[0].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		int maxindex = 0;
		int minindex = 0;
		
		double max = (double) matrica[0][1]/matrica[0][0];
		double min = max;
		
		for(int i = 0 ; i <matrica.length; i ++) {
			double odnos = (double)matrica[i][1]/matrica[i][0];
			if(odnos>max) {
				max = odnos;
				maxindex = i;
			}
				if(odnos<min) {
				min = odnos;
				minindex = i;
			}
		}
		System.out.println("Najmanji odnos je na poziciji " + (minindex+1) + " iznosi :" + min + " a najveci se nalazi na poziciji " + (maxindex+1) + " i iznosi " + max);
				
		
		
	}

	public static void main(String[] args) {
	
		int[] visina = {1,2,3,4,5};
		int[] tezina = {1,2,3,4,5};
		
		odnos(visina,tezina);
		
		

	}

}
