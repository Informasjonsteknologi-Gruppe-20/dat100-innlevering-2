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

		StringBuilder builder = new StringBuilder();

		for(int[] array : matrise){
			for(int element : array){
				builder.append(element).append(" ");
			}
			builder.append("\n");
		}
		return builder.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] skalert = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < matrise.length;i++){
			for(int j = 0; j < matrise[i].length;j++){
				skalert[i][j] = matrise[i][j] * tall;
			}
		}
		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length != b.length) return false;
		for(int i = 0;i < a.length; i++){
			if(a[i].length != b[i].length) return false;
			for(int j = 0;j < a[i].length; j++){
				if(a[i][j] != b[i][j]) return false;
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] speilet = new int[matrise.length][matrise[0].length];
		for(int i = 0;i < matrise.length;i++){
			for(int j = 0;j < matrise[i].length;j++){
				speilet[j][i] = matrise[i][j];
			}
		}
		return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];
		for (int i = 0; i < a.length;i++){
			for (int j = 0; j < b.length;j++){
				int sum = 0;
				for(int k = 0; k < a[i].length;k++){
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		return c;
	}
}
