package part8.term48;



public class Main2Correct2 {
	
	/**
	 * 浮動小数点数の問題をintで解決
	 * @param args
	 */
	public static void main(String[] args) {
		int funds = 100;
		int itemsBought = 0;
		for (int price = 10; funds >= price; price += 10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Money left over: " + funds + " cents");
	}

}
