package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
            for (int verdi : rad) {
                System.out.print(verdi + " ");
            }
            System.out.println();
	    }
    }

	// b)
	public static String tilStreng(int[][] matrise) {

		String lagStreng = "";

        for (int[] rad : matrise) {

            for (int verdi : rad) {
                lagStreng += verdi + " ";
            }

            lagStreng += "\n";

        }

        return lagStreng;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int rad = matrise.length;
        int kol = matrise[0].length;

		int[][] skalert = new int[rad][kol];

        for (int i = 0; i < rad; i++) {
            for (int j = 0; j < kol; j++) {
                skalert[i][j] = matrise[i][j] * tall;
            }
        }

        return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

       int rad = 0;
       if (a.length != b.length) return false;

       for (int[] aa : a) {
            int kol = 0;
            for (int aaa : aa) {
                if (aa.length != b[rad].length) return false;
                if (aaa != b[rad][kol]) return false;
                kol++;
            }
            rad++;
        }

		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
