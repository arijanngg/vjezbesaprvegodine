package ponovnevjezbe;

import java.util.Scanner;

public class dvades1 {

	public static void main(String[] args) {
		
		/*. Nacrtati algoritam (napisati program) koji od zadatog stringa kreira novi string koji se
sastoji bez cifara.*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Napisati neki string sa brojevima i slovima");
		String stari = sc.nextLine();
		String novi = " ";
		
		
		for (int i = 0; i< stari.length(); i++) {
			
			char c =  stari.charAt(i);
			
			if(c>= '0' && c <= '9') {
				
			novi = novi;	
				
			}else {
				
				
					
					novi += c;
					
				
				
			}
			
			
		}
		
		
		System.out.println(" novi string je :" + novi); 
		

	}

}
