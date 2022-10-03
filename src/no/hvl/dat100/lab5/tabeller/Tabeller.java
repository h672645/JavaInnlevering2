package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.println("Tabellen inneholder:");
		for(int i:tabell) {
			System.out.print(i + " ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String utTxt = "[";
		for (int i = 0; i < tabell.length; i++) {
			
			utTxt = utTxt + tabell[i];
			if(i < tabell.length-1) {
				utTxt = utTxt + ",";
			}
		}
		utTxt = utTxt + "]";
		
		return utTxt;
	}

	// c)
	public static int summerUtvidet(int[] tabell) {

		int sum = 0;
		for (int i: tabell) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i: tabell) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int summerFor(int[] tabell) {

		int sum = 0;
		for (int i = 0 ; i<tabell.length; i++) {
			sum = sum + tabell[i];
		}
		return sum;
	}
	public static int summerWhile(int[] tabell) {
		
		int sum = 0;
		int i = 0;
		while(i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int i = 0;
		boolean sjekk = false;
		while(i < tabell.length) {
			if(tall == tabell[i]) {
				sjekk = true;
			}
			i++;
		}
		return sjekk;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;
		int posisjon = -1;
		while(i < tabell.length) {
			if(tall == tabell[i]) {
				posisjon = i;
			}
			i++;
		}
		
		return posisjon;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revTabell = new int[tabell.length];
		int revTabellTellar = 0;
		for(int i = tabell.length-1; i >= 0; i--) {
			
			revTabell[revTabellTellar] = tabell[i];
			
			revTabellTellar++;
		}
		
		return revTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sjekk = true;
		
		for(int i = 0; i < tabell.length-1; i++) {
			if(tabell[i] < tabell[i+1]) {
			} else {
			sjekk = false;
			}
		}
		return sjekk;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		
		int lengde = tabell1.length+tabell2.length;
		int[] nyTabell = new int [lengde];
		int tabellIndeks = 0;
		
		for(int i = 0; i < tabell1.length; i++) {
			
			nyTabell[tabellIndeks] = tabell1[i];
			tabellIndeks++;
		}
		
		for(int k = 0; k < tabell2.length; k++) {
			
			nyTabell[tabellIndeks] = tabell2[k];
			tabellIndeks++;
		}
		
		return nyTabell;
		
	}
}
