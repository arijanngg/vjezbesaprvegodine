package matrice;

public class jedanaesti {
	
	public static int droneudaljenost (int x, int y, int[] p_x, int[] p_y) {
		
		int rastojanje = 0;
		for (int i = 0 ; i < p_x.length;i ++) {
			if (x > 0  && y > 0 ) {
				int dx = p_x[i] - x;
				int dy = p_y[i] - y;
				double distanca = Math.sqrt(dx * dx + dy * dy);
				rastojanje += distanca * 2 ;
				
				
			}
			
		}
		return rastojanje;
		
	}
	
	
	
	public static void main(String[] args) {

	}

}
