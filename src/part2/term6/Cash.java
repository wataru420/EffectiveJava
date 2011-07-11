package part2.term6;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Cash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer key = new Integer(1);
		
		//HashMapでやるかWeakHashMapでやるかで動作の違いを確認
		Map cash = new HashMap<Integer, String>();
		//Map cash = new WeakHashMap<Integer, String>();
		cash.put(key, "これ、いつまで残るの？");
		
		//キー値の参照にnullを設定するとどうなるか
		key = null;
		
		//強制的にGCを発生させる。
		System.gc();
		
		System.out.println(cash.get(new Integer(1)));
	}

}
