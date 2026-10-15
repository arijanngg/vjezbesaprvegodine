package novi;

public class zadnji11 {

public static void korjen ( int n) {
	
	int korjen = 0;
	while (n> 10) {
		int temp = n;
		int zbir = 0;
		
		while (temp > 0) {
			int cifra = temp %10;
			zbir += cifra;
			temp = temp/10;
			
		}
		n=zbir;
	}
	
	
}

	
	
	public static void main(String[] args) {
		
		
		
	}

}
