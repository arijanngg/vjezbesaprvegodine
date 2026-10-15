package zz;

public class podniz {
	 public static void vrsta(int[][] matrica) {

	        int najboljiRed = 0;
	        int maxDuzina = 0;

	        for (int i = 0; i < matrica.length; i++) {

	            int trenutna = 1;
	            int lokalniMax = 1;

	            for (int j = 1; j < matrica[0].length; j++) {
	  
	            if(matrica[i][j]>matrica[i][j-1]) {
	            	trenutna ++;
	            }else {
	            	trenutna =1;
	            	
	            }
	            	if ( trenutna > lokalniMax) {
	            		lokalniMax=trenutna;
	            	}
	            	
	            }
	            if( lokalniMax>maxDuzina) {
	            	maxDuzina = lokalniMax;
	            	najboljiRed =i;
	            	
	            }
	        }
	        System.out.println("Red sa najdužom rastućom sekvencom:");

	        for (int j = 0; j < matrica[0].length; j++) {
	            System.out.print(matrica[najboljiRed][j] + " ");
	        }
	    
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
