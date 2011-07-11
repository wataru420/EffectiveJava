package part2.term5;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SlowPerson sp = new SlowPerson();
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000000; i++) {
		    sp.isBabyBoomer();
		}
		System.out.println("SlowPerson : " + (System.currentTimeMillis() - start) + "ミリ秒");
		
		FastPerson fp = new FastPerson();
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000000; i++) {
		    fp.isBabyBoomer();
		}
		System.out.println("FastPerson : " + (System.currentTimeMillis() - start) + "ミリ秒");

	}
}
