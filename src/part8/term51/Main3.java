package part8.term51;


public class Main3 {

	/**
	 * Stringの結合テスト２
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 200000; i = i * 10) {
			test(i);
		}
		
	}
	
	public static void test(int time) {
		System.out.println("loop time is :" + time);
		long start = System.currentTimeMillis();
		String test1 = "";
		for(int i = 0; i < time; i++) {
			test1 += "文字列" + 1;
		}
		System.out.println("String : " + (System.currentTimeMillis() - start) + "ミリ秒");
		
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < time; i++) {
		    sb.append("文字列");
		    sb.append(i);
		}
		sb.toString();
		System.out.println("StringBuffer : " + (System.currentTimeMillis() - start) + "ミリ秒");
	}
	
}
