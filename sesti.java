package VjezbaZaIspit;

public class sesti {

	public static void main(String[] args) {

		/*Dimenzije pravougaonika su 543 i 130. Skicirati algoritam (napisati program) koji računa koliko kvadrata stranice 65
		// je moguće izrezati iz tog pravougaonika.*/
		
		
		int a = 543;
		int b = 130;
		int c = 65;
		
		int P = a * b ;
		int R = c^2;
		
		int K = P / R;
		
		System.out.println("Moze stati : " + K);
		
		
		
		
	}

}
