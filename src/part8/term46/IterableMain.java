package part8.term46;


public class IterableMain {
	
	/**
	 * Iterableを実装したクラスの使い方
	 * @param args
	 */
	public static void main(String[] args) {
		
		IterableSample sample = new IterableSample("これがIterableの力だ");
		
		for (Character c : sample)
			System.out.println(c);
	}

}
