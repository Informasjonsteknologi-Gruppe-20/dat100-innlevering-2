package no.hvl.dat100.tabeller;

import java.util.stream.IntStream;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println(tilStreng(tabell));
	}

	// b)
	public static String tilStreng(int[] tabell) {
		var li = IntStream.of(tabell);
		return "["+String.join(",",li.mapToObj(Integer::toString).toList())+"]";
	}

	// c)
	public static int summer(int[] tabell) {
		return IntStream.of(tabell).sum();
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		return IntStream.of(tabell).anyMatch(v->v==tall);
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for(int i = 0;i<tabell.length;i++){
			if(tabell[i] == tall) return i;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] new_tabell = new int[tabell.length];
		for(int i = 0;i<tabell.length;i++){
			new_tabell[i] = tabell[tabell.length-i-1];
		}
		return new_tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int last_num = 0;
		for(int i : tabell){
			if(i > last_num){
				last_num = i;
			}else{
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int total_length = tabell1.length+tabell2.length;
		int[] new_list = new int[total_length];
		System.arraycopy(tabell1, 0, new_list, 0, tabell1.length);
		System.arraycopy(tabell2, 0, new_list, tabell1.length, tabell2.length);
		return new_list;
	}
}