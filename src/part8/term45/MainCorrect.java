package part8.term45;

import java.util.HashSet;
import java.util.Set;

public class MainCorrect {

	/**
	 * For文の中で使う変数のスコープを最小限にすることで、間違いを減らせる。
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
		
		for (String i : hs1) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("--------------");
		
		for (String i : hs2) {
			System.out.print(i + " ");
		}
	}

}
