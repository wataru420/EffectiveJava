package part8.term45;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	/**
	 * While文で使う変数のスコープが広いため、間違えても気づきにくい。
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> hs1 = new HashSet<String>();
		hs1.add("na_ga");
		hs1.add("hentai");
		hs1.add("ero");
		hs1.add("chikan");
		
		Set<String> hs2 = new HashSet<String>();
		hs2.add("79yuuki");
		hs2.add("syachiku");
		hs2.add("nero");
		
		Iterator<String> i = hs1.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		System.out.println("");
		System.out.println("--------------");
		
		Iterator<String> i2 = hs2.iterator();
		while (i.hasNext()) {
			System.out.print(i2.next() + " ");
		}
	}

}
