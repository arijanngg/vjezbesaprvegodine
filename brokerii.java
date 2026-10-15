package zz;

public class brokerii {
	public static int [][] bilans ( String [][] matrica){
		
		int redovi = matrica.length; 
		int kolone = matrica[0].length; 
		int[][]nova= new int [redovi][kolone];
		
		for(int i = 0 ;i <matrica.length; i ++) {
			for(int j = 0 ; j <matrica[0].length; j ++) {
				String s = matrica[i][j];
				int suma = 0;
				int x = 0;
				while(x<s.length()) {
					char c = s.charAt(x);
					int broj = 0 ;
					x++;
					while(x<s.length() && s.charAt(x)!=' ') {
						char f = s.charAt(x);
						broj = broj*10+ (f-'0');
						x++;
					}
					if(c=='S') {
						suma += broj;
					}else if(c=='B') {
						suma-= broj;
					}
	x++;
				}
	nova[i][j] = suma;
				
			}
		}
		return nova;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		String[][] trades =  {
				{"S50 S40 B50 B100", "B200 S100", "S30 S70"}, 
						 {"B10 B20 S50", "S500 B300", "B100 B50 S20"},
						 {"S100 S200 B50", "B80 B20", "S60 B60"} };
			int[][]rezultat = bilans(trades);
			System.out.println("Nova matrica je ");
			for(int i = 0 ; i < rezultat.length; i ++) {
				for(int j= 0 ; j < rezultat[0].length; j ++) {
					System.out.print(rezultat[i][j] + " ");
				}
				System.out.println();
			}
	}

}
