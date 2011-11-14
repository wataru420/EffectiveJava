package part8.term48;


public class Main2 {
	
	/**
	 * 浮動小数点数の問題
	 * @param args
	 */
	public static void main(String[] args) {
		
		double funds = 1.00;
		int itemsBought = 0;
		for (double price = .10; funds >= price; price += .10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Money left over: $" + funds);
	}

}
