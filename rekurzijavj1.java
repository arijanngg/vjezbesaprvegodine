package rekurzija;

public class rekurzijavj1 {

	public static int zbircifre(int n) {
		
		int rezultat = 0 ; 
		while(n>10) {
			int broj = n %10;
			rezultat += broj ;
			n = n /10;
		}
		return rezultat+n;
	}
	public static int zbircifre(int n) {
		
		 if( n < 10) {
			 return n ;
		 }else {
			 
		return n %10 +zbircifre(n /10);	 
		 }
		
	}	
	
	public static double stepen(double x , int n) {
		double rezultat = 1.0;
		for ( int i = 0 ; i < n; i ++) { 
			rezultat *= x;
		}
		return rezultat;
	}
	
	public static double stependva ( double x , int n) {
		if ( n==0) {
			return 1.0;
		}else {
		return x*stepen (x,n-1);
	}
	}
	
	public static void main(String[] args) {

		
		
		
	}

}
