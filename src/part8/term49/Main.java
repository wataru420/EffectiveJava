package part8.term49;

import java.util.Comparator;

public class Main {
	
	/**
	 * 不完全なコンパレータ
	 * @param args
	 */
	public static void main(String[] args) {
		
		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			public int compare(Integer first, Integer second) {
				return first < second ? -1 : (first == second ? 0 : 1);
			}
		};
		
		//System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));
		for (int i=0; i<Integer.MAX_VALUE;i++) {
			if (naturalOrder.compare(i, i) != 0) {
				System.out.println(i + ":" + naturalOrder.compare(i, i));
				break;
			}
		}
		System.out.println(naturalOrder.compare(4200000, 4200000));
		
	}

}
