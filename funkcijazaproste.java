package zz;

public class funkcijazaproste {
	
	public static boolean prosti(int n) {
		
		if(n<2) {
			return false ;
		}
		for(int i = 2; i <= n/2 ; i ++) {
			if(n%i == 0 ) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
int n = 5;

if(prosti(n)) {
	System.out.println("PRosti");
	
}

	}

}
