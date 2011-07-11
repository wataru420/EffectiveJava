package part2.term1;

/**
 * Staticファクトリーメソッドを利用したインスタンス生成
 */
public class Term1_2 {

	private Term1_2() {
		//ここでゴニョゴニョ
		System.out.println("インスタンス生成:" + this.toString());
	}
	
	public static Term1_2 newInstance() {
		return new Term1_2();
	}

}
