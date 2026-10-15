package zz;

public class rekurzija3 {

	public static int zbir(int n ) {
		if(n==1) {
			return 1;
		}
		return n + 	zbir(n-1);
	}
	public static int stepen ( int a, int n ) {
		if(n==0) {
			return 1;
		}
		return a*stepen(a,n-1);
		
	}
	public static int brojcifara(int n) {
		if(n<10) {
			return 1;
		}
		return n +brojcifara(n/10);
	}
	public static int zbircifara(int n ) {
		if(n == 0) {
			return 0  ;
		}
		return n%10 + zbircifara(n/10);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
