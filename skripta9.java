package zz;

public class skripta9 {


    public static void katapulti(int[][] matrica, double D, int HD) {
    	
    	int brojkatapulta = 0;
    	int ukupannapad=0;
    	
    	for(int i = 0 ; i < matrica.length ; i ++) {
    		int x = matrica[i][0];
    		int y = matrica[i][1];
    		int attack = matrica[i][2];
    		
    		double udaljenost = Math.sqrt(x*x + y*y);
    		if(udaljenost<=HD) {
    			brojkatapulta ++;
    			ukupannapad += attack;
    			
    					
    		}
    		
    	}
    	 System.out.println("Katapulti koji mogu pogoditi dvorac: " + brojkatapulta);

         System.out.println("Ukupan napad: " + ukupannapad);

         if (ukupannapad >= HD) {

             System.out.println("Dvorac ce biti srusen.");

         } else {

             System.out.println("Dvorac prezivljava.");
         }
     }
    	
    	
    	
    
	
	
	public static void main(String[] args) {
		
		  int[][] katapulti = {

		            {3, 4, 20},
		            {10, 10, 50},
		            {1, 2, 30},
		            {6, 8, 40}
		        };

		        double D = 5;

		        int HD = 40;

		        katapulti(katapulti, D, HD);

	}

}
