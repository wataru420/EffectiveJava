package part8.term48;

import java.math.BigDecimal;


public class Main2Correct {
	
	/**
	 * 浮動小数点数の問題をBigDecimalで解決
	 * @param args
	 */
	public static void main(String[] args) {
		final BigDecimal TEN_CENT = new BigDecimal(".10");
		
		BigDecimal funds = new BigDecimal("1.00");
		int itemsBought = 0;
		for (BigDecimal price = TEN_CENT; funds.compareTo(price) >= 0; price = price.add(TEN_CENT)) {
			funds = funds.subtract(price);
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Money left over: $" + funds);
	}

}
