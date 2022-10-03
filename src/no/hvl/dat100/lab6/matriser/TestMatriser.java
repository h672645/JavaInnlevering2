package no.hvl.dat100.lab6.matriser;

public class TestMatriser {

	public static void main(String[] args) {


		int[][] matrise = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] nyMatrise = Matriser.skaler(2, matrise);
		
		System.out.println(matrise);
		System.out.println(nyMatrise);		
		
		for(int[] i: matrise) {
			
			for(int k: i) {
				System.out.print(k + " ");
				
				
			}
		}
		
		System.out.println();
		
		for(int[] i: nyMatrise) {
			for(int k: i) {
				System.out.print(k + " ");
				}
		}
		System.out.println();
		System.out.println(matrise);
		System.out.println(nyMatrise);		
		
		
	}

}
