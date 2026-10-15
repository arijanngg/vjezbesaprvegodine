import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// Napisati JAVA program koji prebrojava koliko u tekstu ima
		//karaktera koji nijesu mala slova i cifre

		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi string");
		String recenica = sc.nextLine();
		
		
		int brojac = 0;
		
		
		
		for ( int i = 0; i < recenica.length(); i ++) {
			
			char c = recenica.charAt(i);
			
			
			if ( !((c >= 'a' && c<= 'z'  ) || (c >= '0' && c <= '9'))) {
				
				brojac ++;
				
				
			}
			
			
		}
		
		
		System.out.println("Broj karaktera koji nisu mala slova i cifre su " + brojac);
		
		
	}

}
