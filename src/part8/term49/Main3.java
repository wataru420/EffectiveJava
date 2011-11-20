package part8.term49;


public class Main3 {

	/**
	 * ボクシングのパフォーマンス測定
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		whithBoxing();
		System.out.println("whithBoxing : " + (System.currentTimeMillis() - start) + "ミリ秒");
		
		start = System.currentTimeMillis();
		noBoxing();
		System.out.println("noBoxing : " + (System.currentTimeMillis() - start) + "ミリ秒");
	}
		
	public static Long whithBoxing() {
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}

	public static long noBoxing() {
		long sum = 0L;
		for (long i = 0L; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}

}
