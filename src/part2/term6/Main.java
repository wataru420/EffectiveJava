package part2.term6;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000000; i++) {
			for(int j = 0; j < 1000000000; j++) {
		    stack.push(new String("仕事"));
		    stack.pop();
		    stack.push(new String("仕事"));
		    stack.pop();
			}
		}
		System.out.println("Stack : " + (System.currentTimeMillis() - start) + "ミリ秒");
	}

}
