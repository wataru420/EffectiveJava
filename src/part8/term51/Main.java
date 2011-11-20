package part8.term51;


public class Main {

	/**
	 * Stringの結合テスト
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000000; i++) {
			test1(i);
		}
		System.out.println("String : " + (System.currentTimeMillis() - start) + "ミリ秒");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000000; i++) {
		    test2(2);
		}
		System.out.println("StringBuffer : " + (System.currentTimeMillis() - start) + "ミリ秒");
	}

	public static String test1(int i) {
		String str = "文字列１" + i + "文字列２";
		return str;
	}
	
	public static String test2(int i) {
		StringBuffer sb = new StringBuffer();
		sb.append("文字列１");
		sb.append(i);
		sb.append("文字列２");
		return sb.toString();
	}
	
}
