package drugagod;

public class peti {

	public static void main(String[] args) {

		int broj = 52;
		
		int a = broj/10;
		int b = broj%10;
		
		if (a>b) {
			System.out.println(a-b);
			
		}else if (a<b) {
			System.out.println(a+b);
		}else {
			System.out.println(a*b);
		}
		
		
		
	}

}
