package proba;

public class DrugiZadatak {

	public static void main(String[] args) {
		
		/* Date su koordinate donje desne i gornje lijeve ivice zida (pravougaonik).
		 * Napisati program koji racuna povrsinu i obim zida.*/
		
		//koordinate
		//donja desna
		int x1 = 7; 
		int y1 = 2;
		
		//gornja lijeva 
		int x2 = 3 ;
		int y2 = 5 ;
		
		//Math je core ( bazicna ) klasa, sadrzi  metode za laksi rad i matematicke operacije
		int duzina_zida = Math.abs (x1 - x2);		
		int visina_zida = Math.abs (y1 - y2);

		double porvsina_zida_double = visina_zida * duzina_zida ;
		
		int povrsina_zida = visina_zida * duzina_zida ;
		int obim_zida = 2 * (visina_zida + duzina_zida );
		
		System.out.println("Povrsina zida je : " + povrsina_zida);
		System.out.println("Obim zida je : " + obim_zida  );
		
		System.out.println("Precizna povrsina zida je: " +  porvsina_zida_double);
		
		
		
	}

}
