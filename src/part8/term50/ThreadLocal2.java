package part8.term50;

public class ThreadLocal2 {
	private ThreadLocal2() { } //インスタンス化不可能
	
	public static class Key {// (ケーパビリティ)
		Key() {};
	}
	
	//一意の偽造できないキーを生成する
	public static Key getKey() {
		return new Key();
	}
	
	//名前付き変数に対するカレントスレッドの値を設定する
	public static void set(Key key, Object value) {};
	//名前付き変数に対するカレントスレッドの値を返す
	public static Object get(Key key) {return null;};
	
}
