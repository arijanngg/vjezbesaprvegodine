package sortiranje;

public class selectionsortmatrica {

	public static void main(String[] args) {


        int[][] matrica = {
            {5, 2, 9},
            {1, 7, 3},
            {8, 4, 6}
        };
        
        for(int j = 0 ; j < matrica[0].length; j	++) {
        	for(int i  = 0; i < matrica.length -1 ; i ++) {
        int maxindex= i;
        		
        		for(int k=i+1; k < matrica.length; k ++) {
        			if(matrica[k][j]>matrica[maxindex][j]) {
        				maxindex=k;
        						
        			}
        			
        		}
        		int temp = matrica[i][j];
        		matrica[i][j] = matrica[maxindex][j];
        		matrica[maxindex][j]= temp;
        	}
        	
        }    
		
		System.out.println("Nova matrica je " );
		for(int i = 0 ; i < matrica.length; i ++) {
			for (int j = 0 ; j < matrica[i].length; j ++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

}
