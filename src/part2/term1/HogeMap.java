package part2.term1;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/**
 * Staticファクトリーメソッドを利用したインスタンス生成
 * @param <V>
 * @param <K>
 */
public class HogeMap<V, K> extends AbstractMap<K, V> {

	private HogeMap() {
	}
	
	public static <V, K> HogeMap<V, K> newInstance() {
		return new HogeMap<V, K>();
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
