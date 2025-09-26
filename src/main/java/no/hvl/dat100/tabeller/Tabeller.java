package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print(tabell);

	}

	// b)
	public static String tilStreng(int[] tabell) {

        String lagString = "[";
        for (int i = 0; i < tabell.length; i++) {
            lagString += Integer.toString(tabell[i]);
            if ( i < tabell.length - 1) {
                lagString += ",";
            }
        }
        lagString += "]";
        return lagString;

	}

	// c)
	public static int summer(int[] tabell) {

        int sum = 0;
		for (int i : tabell) {
            sum += i;
        }
        return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i : tabell){
            if (i == tall) return true;
            }
        return false;

    }


	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++){

            if (tabell[i] == tall) {

                return i;

            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

        int[] revers = new int [tabell.length];
        int j = 0;
        for (int i = tabell.length -1; i >= 0; i--) {
            revers[j] += tabell[i];
            j++;
        }

        return revers;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

        for (int i = 0; i < tabell.length -1; i++) {

            if (tabell[i] > tabell[i+1]) {
                return false;
            }
        }

        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] sammensatt = new int[tabell1.length + tabell2.length];
        int j = 0;

        for (int i : tabell1) {
            sammensatt[j] += i;
            j++;
        }

        for (int i : tabell2) {
            sammensatt[j] += i;
            j++;
        }

        return sammensatt;
	}
}
