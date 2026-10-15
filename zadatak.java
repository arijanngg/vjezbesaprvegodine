package zz;

public class zadatak {
	
	public static void matrica (int[]visina , int[] tezina) {
		
		int n = visina.length;
		int m  = tezina.length;
		int [][] matrica = new int [n][2];
		for(int i = 0 ; i < matrica .length; i ++) {
			matrica[i][0] = visina[i];
			matrica[i][1] = tezina[i];
		}
		double maxodnos = Double.MIN_VALUE ; 
		double minodnos=Double.MAX_VALUE;
		int minindex=0;
		int index = 0;
		for( int i = 0 ; i < matrica.length; i ++) {
			double odnos =(double) matrica[i][0] / matrica[i][1];
			if( odnos >maxodnos) {
				maxodnos = odnos;
				index = i;
			}
			if(odnos<minodnos) {
				minodnos = odnos;
				minindex = i;
			}
		}
		System.out.println("Najveci odnos ima osoba na poziciji " + (index+1) + " i iznos " + maxodnos +" a najamanji osoba " + (minindex+1)+ " i iznosi " + minodnos ); 
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
			int []a = {1,2,3,10,5,6};
			int [] b= {1,1,5,4,5,6};
			
			matrica(a,b);

		
	}

}
