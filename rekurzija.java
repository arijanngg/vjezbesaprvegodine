package zz;

public class rekurzija {

	public static int faktorijel(int n ) {
		if(n==0 || n ==1) {
			return 1;
		}else {
			return n*faktorijel(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		int rezultat = faktorijel(5);

	    System.out.println("Faktorijel je: " + rezultat);

	}

}
