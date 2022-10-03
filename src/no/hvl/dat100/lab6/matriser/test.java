package no.hvl.dat100.lab6.matriser;

public class test {

	public static void main(String[] args) {
		
		int[][] test = {{3,2,1},{6,5,4},{9,8,7}};
		
		int[][] matrise = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] nyMatrise = Matriser.skaler(2, matrise);
		
		for(int[] i: nyMatrise) {
			for(int k: i) {
				System.out.print(k + " ");
			}
		}
		
		System.out.println();
		
		int[][] nyMatrise2 = Matriser.speile(test);
		
		for(int[] i: nyMatrise2) {
			for(int k: i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
	}
}
