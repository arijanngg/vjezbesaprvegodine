package zz;

public class rekurzijaa {

	public static int rekurzija(int n ) {
		
		if(n==0 || n==1) {
			return 1;
		}
		return n*rekurzija(n-1);
		
	}
	
	public static int kvadrat(double x ,int n ) {
		
		if(n==0) {
			return 1;
		}
		return n + kvadrat(x,n-1);
		
	}
	
	public static void main(String[] args) {
		
		

	}

}
