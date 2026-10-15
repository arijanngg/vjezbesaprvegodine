package proba;

public class CetvrtiZadatak {

	public static void main(String[] args) {

		
		int nasumican_broj = (int)(Math.random()*9);
		
		System.out.println("Random broj koji se generisao je : " + nasumican_broj);
		
		if (nasumican_broj % 2 == 0) {
			System.out.println("Portal se otvara");
		} else {
		System.out.println("Portal ostaje zatvoren");
		}
		
	}

}
/* generisati random broj i ukoliko je paran otvara se portal ako nije ostaje yatvoren*/