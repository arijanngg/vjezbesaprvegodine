package predavanje;

import java.util.Scanner;

public class prvi {

	public static void main(String[] args) {

		
		int a, b , c , min , max;
		
		
		Scanner u = new Scanner (System.in);
		
		System.out.print("Unesi a,b i c ");
		a = u.nextInt();
		b = u.nextInt();
		c = u.nextInt();
		
		
		min = a;
		if(min>b) 
			min = b;
		 if (min>c)
		min=c;
		 
		 max = a;
			if(max<b) 
				max = b;
			 if (max<c)
			max=c; 
		 
		
		//System.out.printf("Najmanji broj je  %d, a najveci broj je %d", min,max);
		
		System.out.println("najmanji broj je " + min + " a najveci broj je " + max);
		
	}

}
