package zz;

public class pr4 {

	
	
	public static void main(String[] args) {
        int[][] a = {
                {2, 3, 1},
                {4, 1, 2},
                {1, 5, 2}
            };

        int redovi = a.length; 
        int kolone = a[0].length;
        
        int maxred = 0 ;
        int maxproizvod = 1;
        
        for(int i = 0 ; i < redovi ; i ++) {
        	int proizvod = 1;
        	for(int j = 0 ; j < kolone ; j ++) {
        		proizvod *= a[i][j];
        	}
        	if(proizvod>maxproizvod) {
        		maxproizvod = proizvod;
        		maxred = i;
        	}
        }
        
        int minkol = 0;
        int minzbir = 0;
        
        for(int j = 0 ; j < kolone ; j ++) {
        	int zbir = 0;
        	for(int i = 0 ; i < redovi ; i ++) {
        		zbir += a[i][j];
        	}
        	if(zbir < minzbir) {
        		minzbir = zbir;
        		minkol = j;
        	}
        }
        int rezultat = 0;
        
        for ( int j = 0 ; j < kolone ; j ++) {
        	rezultat += a [maxred][j];
        }
        for(int i = 0 ; i < redovi ; i ++) {
        	rezultat += a[i][minkol];
        }
        System.out.println("zbir reda i kolone je : " + rezultat );
        
	}

}
