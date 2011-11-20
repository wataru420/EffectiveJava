package part8.term51;


public class Main2 {

	/**
	 * Stringの結合テスト２
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String test1 = "";
		for(int i = 0; i < 100000; i++) {
			test1 += "文字列" + 1;
		}
		System.out.println("String : " + (System.currentTimeMillis() - start) + "ミリ秒");
		
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100000; i++) {
		    sb.append("文字列");
		    sb.append(i);
		}
		sb.toString();
		System.out.println("StringBuffer : " + (System.currentTimeMillis() - start) + "ミリ秒");
	}
	
}
