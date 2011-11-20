package part8.term50;

public class ThreadLocal {
	private ThreadLocal() { } //インスタンス化不可能
	
	//名前付き変数に対するカレントスレッドの値を設定する
	public static void set(String key, Object value) {};
	//名前付き変数に対するカレントスレッドの値を返す
	public static Object get(String key) {return "";};
	
}
