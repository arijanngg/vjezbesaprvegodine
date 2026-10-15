package zz;

public class skriptasedmi {

	public static double prosjek (int[][] matrica, int red) {
		
		int suma = 0;
		
		for(int j = 0 ; j < matrica[0].length; j ++) {
			suma+= matrica[red][j];
		}
		return (double) suma/matrica[0].length;
		
	}
	public static double prosjekpredmeta (int[][]matrica, int kolona) {
		
		int suma = 0;
		for(int i = 0 ; i <matrica.length; i ++) {
			suma += matrica[i][kolona];
			
		}
		return (double) suma/matrica.length;
		
	}
	public static int najbolji (int[][] matrica) {
		
		int maxindex=  0;
		double maxprosjek =prosjek(matrica,0);
		
		for(int i = 0 ; i < matrica.length; i ++) {
			double p = prosjek(matrica,i);
			if(p>maxprosjek) {
				maxprosjek = p;
				maxindex=i;
			}
		}
		return maxindex;
		
	}
	public static void studentisa5(String[] studenti, int[][] matrica) {
		System.out.println("Studenti sa ocjenom 5 su : ");
		 	for(int i = 0 ; i < matrica.length; i ++) {
		 		for(int j = 0 ; j <matrica[0].length; j++) {
		 			if(matrica[i][j] == 5) {
		 				System.out.println(studenti[i]);
		 				break;
		 			}
		 		}
		 	}
	}
	
	
	
	public static void main(String[] args) {
		String[] studenti = {"Ana", "Marko", "Ivana"};

        int[][] matrica = {
            {6, 7, 8},
            {10, 9, 8},
            {5, 6, 7}
        };
        
        System.out.println("Prosjek ane :" + prosjek(matrica,0));
        System.out.println("prosjek prvog predmeta" + prosjekpredmeta(matrica,0));
        
        int best = najbolji(matrica);
        System.out.println("Najbolji student " + studenti[best]);
        
        studentisa5(studenti,matrica);
        
	}

}
