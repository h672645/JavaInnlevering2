package no.hvl.dat100.lab5.tabeller;

public class TestSide {

	public static void main(String[] args) {
		
		int[] testTabell = {1,2,3,4,5,6,7,8,9,10};
		int[] testTabell1 = {1,2,3,4,5,6,7,8,9,10};
		int[] testTabell2 = {1,2,3,4,5,6,7,8,9,10};
		
		int ut = Tabeller.summerFor(testTabell);
		System.out.println(ut);
		
		ut = Tabeller.summerWhile(testTabell);
		System.out.println(ut);
	
		
		ut = Tabeller.summerUtvidet(testTabell);
		System.out.println(ut);
		
		boolean finnestallet = Tabeller.finnesTall(testTabell, 12);
		System.out.println(finnestallet);
		
		int posisjon = Tabeller.posisjonTall(testTabell, 10);
		System.out.println("Posisjon i tabellen \n(-1 betyr at det ikke finnes): " + posisjon);
		
		int[]revTabell = Tabeller.reverser(testTabell);
		for(int i: revTabell) {
			System.out.print(i + " ");
		}
		
		boolean ersortert = Tabeller.erSortert(testTabell);
		System.out.println("\n" + ersortert);
		
		int[]samansattTabell = Tabeller.settSammen(testTabell1, testTabell2);
		
		for(int i = 0; i<samansattTabell.length; i++){
			System.out.print(samansattTabell[i] + " ");
		}

	}

}
