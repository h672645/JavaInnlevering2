package no.hvl.dat100.lab6.matriser;

public class TestMatriser {

	public static void main(String[] args) {

		int[][] matrise = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrise2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] speilet = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int[][] nyMatrise = Matriser.skaler(2, matrise);

		int[] b0 = { 10, 11, 12 };
		int[] b1 = { 13, 14, 15 };
		int[] b2 = { 16, 17, 18 };
		int[][] b = { b0, b1, b2 };

		System.out.println(matrise);
		System.out.println(nyMatrise);

		for (int[] i : matrise) {

			for (int k : i) {
				System.out.print(k + " ");

			}
		}
		System.out.println();
		System.out.println();

		for (int[] i : matrise) {
			for (int k : i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for (int[] i : speilet) {
			for (int k : i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		nyMatrise = Matriser.speile(matrise);
		for (int[] i : nyMatrise) {
			for (int k : i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		Matriser.skrivUt(matrise2);

		System.out.println();

		Matriser.skrivUt(b);

		System.out.println();

		int[][] multiMatrise = Matriser.multipliser(matrise, b);
		for (int[] i : multiMatrise) {
			for (int k : i) {
				System.out.print(k + " ");
			}
			System.out.println();

		}
	}
}
