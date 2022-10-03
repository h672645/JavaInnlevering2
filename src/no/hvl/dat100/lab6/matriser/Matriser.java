package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] i : matrise) {

			for (int k : i) {

				System.out.print(k + " ");

			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String utTxt = "";

		for (int[] i : matrise) {

			for (int k : i) {

				utTxt += k + " ";

			}
			utTxt += "\n";
		}
		return utTxt;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {

			nyMatrise[i] = new int[matrise[i].length];
			for (int k = 0; k < matrise.length; k++) {

				nyMatrise[i][k] = (matrise[i][k]) * tall;

			}

		}

		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean sjekk = true;

		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {

				if (a[i][k] != b[i][k]) {
					sjekk = false;
				}

			}

		}
		if (sjekk == true) {
			System.out.println("Matrisene er like");
		}
		if (sjekk == false) {
			System.out.println("Matrisene er ikke like");
		}
		return sjekk;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][];
		int temp2 = 0;

		for (int l = 0; l < matrise.length; l++) {
			nyMatrise[l] = new int[matrise[l].length];
		}

		for (int i = 0; i < matrise.length; i++) {
			int temp = 0;

			for (int k = 0; k < matrise[i].length; k++) {
				nyMatrise[temp][temp2] = matrise[i][k];
				temp++;
			}

			temp2++;
		}

		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] nyMatrise = new int[a.length][];

		for (int l = 0; l < b.length; l++) {
			nyMatrise[l] = new int[b[l].length];
		}

		int temp2 = 0;
		int temp = 0;
		int sum = 0;

		for (int i = 0; i < nyMatrise.length; i++) {
			temp = 0;
			for (int k = 0; k < nyMatrise[i].length; k++) {

				sum = 0;
				
				for (int m = 0; m < a.length; m++) {
					sum += (a[temp][m] * b[m][temp2]);
					
				}
				nyMatrise[i][k] = sum;
				temp++;
			}
			
			temp2++;
		}
		
		nyMatrise = speile(nyMatrise);

		return nyMatrise;

	}
}
