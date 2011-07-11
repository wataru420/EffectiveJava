package part2.term3;

public class Sid {
	private static final Sid INSTANCE = new Sid();
	
	private Sid() {
		System.out.println("Sidは一度しか生成されないはず！");
	}
	
	public static Sid getInstance() {
		return INSTANCE;
	}
	
	public void sing() {
		System.out.println("fuck fuck fuck");
	}
}
