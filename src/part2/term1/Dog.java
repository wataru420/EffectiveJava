package part2.term1;

/**
 * Staticファクトリーメソッドは名前をつけられる
 */
public class Dog {
	
	static final int MALE = 1;
	static final int FEMALE = 2;
	
	private int sex;

	private Dog() {
		//ここでゴニョゴニョ
		System.out.println("インスタンス生成:" + this.toString());
	}
	
	private Dog(int sex) {
		this.sex = sex;
		if (MALE == this.sex)	System.out.println("おす犬生成");
		if (FEMALE == this.sex)	System.out.println("めす犬生成");
	}
	
	public static Dog newDog() {
		return new Dog();
	}
	
	public static Dog maleDog() {
		return new Dog(MALE);
	}
	
	public static Dog femaleDog() {
		return new Dog(FEMALE);
	}

}
