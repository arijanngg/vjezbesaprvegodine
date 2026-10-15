package matrice;

public class cetiri {

	public static void main(String[] args) {
	
		int [][] zaposleni = {
				
				{5,4,5},	
				{6,5,1},
				{4,3,2}
		};
		
		int maxsuma = 0;
		int najbolji = 0 ; 
		
		for (int i = 0 ; i < zaposleni.length ; i ++) {
			int suma = 0;
			for (int j = 0 ; j < zaposleni[i].length; j ++) {
				suma += zaposleni [i][j];
			}
			if (suma > maxsuma ) {
				maxsuma = suma ; 
				najbolji = i;
			}
		}
		System.out.println("Najbolji zaposleni je index " + (najbolji+1));
		System.out.println("Ukupan broj zadataka je " + maxsuma);
	}

}
