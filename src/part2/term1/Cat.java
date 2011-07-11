package part2.term1;

/**
 * Staticファクトリーメソッドを利用すればインスタンス生成を減らせる
 */
public class Cat {
	
	private String name;
	
	static final Cat KIKI = new Cat("KIKI");
	static final Cat JIJI = new Cat("JIJI");
	
	private Cat(String name) {
		this.name = name;
	}
	
	public Cat getKiki() {
		return KIKI;
	}
	
	public Cat getJiji() {
		return JIJI;
	}

	@Override
	public String toString() {
		return "Cat name is " + this.name;
	}
}
