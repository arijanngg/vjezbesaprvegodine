package zz;

public class pr9 {

	public static void main(String[] args) {
		
		int[] duzine = {2, 5, 3, 10};
        int[] sirine = {4, 1, 6, 2};
        
        int maxpovrsina = 0 ;
        int najboljaduz= 0;
        int najboljasir = 0;
        
        
        for(int i = 0 ; i < duzine.length; i ++) {
        	for(int j = 0 ; j < sirine .length ; j ++) {
        		int povrsina = duzine[i] * sirine[j];
        		if(povrsina > maxpovrsina) {
        			maxpovrsina = povrsina;
        			najboljaduz = duzine[i];
        			najboljasir = sirine[j];
        			
        		}
        	}
        }
		
        System.out.println("Najbolja duzina je : " + najboljaduz);
        System.out.println("Najbolja sirina je : " + najboljasir);
        System.out.println("Max povrsina je : " + maxpovrsina);
        
	}

}
