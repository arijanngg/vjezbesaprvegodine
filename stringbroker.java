package zz;

public class stringbroker {

	public static int bilans (String s) {
		
		String[] transakcije = s.split(" ");
		int suma = 0;
		
		for (String t : transakcije) {
			char tip = t.charAt(0);
			int iznos = Integer.parseInt(t.substring(1));
			
			if(tip == 'S') {
				suma+=iznos;
			}else if(tip == 'B') {
			
				suma -=iznos;
			}
				
			
		}
		return suma;
		
	}
	
	
	
	public static void main(String[] args) {
		String[][] trades = {
	            {"S50 S40 B50 B100", "B200 S100", "S30 S70"},
	            {"B10 B20 S50", "S500 B300", "B100 B50 S20"},
	            {"S100 S200 B50", "B80 B20", "S60 B60"}
	        };

		int [][] rezultat = new int [trades.length][trades[0].length];
		
		for(int i = 0 ; i < trades.length; i ++) {
			for(int j =  0 ; j < trades[0].length; j ++) {
				rezultat [i][j] = bilans(trades[i][j]);
			}
		}
		
		System.out.println("bilans matrica ");
		for(int i = 0 ; i < rezultat.length; i ++) {
			for(int j = 0 ; j < rezultat[0].length; j ++) {
				System.out.print(rezultat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
