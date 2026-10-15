package Vjeybe;

import java.util.Scanner;

public class peti {

	public static void main(String[] args) {
/* U jednoj privatnoj školi uvedeno je pravilo kojim se određuje iznos popusta koji ostvaruju
učenici prilikom upisa u narednu školsku godinu. Učenici sa odličnim uspjehom ostvaruju
popust od 40% ukupnog iznosa školarine, sa vrlodobrim 20% a sa dobrim 10%. Takođe,
učenici koji su osvojili nagradu na nekom od državnih takmičenja ostvaruju popust od
30% ukupnog iznosa školarine. Ukoliko neki učenik ispunjava dva kriterijuma za popust
primjenjuje se kriterijum po kome je popust veći. Na osnovu punog iznosa školarine,
prosječne ocjene učenika i informacije o nagradama sa takmičenja odrediti iznos koji
učenik treba da plati pri upisu u narednu školsku godinu.
Ulaz: U prvoj varijabli nalazi se pun iznos školarine (realan broj), u drugoj prosječna
ocjena učenika (realan broj od 2.0 do 5.0) a u trećoj 0 ukoliko učenik nema nagradu ili 1
ukoliko je ima.
Izlaz: Iznos školarine koju učenik treba da plati (zaokružen na najbliži cio broj) navodi se
u jednoj linije standardnog izlaza.*/
		
		
		
Scanner in = new Scanner(System.in);
        
        double skolarina = in.nextDouble();
        double prosjek = in.nextDouble();
        int nagrada = in.nextInt();
        
        double popust = 0.0;
        
        // Popust po prosjeku
        if (prosjek >= 4.5) {
            popust = 0.40;
        } else if (prosjek >= 3.5) {
            popust = 0.20;
        } else if (prosjek >= 2.0) {
            popust = 0.10;
        }
        
        // Popust zbog nagrade — ako je veći, koristi ga
        if (nagrada == 1) {
            if (0.30 > popust) {
                popust = 0.30;
            }
        }
        
        double iznos = skolarina * (1.0 - popust);
        
        long zaokruzen = Math.round(iznos);
        System.out.println(zaokruzen);
        
        in.close();
				
		
		
	}

}
