package zz;

public class rekurzija2 {

	public static int kvadrat(int n, int brojac) {
		if(brojac == 0) {
			return 0;
		}
		return n + kvadrat(n,brojac-1);
	}
	
	
	public static void main(String[] args) {
		 int broj = 5;

	        int rezultat = kvadrat(broj, broj);

	        System.out.println("Kvadrat broja je: " + rezultat);
	    

	}

}
