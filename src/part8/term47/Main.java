package part8.term47;

import java.util.Random;

public class Main {
	
	/**
	 * Random関数の悪い例
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 2 * (Integer.MAX_VALUE / 3);
		int low = 0;
		
		for (int i = 0; i < 1000000; i++)
			if (random(n) < n/2)
				low++;
		
		System.out.println(low);
		
		//再現できず・・・
		//n = 4;
		//for (int i = 0; i < 200; i++)
		//	System.out.print(random(n) + " ");
	}
	
	private static final Random rnd = new Random();
	
	static int random(int n) {
		return Math.abs(rnd.nextInt()) % n;
	}

}
