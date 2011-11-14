package part8.term48;

import java.math.BigDecimal;

public class Main2Compare {

	/**
	 * intとBigDecimalの性能比較
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000000; i++) {
			intTest();
		}
		System.out.println("int : " + (System.currentTimeMillis() - start) + "ミリ秒");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000000; i++) {
		    bigDecimalTest();
		}
		System.out.println("BigDecimal : " + (System.currentTimeMillis() - start) + "ミリ秒");
	}

	public static int intTest() {
		int funds = 100;
		int itemsBought = 0;
		for (int price = 10; funds >= price; price += 10) {
			funds -= price;
			itemsBought++;
		}
		return itemsBought;
	}

	public static int bigDecimalTest() {
		final BigDecimal TEN_CENT = new BigDecimal(".10");

		BigDecimal funds = new BigDecimal("1.00");
		int itemsBought = 0;
		for (BigDecimal price = TEN_CENT; funds.compareTo(price) >= 0; price = price
				.add(TEN_CENT)) {
			funds = funds.subtract(price);
			itemsBought++;
		}
		return itemsBought;
	}

}
